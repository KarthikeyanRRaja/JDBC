import java.sql.*;
import java.lang.*;
import java.io.*;
public class database {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        try
        {   //String url="jdbc:odbc:csc";
            Connection con = DriverManager.getConnection("jdbc:odbc:IT","","");
            String sqlString = "insert into karthi values('karthi','hdcp',3600,1003)";
            Statement st=con.createStatement();
            int c=st.executeUpdate(sqlString);
            System.out.println(c+"record updated");
            con.close();
            st.close();
            
        }catch(SQLException t)
        {
            System.out.println(t);
        }
       database s=new database();

	}

}
