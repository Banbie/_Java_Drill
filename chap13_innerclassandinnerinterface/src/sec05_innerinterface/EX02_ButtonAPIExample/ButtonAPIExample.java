package sec05_innerinterface.EX02_ButtonAPIExample;

class Button {
	OnClickListener ocl;
	void setOnClickListener (OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	interface OnClickListener {
		public abstract void onClick();
	}
	
	void onClick() {
		ocl.onClick();
	}
}

public class ButtonAPIExample {
	public static void main(String[] args) {
		Button btn1 = new Button(); //논리적 버튼
		btn1.setOnClickListener(new Button.OnClickListener() { //물리적 버튼, 논리적 버튼 일치
			public void onClick() { //버튼의 기능 작성
				System.out.println("Music");
			}
		});
		
		btn1.onClick(); //버튼의 기능이 작동하는 시점
		
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {
			public void onClick() {
				System.out.println("Movie");
			}
		});
		
		btn2.onClick();
	}
}
