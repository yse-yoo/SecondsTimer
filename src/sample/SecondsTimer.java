package sample;

import java.util.Timer;
import java.util.TimerTask;

public class SecondsTimer {

	//秒
	public static int seconds = 5;

	public static void main(String[] args) {

		System.out.println(seconds + "秒後に実行します");

		//ミリ秒
		long ms = seconds * 1000;
		
		//タイマー作成
		Timer timer = new Timer();
		
		//タイマーのタスク
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("実行しました！");
			}
		};
			
		//タイマーのスケジュール
		timer.schedule(task, ms);
	}

}
