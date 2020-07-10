import java.io.*;
import java.util.Arrays;

public class SplitCombine {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/liujunjie12138/Desktop/21.IO的副本/doc/WIN.mp3");
        System.out.println(file.length());
        int fileCapivity = 8690;
        split(fileCapivity, file);
        File[] files=new File("/Users/liujunjie12138/Desktop/21.IO的副本/doc/split").listFiles();
        System.out.println(files.length);
        mearge(files,file);
    }

    public static void split(int fileCapivity, File file) throws FileNotFoundException {
        if (file.length() == 0) {
            throw new RuntimeException("文件不符合要求");
        }
        byte[] fileByte = new byte[(int) file.length()];

        try {
            InputStream is = new FileInputStream(file);
            is.read(fileByte);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int numFile;
        if (fileByte.length % fileCapivity == 0) {
            numFile = fileByte.length / fileCapivity;
        } else {
            throw new RuntimeException("不符合要求");
        }
        for (int i = 0; i < numFile; i++) {
            String name=file.getName()+"-"+(i+1);
            File file1=new File("/Users/liujunjie12138/Desktop/21.IO的副本/doc/split",name);
            byte eachFile[];

            if (i!=numFile-1){
                eachFile=Arrays.copyOfRange(fileByte,fileCapivity*i,fileCapivity*(i+1));
            }else {
                eachFile=Arrays.copyOfRange(fileByte,fileCapivity*i,fileByte.length);
            }
            try {
                OutputStream fos=new FileOutputStream(file1);
                fos.write(eachFile);
                fos.close();
                System.out.println("输出文件的名称，其文件大小，每个大小是多少"+file1.getName()+"\n"+file1.length()+"\n"+eachFile.length);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static void mearge(File[] file0,File file) throws IOException, FileNotFoundException {
        byte[] bytes=new byte[(int)file.length()];
        String name=file.getName();
        //int count1 =0;
        //int count2 =0;
        File file1=new File("/Users/liujunjie12138/Desktop/21.IO的副本/doc/combine",name);
        for (File file2 : file0) {
            try {
                int count;
                InputStream is = new FileInputStream(file2);
                count=is.read(bytes);
                is.close();
                FileOutputStream os = new FileOutputStream(file1,true);
                os.write(bytes,0,count);
                os.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        System.out.println("输出文件的名称，其文件大小，每个大小是多少"+file1.getName()+"\n"+file1.length()+"\n");
    }
}
