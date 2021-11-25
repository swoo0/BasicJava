package chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class ShoppingMain {
	static MemberDAO dao = new MemberDAO();
	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		menu : while (true) {
			System.out.println("======================================================================");
			System.out.println("0. 프로그램종료 | 1. 회원목록 | 2. 회원상세 | 3. 회원등록 | 4. 회원수정 | 5. 회원삭제");
			System.out.print("메뉴를 선택하세요. > ");
			int menu = Integer.parseInt(scanner.nextLine());
			
			switch (menu) {
			case 1:
				List<MemberVO> list = dao.memberList();
				for (MemberVO vo : list) {
					System.out.printf("%s \t %s \t %s \n", vo.getMemId(), vo.getMemName(), vo.getMemMail());
				}
				break;
				
			case 2:
				System.out.print("조회할 아이디를 입력하세요> ");
				String searchId = scanner.nextLine();
				
				MemberVO vo = dao.getMember(searchId);			
				//받는 값이 한번만 이면 while 대신 if를 쓴다 존재하면 가져 오고 1  없으면 0
				if (vo != null) {
					System.out.println("회원번호: " + vo.getMemId());
					System.out.println("이름: " + vo.getMemName());
					System.out.println("주민등록번호: " + vo.getMemRegno());
					System.out.println("생일: " + vo.getMemBir());
					System.out.println("우편번호: " + vo.getMemZip());
					System.out.println("주소: " + vo.getMemAdd());
					System.out.println("집전화번호: " + vo.getMemHometel());
					System.out.println("회사전화번호: " + vo.getMemComtel());
					System.out.println("휴대전화번호: " + vo.getMemHp());
					System.out.println("이메일: " + vo.getMemMail());
					System.out.println("직업: " + vo.getMemJob());
					System.out.println("취미: " + vo.getMemLike());
					System.out.println("기념: " + vo.getMemMemorial());
					System.out.println("기념: " + vo.getMemMemorialDay());
					System.out.println("마일리지: " + vo.getMemMileage());
					System.out.println("삭제여부: " + vo.getMemDelete());
				} else {
					System.out.println("조회한 아이디의 정보가 없습니다.");
				}
				break;

				
			case 3:
				break;
				
				
			case 4:
				System.out.print("수정할 아이디를 입력하세요. ");
				String memId = scanner.nextLine();
				System.out.print("수정할 이름을 입력하세요. ");
				String memName = scanner.nextLine();
				System.out.print("수정할 메일주소를 입력하세요. ");
				String memMail = scanner.nextLine();
				int updateMember = dao.updateMember(new MemberVO(memId, memName, memMail));
				if (updateMember > 0) {
					System.out.println("정보가 변경되었습니다.");
				} else {
					System.out.println("변경되지 않았습니다.");
				}
				MemberVO vo2 = dao.getMember(searchId);			
				//받는 값이 한번만 이면 while 대신 if를 쓴다 존재하면 가져 오고 1  없으면 0
				if (vo != null) {
					System.out.println("회원번호: " + vo.getMemId());
					System.out.println("이름: " + vo.getMemName());
					System.out.println("주민등록번호: " + vo.getMemRegno());
					System.out.println("생일: " + vo.getMemBir());
					System.out.println("우편번호: " + vo.getMemZip());
					System.out.println("주소: " + vo.getMemAdd());
					System.out.println("집전화번호: " + vo.getMemHometel());
					System.out.println("회사전화번호: " + vo.getMemComtel());
					System.out.println("휴대전화번호: " + vo.getMemHp());
					System.out.println("이메일: " + vo.getMemMail());
					System.out.println("직업: " + vo.getMemJob());
					System.out.println("취미: " + vo.getMemLike());
					System.out.println("기념: " + vo.getMemMemorial());
					System.out.println("기념: " + vo.getMemMemorialDay());
					System.out.println("마일리지: " + vo.getMemMileage());
					System.out.println("삭제여부: " + vo.getMemDelete());
				
				
				break;
				
				
			case 5:
				break;
			case 0:
				System.out.println("이용해주셔서 감사합니다.");
				scanner.close();
				System.exit(0);
				break menu;
			}
		}
		
		
		
	}
}
