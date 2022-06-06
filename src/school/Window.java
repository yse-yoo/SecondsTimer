package school;

import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame{
	

	//画像の表示場所
	public JLabel label;
	//画像の枚数
	public int imageCount = 6;
//	public int imageCount = 5;
	//アイコン画像の配列（Array）
	public ImageIcon[] images = new ImageIcon[imageCount];
	//画像の番号
	public int index = 0;
	//画像の先頭文字（プリフィックス）
	final String imagePrefix = "school-";
//	final String imagePrefix = "Dance";
	//画像の拡張子（Extention）
	final String imageExt = ".jpg";

	//コンストラクタ
	public Window() {
		super();
		loadImages();
		createWindow();
	}
	
	//画像を配列に入れる
	public void loadImages() {
		for (int i = 0; i < images.length; i++) {
			String path = "./images/" + imagePrefix + (i + 1) + imageExt;
			images[i] = new ImageIcon(path);
		}
	}
	
	//フレームの作成
	public void createWindow() {
		setBounds(0, 0, 1000, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//ラベル生成と追加
		label = new JLabel();
		add(label);
		setVisible(true);
	}
	
	public void animate() {
		//ラベルに画像を設定
		label.setIcon(images[index]);
		index++;
		//最後の画像になったら、最初にもどる
		if (index >= images.length) {
			index = 0;
		}
	}
	
	public void startTimer() {
		Timer timer = new Timer(true);
		//0.5秒間隔（interval）
		timer.schedule(new AnimationTask(this), 0, 100);
	}
}
