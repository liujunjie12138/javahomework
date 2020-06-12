package club.com;

import club.com.Video;


public class VideoStore{
	Video video[]=new Video[3];
	
	public void addVideo(String filmname){
		for(int i=0;i<video.length;++i)
		{
			if(video[i].name=="0"){
				video[i].name=filmname;
				video[i].flag=1;
			}
		}

	}

//addVideo(String): 添加一个新的电影

	public void checkOut(String filmname)
	{
		for(int i=0;i<video.length;++i){
			if(video[i].name==filmname){
				video[i].flag=0;
				System.out.println(video[i].name+"已经借出去l");
			}
		}
	}
//checkOut(String): 根据片名借出电影

	public void returnVideo(String filmname){
		for(int i=0;i<video.length;++i){
			if(video[i].name==filmname){
				video[i].flag=1;
				System.out.println(video[i].name+"已经归还了");
			}
		}
	}
//returnVideo(String): 归还电影

	public void receiveRating(String filmname,int mark){
		for(int i=0;i<video.length;++i){
			if(video[i]==null){
				video[i].userAverage=mark;
				System.out.println(video[i].name+"的平均分是"+video[i].userAverage);
			}else{
				video[i].userAverage=(video[i].userAverage+mark)/2;
				System.out.println(video[i].name+"的平均分是"+video[i].userAverage);

			}

		}
	}

//receiveRating(String, int) : 设置用户对电影的评分(1~5)，收到评分之后，计算该电影的平均评分，然后保存到Video的评分属性中

	public void listInventory(){
		for(int i=0;i<video.length;++i){
			if(video[i].flag==1)
				System.out.println(video[i].name+"的平均分是"+video[i].userAverage+"没有借出");
			else
				System.out.println(video[i].name+"的平均分是"+video[i].userAverage+"已经借出");

		}
	}
//listInventory(): 列出整个库存的电影。
}