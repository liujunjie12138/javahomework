package club.banyuan;

import club.com.VideoStore;
import club.com.Video;

public class Main{
	public static void main(String[] args){
		VideoStore videoStore=new VideoStore ();
		String film1="黑客帝国";
		String film2="教父";
		String film3="星球大战";

		videoStore.addVideo(film1);
		videoStore.addVideo(film2);
		videoStore.addVideo(film3);

		int film1Mark=4;
		int film2Mark=5;
		int film3Mark=3;
		int film01Mark=2;
		int film02Mark=3;
		int film03Mark=5;

		videoStore.receiveRating(film1,film1Mark);
		videoStore.receiveRating(film2,film2Mark);
		videoStore.receiveRating(film3,film3Mark);
		videoStore.receiveRating(film1,film01Mark);
		videoStore.receiveRating(film2,film02Mark);
		videoStore.receiveRating(film3,film03Mark);

		videoStore.checkOut(film1);
		videoStore.returnVideo(film1);
		videoStore.checkOut(film2);
		videoStore.returnVideo(film2);
		videoStore.checkOut(film3);
		videoStore.returnVideo(film3);

		videoStore.checkOut(film2);
		videoStore.listInventory();



	}
}
// 创建VideoStoreLauncher类，作为程序入口，main方法将测试其他两个类的功能。

// 新增《黑客帝国》、《教父》、《星球大战》3部影片。
// 给每个视频打分。
// 每个视频出租一次，然后归还。
// 列出《教父》租出去后的库存。

// 打印商店的库存，列出每个影片的:

// - 片名
// - 平均评分,
// - 是否借出