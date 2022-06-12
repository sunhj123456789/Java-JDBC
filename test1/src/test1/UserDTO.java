package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDTO {
	 String name;
	 Statement st=null;
	 Connection con=null;
	 ResultSet rs=null;
	 
public User getUserName(int rollno) {
	  String query="Select *from test where rollno="+rollno;  
	  User u1=new User();
	  u1.rollno=rollno;
	 
//    Class.forName("com.mysql.jdbc.Driver");
	  
    try {
		st=con.createStatement();
		rs=st.executeQuery(query);
	    while(rs.next()) {
	  	  name=rs.getString(1);  
	     u1.name=name;
//	  	  String rollnumber=rs.getString(2);
	  	 
	    }   
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return u1;
    
}

public void getConnection() throws ClassNotFoundException, SQLException{
	 String url="jdbc:mysql://localhost:3306/user";
	  String userName="root";
	  String pwd="password";

	Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection(url, userName, pwd);
}

public void addUSer(User user) throws SQLException {
	String query="insert into test values(?,?)";
	
	//preparedStatement stmt=new prepareStatement(query);
	PreparedStatement st=con.prepareStatement(query);  
	st.setString(1, user.name);
	st.setInt(2,user.rollno);
	int i=st.executeUpdate();  
	System.out.println(i+" records inserted");  
	  
	//con.close();  
	
}

public void deleteUserName(int rollno) throws SQLException {
	String query="delete from test where rollno="+rollno;
	
	//preparedStatement stmt=new prepareStatement(query);
	st=con.createStatement();
	st.executeUpdate(query);
	
	System.out.println("Decords records inserted");  
	  
	//con.close();  
	
}


//st.close();
//con.close();

}

class User{
	public String name;
	public int rollno;
}
