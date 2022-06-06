package school;

import java.util.TimerTask;

public class AnimationTask extends TimerTask {
	
	Window window;
	
	
	//コンストラクタ
	public AnimationTask(Window window) {
		super();
		this.window = window;
	}


	@Override
	public void run() {
		window.animate();
	}

}
