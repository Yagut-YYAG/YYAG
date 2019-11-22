package lesson_18;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ConnectionApp {
    public static void main(String[] args) {
        Connection conn=DbConnection.getConnection();
        final String SQLS = "Select * From messages";
    }
}
