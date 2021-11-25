package chapter09.exam;

public class CheckBox {
	OnSelectListener listener;
	
	public CheckBox(OnSelectListener listener) {   //생성자를 통한 람다 사용 가능
		super();
		this.listener = listener;
	}
	
	public CheckBox() {
	}

	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}

	void select() {
		listener.onSelect();
	}

	static interface OnSelectListener {
		void onSelect();
	}

}
