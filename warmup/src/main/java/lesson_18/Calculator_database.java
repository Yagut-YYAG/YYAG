package lesson_18;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Calculator_database {
    public static void main(String[] args) throws Exception,SQLException  {
        Server server = new Server(8082);

        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(new Calc_Servlet()), "/cal/*");
        server.setHandler(handler);
        server.start();
        server.join();
       /* Connection conn = DbConnection.getConnection();
        final String SQLS = "SELECT * FROM messages";
        PreparedStatement stmt = conn.prepareStatement(SQLS);
        ResultSet rset = stmt.executeQuery();
        // processing data
        while (rset.next()) {
            String line = String.format("id: %d, sender:%d, receiver:%d, message:%s",
                    rset.getInt("id"),
                    rset.getInt("user_from"),
                    rset.getInt("user_to"),
                    rset.getString("content"));
            System.out.println(line);
        }*/
}}