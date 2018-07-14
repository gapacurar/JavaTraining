/*
 * a-sti.ro
 */
package javadatabaseconnection;

import java.sql.*;
/**
 *
 * @author gheorgheaurelpacurar
 */
public class JDBCExample {
    public static void main (String[] args)
    {
        String user = "test";
        String password = "test";
        String url = "jdbc:derby://localhost:1527/firstdb;create=true";
        //String url = "jdbc:derby://localhost:1527/ebooksstore;create=true";
        //String url = "jdbc:derby:firstdb;create=true";
        //String driver = "org.apache.derby.jdbc.ClientDataSource40";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        //String driver = "Java DB New";
        //String driver = "org.apache.derby.jdbc.AutoloadedDriver";
        //String driver = "org.apache.derby.jdbc.ClientXADataSource40";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            //System.out.println("Statement is "+statement.toString());
            //statement.execute("CREATE TABLE FIRSTTABLE (ID INT PRIMARY KEY, NAME VARCHAR(12))");
            //statement.execute("INSERT INTO FIRSTTABLE VALUES (10,'TEN'),(20,'TWENTY'),(30,'THIRTY')");
            resultSet = statement.executeQuery("SELECT ID, NAME FROM FIRSTTABLE");
            //boolean resultSetHasRows = resultSet.next(); 
            if (null!=resultSet)
            {
                int currentID;
                String currentName = "";
                System.out.println("ID    NAME");
                System.out.println("==========");
                while(resultSet.next()){
                    currentID = resultSet.getInt(1);
                    currentName = resultSet.getString(2); 
                    System.out.println(currentID +"   "+currentName);
                }
            }
            else
            {
                System.out.println("No rows found in ResultSet");
            }
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            if (resultSet != null)
            {
                try
                {
                    resultSet.close();
                }
                catch (Exception ex){System.out.println(ex);}
            }
            if (statement != null)
            {
                try
                {
                    statement.close();
                }
                catch (Exception ex){System.out.println(ex);}
            }	
            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (Exception ex){System.out.println(ex);}
            }
        }	
    }
}
