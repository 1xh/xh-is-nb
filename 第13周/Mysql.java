package week13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Mysql {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306xh?useUicode=true&characterEncoding=utf-8&serverTimezone=UTC";  
		String userName = "root";
		String passWord = "110708";
		Connection con = DriverManager.getConnection(url, userName, passWord);
		String sql="select*from tstudent";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			String sno = rs.getString("sno");
			String name = rs.getString("name");
			String birth = rs.getString("birth");
			String gender = rs.getString("gender");
			System.out.println(sno+" "+name+" "+birth+" "+gender);
		}
		rs.close();
		pst.close();
		con.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
