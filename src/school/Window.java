package school;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame{

	//画像の表示場所
	public JLabel label;
	//画像の枚数
	public int imageCount = 6;
	//アイコン画像の配列（Array）
	public ImageIcon[] images = new ImageIcon[imageCount];
	//画像の番号
	public int index = 0;
	final String imagePrefix = "school-";
	final String imageExt = ".jpg";
}
