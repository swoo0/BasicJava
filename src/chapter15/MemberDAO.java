package chapter15;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

import oracle.jdbc.driver.OracleDriver;

// DTO (Date Transfer Object)  ==  VO (Value Object)

public class MemberDAO {
	public List<MemberVO> memberList() throws Exception {
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		// 0. 드라이버 로딩 (throws Exception)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 1. 드라이버 매니저를 통해 접속
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KSW90", "java");
		// 2. 작업 공간 만들기
		Statement statement = connection.createStatement();
		// statement.executeQuery(""); -> ResultSet resultSet = statement.executeQuery("");
		ResultSet resultSet = statement.executeQuery("SELECT MEM_ID, MEM_NAME, MEM_MAIL FROM MEMBER");
		while (resultSet.next()) {
			String memId = resultSet.getString("MEM_ID");
			String memName = resultSet.getString("MEM_NAME");
			String memMail = resultSet.getString("MEM_MAIL");
			list.add(new MemberVO(memId, memName, memMail));
		}
		resultSet.close();
		statement.close();
		connection.close();
		
		return list;
	}

	
	public MemberVO getMember(String searchId) throws Exception {
	
		Connection connection2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KSW90", "java");
		Statement statement2 = connection2.createStatement();

		StringBuilder builder = new StringBuilder();
		builder.append("SELECT");
		builder.append("    MEM_ID,");
		builder.append("    MEM_NAME,");
		builder.append("    MEM_REGNO1||'-'||MEM_REGNO2 MEM_REGNO,");
		builder.append("    TO_CHAR(MEM_BIR, 'YYYY\"년\" MM\"월\" DD\"일\"') AS MEM_BIR,");
		builder.append("    MEM_ZIP,");
		builder.append("    MEM_ADD1||' '||MEM_ADD2 AS MEM_ADD,");
		builder.append("    MEM_HOMETEL,");
		builder.append("    MEM_COMTEL,");
		builder.append("    MEM_HP,");
		builder.append("    MEM_MAIL,");
		builder.append("    MEM_JOB,");
		builder.append("    MEM_LIKE,");
		builder.append("    MEM_MEMORIAL,");
		builder.append("    MEM_MEMORIALDAY,");
		builder.append("    MEM_MILEAGE,");
		builder.append("    MEM_DELETE");
		builder.append(" FROM");
		builder.append("    MEMBER");
		builder.append("    WHERE ");
		builder.append("    MEM_ID = '" + searchId + "' ");
		String sql = builder.toString();
		
		ResultSet resultSet2 = statement2.executeQuery(sql);
		MemberVO vo = null;
		if (resultSet2.next()) {
			String memId = resultSet2.getString("MEM_ID");
			String memName = resultSet2.getString("MEM_NAME");
			String memRegno = resultSet2.getString("MEM_REGNO");
			String memBir = resultSet2.getString("MEM_BIR");
			String memZip = resultSet2.getString("MEM_ZIP");
			String memAdd = resultSet2.getString("MEM_ADD");
			String memHometel = resultSet2.getString("MEM_HOMETEL");
			String memComtel = resultSet2.getString("MEM_COMTEL");
			String memHp = resultSet2.getString("MEM_HP");
			String memMail = resultSet2.getString("MEM_MAIL");
			String memJob = resultSet2.getString("MEM_JOB");
			String memLike = resultSet2.getString("MEM_LIKE");
			String memMemorial = resultSet2.getString("MEM_MEMORIAL");
			String memMemorialDay = resultSet2.getString("MEM_MEMORIALDAY");
			String memMileage = resultSet2.getString("MEM_MILEAGE");
			String memDelete = resultSet2.getString("MEM_DELETE");
			vo = new MemberVO(memId, memName, memRegno, memBir, memZip, memAdd, memHometel, memComtel, memHp, memMail, memJob, memLike, memMemorial, memMemorialDay, memMileage, memDelete);
		}
		resultSet2.close();
		statement2.close();
		connection2.close();
		return vo;
	}
	
	
	public int insertMember(MemberVO vo) {
		return 0;
	}
	
	
	public int updateMember(MemberVO vo) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KSW90", "java");
		StringBuilder builder = new StringBuilder();
		builder.append("UPDATE");
		builder.append("    MEMBER ");
		builder.append("SET");
		builder.append("    MEM_NAME = ?,");
		builder.append("    MEM_MAIL = ? ");
		builder.append("WHERE");
		builder.append("    MEM_ID = ?");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getMemName());
		statement.setString(2, vo.getMemMail());
		statement.setString(3, vo.getMemId());
		// executeUpdate : insert, update, delete
		// executeQuery : select
		int executeUpdate = statement.executeUpdate();
//		MemberVO vo2 = new MemberVO();
//		vo2.getMemId();
//		vo2.getMemMail();
//		vo2.getMemName();
		
		
		statement.close();
		connection.close();
		
		return executeUpdate;
	}
	public int deleteMember(String id) {
		return 0;
	}
	
	
}