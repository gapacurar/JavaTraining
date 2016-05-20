/*
 * a-sti.ro
 */
package javadatabaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Formatter;
import java.util.Locale;

/**
 * @author gheorgheaurelpacurar
 */
public class ReportPersoane {
    public static void main (String[] args)
    {
        String user = "derby";
        String password = "derby";
        String url = "jdbc:derby://localhost:1527/persoane;create=true";
        //String url = "jdbc:derby:firstdb;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
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
            String query = "SELECT PERSOANE.CNP,PERSOANE.NUME,PERSOANE.PRENUME,PERSOANE.VARSTA, PERSOANE.DOMICILIUL, LOCALITATI.DENUMIRE AS LOCALITATE, JUDETE.DENUMIRE AS JUDET \n" +
                            "FROM PERSOANE, LOCALITATI, JUDETE\n" +
                            "WHERE PERSOANE.COD_LOCALITATE=LOCALITATI.COD_LOCALITATE AND LOCALITATI.COD_JUDET=JUDETE.COD_JUDET";
            resultSet = statement.executeQuery(query);
            if (resultSet!=null)
            {
                String currentCNP = "";
                String currentPersoaneNume = "";
                String currentPersoanePrenume = "";
                String currentPersoaneVarsta = "";
                String currentPersoaneDomiciliul = "";
                String currentLocalitatiDenumire = "";
                String currentJudeteDenumire = "";
                // format report header
                StringBuilder sb = new StringBuilder();
                Formatter formatter = new Formatter(sb, Locale.US);
                formatter.format("%1$-13s %2$-25s %3$-25s %4$-6s %5$-25s %6$-15s %7$-15s","CNP", "NUME", "PRENUME", "VARSTA", "DOMICILIUL", "LOCALITATE", "JUDET");
                //System.out.println(currentCNP +currentPersoaneNume+currentPersoanePrenume+currentPersoaneVarsta+currentPersoaneDomiciliul+currentLocalitatiDenumire+currentJudeteDenumire);
                System.out.println(sb.toString());
                System.out.println("============="+ "========================="+ "========================="+ "======"+ "==============="+ "==============="+ "==============="+"==================");
                // display the content of table row by row
                while(resultSet.next()){
                    currentCNP = resultSet.getString(1);
                    currentPersoaneNume = resultSet.getString(2);
                    currentPersoanePrenume = resultSet.getString(3);
                    currentPersoaneVarsta = resultSet.getString(4);
                    currentPersoaneDomiciliul = resultSet.getString(5);
                    currentLocalitatiDenumire = resultSet.getString(6);
                    currentJudeteDenumire = resultSet.getString(7);
                    sb = new StringBuilder();
                    formatter = new Formatter(sb, Locale.US);
                    formatter.format("%1$-13s %2$-25s %3$-25s %4$-6s %5$-25s %6$-15s %7$-15s",currentCNP, currentPersoaneNume, currentPersoanePrenume, currentPersoaneVarsta, currentPersoaneDomiciliul, currentLocalitatiDenumire, currentJudeteDenumire);
                    //System.out.println(currentCNP +currentPersoaneNume+currentPersoanePrenume+currentPersoaneVarsta+currentPersoaneDomiciliul+currentLocalitatiDenumire+currentJudeteDenumire);
                    System.out.println(sb.toString());
                }
            }
            else
            {
                System.out.println("No rows found in ResultSet");
            }
        }                
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            if (resultSet != null)
            {
                try
                {
                    resultSet.close();
                }
                catch (Exception ex){}
            }
            if (statement != null)
            {
                try
                {
                    statement.close();
                }
                catch (Exception ex){}
            }	
            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (Exception ex){}
            }
        }	
    }
}
