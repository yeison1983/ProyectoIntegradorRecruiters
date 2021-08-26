
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author eldio
 */
public class Conexion {

private static final String JDBC_URL = "jdbc:mysql://localhost:3306/alumnos?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

private static final String JDBC_USER = "root";
        
private static final String JDBC_PASSWORD = "Rayo54931*";

public static Connection getConnection() throws SQLException, ClassNotFoundException{
    Class.forName("com.mysql.jdbc.Driver");
    return DriverManager.getConnection(JDBC_URL,JDBC_USER, JDBC_PASSWORD);

  }

public static void close(ResultSet rs) throws SQLException{

    rs.close();

}
public static void close(Statement st) throws SQLException{

  st.close();
    
}

public static void close(PreparedStatement st) throws SQLException{

  st.close();
    
}

public static void close(Connection con) throws SQLException{

    con.close();

}



}
