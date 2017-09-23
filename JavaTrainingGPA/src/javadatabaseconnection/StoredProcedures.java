/*
 * a-sti.ro
 */
package javadatabaseconnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class StoredProcedures {
/**
     *
     * @param sCodJudet
     * @param sDenumireJudet
     * @throws SQLException
     */    
    public static void insertJudet(String sCodJudet, String sDenumireJudet) throws SQLException {
        String user = "test";
        String password = "test";
        String url = "jdbc:derby://localhost:1527/persoane;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            //statement = connection.createStatement();
            /*
             ***************************** call stored procedure - EXAMPLE ***************************************

            CallableStatement storedProcedureInsertJudet = connection.prepareCall("{call INSERT_JUDET(?,?)}");
            storedProcedureInsertJudet.setShort("codJudet", Short.parseShort(sCodJudet));
            storedProcedureInsertJudet.setString("sDenumire", sDenumireJudet);
            storedProcedureInsertJudet.executeUpdate();
                        */
            /*
             **************************************** call prepared statement - EXAMPLE
            */

            String DML = "INSERT INTO JUDETE VALUES (?, ?)";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setShort(1, Short.parseShort(sCodJudet));
            pstmnt.setString(2, sDenumireJudet);
            pstmnt.execute();

        }
        catch (ClassNotFoundException | SQLException | NumberFormatException ex)
        {
            ex.printStackTrace();
            throw new SQLException();
        }
        finally
        {
            if (resultSet != null)
            {
                try
                {
                    resultSet.close();
                }
                catch (Exception ex){ex.printStackTrace();}
            }
            if (statement != null)
            {
                try
                {
                    statement.close();
                }
                catch (Exception ex){ex.printStackTrace();}
            }	
            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (Exception ex){ex.printStackTrace();}
            }
        }  
    }    
    
}
