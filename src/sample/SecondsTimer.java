package sample;

import java.util.Timer;

public class SecondsTimer {

	//秒
	public static int seconds = 3;

	public static void main(String[] args) {

		System.out.println(seconds + "秒後に実行します");

		//ミリ秒
		long ms = seconds * 1000;
		
		//タイマー作成
		Timer timer = new Timer();
		
	}

}
