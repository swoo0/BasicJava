package chapter07.exam.p367_3;

public class HttpServletExam {
	public static void main(String[] args) {
		method(new LoginServlet()); //로그인합니다.
		method(new FileDownloadServlet()); //파일 다운로드합니다.

	}
		

	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
