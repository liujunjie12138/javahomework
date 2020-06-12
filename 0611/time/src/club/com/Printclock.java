package club.com;

import club.com.Hour;
import club.com.Minute;
import club.com.Second;


public class Printclock{

	public void setTime(Hour aHour,Minute aMinute,Second aSecond){
		String hour,minute,second;
		hour=aHour.hour+"";
		minute=aMinute.minute+"";
		second=aSecond.second+"";
		System.out.println(hour+":"+minute+":"+second);
	}


	//public void toString(String aHour,String aMinute,String aSecond){

		//System.out.println(hour+":"+minute+":"+second);


	
	public void nextSecond(Hour aHour,Minute aMinute,Second aSecond){
		if(aSecond.second==60){
			aSecond.second=aSecond.second-60;
			aMinute.minute+=1;
			if(aMinute.minute==60){
				aMinute.minute-=60;
				if(0<aHour.hour&&aHour.hour<23)
					aHour.hour++;
				else
					aHour.hour=0;
			}

		}	
		
	}
}