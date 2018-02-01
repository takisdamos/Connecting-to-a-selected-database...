package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Main {
	public static void main (String[] args)throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Connecting to a selected database...");
		System.out.println(".");
		System.out.println("..");
		System.out.println("...");System.out.println("....");System.out.println(".....");System.out.println("......");
		System.out.println("Connecting to a selected database..."+"\n");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/tested","root","root");
		PreparedStatement statement = con.prepareStatement("select * from users");
		ResultSet result = statement.executeQuery();
		while(result.next()){
			System.out.println(result.getString(1)+"  "+result.getString(2)+"  "+result.getInt(3)+"  "+result.getString(4)+"\n");
		}
		
		
	}
//--------------
}
