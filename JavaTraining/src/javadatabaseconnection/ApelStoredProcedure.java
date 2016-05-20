/*
 * a-sti.ro
 */
package javadatabaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Formatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author gheorgheaurelpacurar
 */
public class ApelStoredProcedure {
    public static void main (String[] args)
    {
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        String user = "derby";
        String password = "derby";
        String url = "jdbc:derby://localhost:1527/persoane;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        try
        {
            try {
                // check inserted value
                Class driverClass = Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ApelStoredProcedure.class.getName()).log(Level.SEVERE, null, ex);
            }
            connection = DriverManager.getConnection(url, user, password);
            //start transaction
            connection.setAutoCommit(false);
            //insert a new person using stored procedures for persons, localitati and judete.
            // if an exception will occur excetion will be catched. If nor we make commit.
            String cnpTest = "'2334455647788'";
            String cnp = "2334455647788";
            String codLocalitate = "10";
            String codJudet = "10";
            String denumireLocalitate = "VASLUI";
            String denumireJudet = "VASLUI";
            statement = connection.createStatement();
            String query = "SELECT CNP FROM PERSOANE WHERE CNP="+cnpTest;
            resultSet = null;
            resultSet = statement.executeQuery(query);
            if (!resultSet.next())             
                insertPersoana(cnp, "DANA", "BUDACA", "60", "STRADA LUMINII, 4",codLocalitate);
            else{
                System.out.println("Persons having cnp="+cnp+" is already in our DB.");
            }
            //check if localitate isn't already in the list of localities and judet in judete
            statement = connection.createStatement();
            query = "SELECT COD_LOCALITATE FROM LOCALITATI WHERE COD_LOCALITATE="+codLocalitate;
            resultSet = null;
            resultSet = statement.executeQuery(query);
            if (!resultSet.next())            
                insertLocalitate(codLocalitate, denumireLocalitate, codJudet);
            else{
                System.out.println("Localitate having cod="+codLocalitate+" is already in our DB.");
            }            
            query = "SELECT COD_JUDET FROM JUDETE WHERE COD_JUDET="+codJudet;
            resultSet = null;
            resultSet = statement.executeQuery(query);
            if (!resultSet.next())            
                insertJudet(codJudet,denumireJudet);        
            else{
                System.out.println("Judetul having cod="+codJudet+" is already in our DB.");
            }            
            connection.commit();
            //we read persons informations to check our insert
            connection.setAutoCommit(true);
            statement = connection.createStatement();
            query = "SELECT PERSOANE.CNP,PERSOANE.NUME,PERSOANE.PRENUME,PERSOANE.VARSTA, PERSOANE.DOMICILIUL, LOCALITATI.DENUMIRE AS LOCALITATE, JUDETE.DENUMIRE AS JUDET\n" +
                            "FROM PERSOANE, LOCALITATI, JUDETE\n" +
                            "WHERE PERSOANE.COD_LOCALITATE=LOCALITATI.COD_LOCALITATE AND LOCALITATI.COD_JUDET=JUDETE.COD_JUDET\n";
            resultSet = statement.executeQuery(query);
            if (resultSet!=null)
            {
                String currentCNP = "";
                String currentPersoaneNume = "";
                String currentPersoanePrenume = "";
                String currentPersoaneVarsta = "";
                String currentPersoaneDomiciliul = "";
                String currentLocalitateDenumire = "";
                String currentJudetDenumire = "";
                // format report header
                StringBuilder sb = new StringBuilder();
                Formatter formatter = new Formatter(sb, Locale.US);
                formatter.format("%1$-13s %2$-25s %3$-25s %4$-6s %5$-25s %6$-15s %7$-15s","CNP", "NUME", "PRENUME", "VARSTA", "DOMICILIUL", "LOCALITATE","JUDET");
                //System.out.println(currentCNP +currentPersoaneNume+currentPersoanePrenume+currentPersoaneVarsta+currentPersoaneDomiciliul);
                System.out.println(sb.toString());
                System.out.println("============="+ "========================="+ "========================="+ "======"+ "==============="+ "===============");
                // display the content of table row by row
                while(resultSet.next()){
                    currentCNP = resultSet.getString(1);
                    currentPersoaneNume = resultSet.getString(2);
                    currentPersoanePrenume = resultSet.getString(3);
                    currentPersoaneVarsta = resultSet.getString(4);
                    currentPersoaneDomiciliul = resultSet.getString(5);
                    currentLocalitateDenumire = resultSet.getString(6);
                    currentJudetDenumire = resultSet.getString(7);
                    sb = new StringBuilder();
                    formatter = new Formatter(sb, Locale.US);
                    formatter.format("%1$-13s %2$-25s %3$-25s %4$-6s %5$-25s %6$-15s %6$-15s",currentCNP, currentPersoaneNume, currentPersoanePrenume, currentPersoaneVarsta, currentPersoaneDomiciliul, currentLocalitateDenumire, currentJudetDenumire);
                    //System.out.println(currentCNP +currentPersoaneNume+currentPersoanePrenume+currentPersoaneVarsta+currentPersoaneDomiciliul+currentLocalitatiDenumire+currentJudeteDenumire);
                    System.out.println(sb.toString());
                }
            }
            else
            {
                System.out.println("No rows found in ResultSet");
            }
        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(ApelStoredProcedure.class.getName()).log(Level.SEVERE, null, ex1);
            }  
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
    /**
     * Methods call a database stored insert with parameters stored procedure
     * @param sCNP
     * @param sNume
     * @param sPrenume
     * @param sVarsta
     * @param sDomiciliul
     * @param sCodLocalitate
     * @throws SQLException
     */
    public static void insertPersoana(String sCNP, String sNume, String sPrenume, String sVarsta, String sDomiciliul, String sCodLocalitate) throws SQLException {
        String user = "derby";
        String password = "derby";
        String url = "jdbc:derby://localhost:1527/persoane;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            //call stored procedure to insert a new person
            String DML = "INSERT INTO DERBY.PERSOANE VALUES (?, ?, ?, ?, ?,?)";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setString(1, sCNP);
            pstmnt.setString(2, sNume);
            pstmnt.setString(3, sPrenume);
            pstmnt.setShort(4, Short.parseShort(sVarsta));
            pstmnt.setString(5, sDomiciliul);
            pstmnt.setShort(6, Short.parseShort(sCodLocalitate));
            pstmnt.execute();
        }
        catch (Exception ex)
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
    } // stored procedure call
    /**
     * insertLocalitate inserts a new record to Localitati table
     * @param sCodLocalitate
     * @param sDenumireLocalitate
     * @param sCodJudet
     * @throws SQLException
     */
    public static void insertLocalitate(String sCodLocalitate, String sDenumireLocalitate, String sCodJudet) throws SQLException {
        String user = "derby";
        String password = "derby";
        String url = "jdbc:derby://localhost:1527/persoane;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            // call stored procedure to add a new localitate
            String DML = "INSERT INTO DERBY.LOCALITATI VALUES (?, ?, ?)";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setShort(1, Short.parseShort(sCodLocalitate));
            pstmnt.setString(2, sDenumireLocalitate);
            pstmnt.setShort(3, Short.parseShort(sCodJudet));
            pstmnt.execute();
        }
        catch (Exception ex)
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
    } // stored procedures call 
    /**
     *
     * @param sCodJudet
     * @param sDenumireJudet
     * @throws SQLException
     */    
    public static void insertJudet(String sCodJudet, String sDenumireJudet) throws SQLException {
        String user = "derby";
        String password = "derby";
        String url = "jdbc:derby://localhost:1527/persoane;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            //call stored procedure
            String DML = "INSERT INTO DERBY.JUDETE VALUES (?, ?)";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setShort(1, Short.parseShort(sCodJudet));
            pstmnt.setString(2, sDenumireJudet);
            pstmnt.execute();
        }
        catch (Exception ex)
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
