package club.banyuan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

     public class WordExample {

        /**
         * 统计每个单词的出现次数，并按照格式输出
         * 单词1=xx次
         * 单词2=xx次
         * 单词3=xx次
         */
        public static final String words = "Shall I compare thee to a summer's day?\n"
                + "Thou art more lovely and more temperate:\n"
                + "Rough winds do shake the darling buds of May,\n"
                + "And summer's lease hath all too short a date:\n"
                + "Sometime too hot the eye of heaven shines,\n"
                + "And often is his gold complexion dimmed,\n"
                + "And every fair from fair sometime declines,\n"
                + "By chance, or nature's changing course untrimmed:\n"
                + "But thy eternal summer shall not fade,\n"
                + "Nor lose possession of that fair thou ow'st,\n"
                + "Nor shall death brag thou wand'rest in his shade,\n"
                + "When in eternal lines to time thou grow'st,\n"
                + "So long as men can breathe or eyes can see,\n"
                + "So long lives this, and this gives life to thee.";
        //拆分字符串，根据 空格 \n , .进行拆分
        //遍历拆分之后的数组，把遍历的字符串存入map中，作为key，单词设置为value
        //保存的时候，先根据数组中的字符串作为key到map中查询，看是否有这个字符串，若是存在则value+1，不存在，则添加这个key
        //遍历完数组之后，map中单词为key，数量为value；

        public static void main(String[] args) {
            String[] split=words.split("|\\?|.|\\n|\\.|:");
            System.out.println(Arrays.toString(split));
            Map<String,Integer> string=new HashMap<>();
            for (String s: split) {
                if (s.length()==0){
                    continue;
                }else if (string.containsKey(s)){
                    string.put(s,string.get(s)+1);
                }else {
                    string.put(s,1);
                }
            }
            System.out.println(string);
        }
    }

