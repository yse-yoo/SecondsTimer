package sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class DateTimer {

	public static void main(String[] args) throws ParseException {

		//タイマー
		Timer timer = new Timer();
		
		//タイマータスク
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("実行しました！");
				
			}
		};

		//日付フォーマッタ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//コンパイルエラーになったら、クリックして「スローの宣言の追加」
		timer.schedule(task, sdf.parse("2022/06/07 11:33:00"));
		
		
	}

}
