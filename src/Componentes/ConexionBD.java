package Componentes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    private final String servidor = "10.10.62.5";
    private final String bd = "bd_ferreteria";
    private final String usuario = "jlopez";
    private final String password = "jotha123";

    public Connection getConexion() {
        Connection cn = null;
        try {
            //MySQL
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://"+servidor+"/"+bd+"", ""+usuario+"", ""+password+"");
            
            //PostgreSQL
//            Class.forName("org.postgresql.Driver");
//            cn = DriverManager.getConnection("jdbc:postgresql://"+servidor+":5432/"+bd+"", ""+usuario+"", ""+password+"");
            /*SQL SERVER*/
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            cn = DriverManager.getConnection("jdbc:odbc:bd_ferreteria","sa","jotha123");
            
        } catch (ClassNotFoundException e) {
            cn = null;
        } catch (SQLException e) {
            cn = null;
        }
        return cn;
    }

}
