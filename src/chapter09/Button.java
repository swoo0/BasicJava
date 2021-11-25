package chapter09;
//417p
public class Button {
	OnClickListener listener;    //인터페이스 타입 필드
	
	void setOnclickListener(OnClickListener listener) {   //매개 변수의 다형성
		this.listener = listener;
	}
	
	void touch() {     //구현 객체의 OnClick() 메소드 호출
		listener.onClick();
	}
	
	static interface OnClickListener {  //중첩 인터페이스
		void onClick();
	}

}
