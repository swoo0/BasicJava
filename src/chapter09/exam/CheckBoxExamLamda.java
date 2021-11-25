package chapter09.exam;

public class CheckBoxExamLamda {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox(() -> System.out.println("배경을 변경합니다."));
		checkBox.select();
	}
	
}