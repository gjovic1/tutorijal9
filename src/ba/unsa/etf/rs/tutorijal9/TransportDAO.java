package ba.unsa.etf.rs.tutorijal9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransportDAO {
    private static TransportDAO instance = null;
    private static Connection conn; 

    private PreparedStatement

    private TransportDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:proba.db");
            initializeStatements();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            setupDatabase();
            initializeStatements();
        }
    }

    public static TransportDAO getInstance() {
        return
    }

    private void setupDatabase() {
        String sql="";
        URL x = getClass().getResource("/dbScript.sql");
        FileReader fileReader = null;

        try {

            fileReader = new FileReader(x.getFile());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void initializeStatements() {
    }


    public void resetDatabase() {
    }
}
