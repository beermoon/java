package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025/01/23
 * 이름 : 최명기
 * 내용 : Java CRUD 실습하기
 */



public class UpdateTest {
	public static void main(String[] args) {
		
		// DB 정보
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		
		try {
			
			// 1단계 - 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2단계 -
			Connection conn =  DriverManager.getConnection(HOST,USER,PASS);			
			// 3단계 -
			Statement stmt = conn.createStatement();
			// 4단계 -
			String sql = "UPDATE `user1` SET `name` ='김유진', `hp` = '010-1234-1011' "
							+ "WHERE `uid`= 'j101' ";
			stmt.executeUpdate(sql);
			// 5단계 -
			// 6단계 -
			stmt.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
