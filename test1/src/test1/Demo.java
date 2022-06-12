package test1;
import java.sql.*;


public class Demo {

	public static void main(String[] args) throws Exception{
		
     UserDTO dto=new UserDTO();
     dto.getConnection();
  User userDetails= dto.getUserName(45);
   System.out.println("Name"+userDetails.name);
    
  //add the student
   User user2=new User();
   user2.name="Kumar sangaraka";
    user2.rollno=90;
    
    dto.addUSer(user2);
    
   //delete the row
     dto.deleteUserName(452);
   // System.out.println("Name"+userDetails.name);
    
    
    
    
    
    
    
    

	
}
}