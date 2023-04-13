package GenericUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

/*
 * 
 * This class contains generic methods to access database connection
 */

public class DatabaseUtility {
	Driver driverref;
	Connection con;

	public static void main(String[] args) {
		Driver driverref;
		ResultSet result;
		/*
		 * this method will get connection to database
		 */
	}
	
		public void connectToDB() throws Throwable
		{
			DriverManager.registerDriver(driverref);
			Connection con=DriverManager.getConnection(ipathconstants.dburl, ipathconstants.dbusername, ipathconstants.dbpassword);
		}
		public void closeDB() throws Throwable
		{
			con.close();
		}
		public String executeQueryAndGetData(String query,int columnIndex,String expData) throws Throwable
		{
			Boolean flag=false;
			ResultSet result = con.createStatement().executeQuery(query);
			while(result.next())
			{
				String actData = result.getString(columnIndex);
				if(actData.equalsIgnoreCase(expData))
				{
					flag=true;
					break;
				}
				
			}
			if(flag)
			{
				System.out.println(expData+"data verified successfully");
				return expData;
			}
			
		
		else
		{
			System.out.println(expData+"data not verified in db");
			return expData;
		}
}
}
