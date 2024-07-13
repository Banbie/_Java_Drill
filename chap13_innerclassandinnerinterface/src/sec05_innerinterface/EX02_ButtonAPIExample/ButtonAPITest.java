package sec05_innerinterface.EX02_ButtonAPIExample;

class ButtonTest {
	ButtonListener bl;
	
	void setButtonListener (ButtonListener bl) {
		this.bl = bl;
	}
	
	interface ButtonListener{
		public abstract void onClick();
	}
	
	void onClick() {
		this.bl.onClick();
	}
}

public class ButtonAPITest {
	public static void main(String[] args) {
		ButtonTest btn = new ButtonTest();
		btn.setButtonListener(new ButtonTest.ButtonListener() {
			public void onClick() {
				System.out.println("Click");
			}
		});
		
		btn.onClick();
	}
}
