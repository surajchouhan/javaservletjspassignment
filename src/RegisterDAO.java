
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class RegisterDAO {
	
	
	private String db="jdbc:mysql://localhost:3306/firstweb";
	private String dbname="root";
	private String dbpassword="suraj98";
	private String dbdriver="com.mysql.cj.jdbc.Driver";
	public void loadDriver(String dbdriver) 
	{
		try {
			Class.forName(dbdriver);
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		
		Connection con =null;
		try {
		
		 
		con=DriverManager.getConnection(db,dbname,dbpassword);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	  return con;
	}
	
	public String insert(Member member)
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result="Data entered successfully";
		String sql="insert into party(FirstName,LastName,Address,City,State,Country,Zip,Phone) values(?,?,?,?,?,?,?,?)";
		String sq1="insert into loginuser(UserLoginId,Password,Partyid) values(?,?,?)";
		
		try {
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, member.getFirstName());
	ps.setString(2, member.getLastName());
	ps.setString(2, member.getAddress());
	ps.setString(2, member.getCity());
	ps.setString(2, member.getState());
	ps.setString(2, member.getZip());
	ps.setString(2, member.getPhone());
	ps.executeUpdate();
	
	
	PreparedStatement ps3=con.prepareStatement("select max(partyid) from party");
     ResultSet rs=ps3.executeQuery();
	
	rs.next();
	
	int id;
	id = rs.getInt(1);
	


	PreparedStatement ps1=con.prepareStatement(sq1);
	
	ps1.setString(1, member.getUserLoginId());
	ps1.setString(2, member.getPassword());
	
	ps1.setInt(3,id);
	
	
	ps1.executeUpdate();
	
	System.out.println("Thank You");
	

	
	
	
		
		
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			result="data not entered";
			
		}
		
		return result;
	}
}


