package hyb;

import java.sql.Connection;
import java.sql.DriverManager;

public class testjdbc {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/hb-04-one-to-many-uni?useSSL=false&serverTimezone=UTC";
        String user = "hbstudent";
        String pass = "Spring@123";

        try {
            System.out.println("Connecting to database: " + jdbcUrl);

            Connection myConn =
                    DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection successful!!!");

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
