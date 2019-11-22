package lesson_18;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;

public class Calc_Servlet extends HttpServlet {
    public static void save(int a,char c, int b,int result) throws SQLException{
        Connection conn = DbConnection.getConnection();
        final String SQLI = "INSERT INTO messages (number_1, operation, number_2, result) values (?, ?, ?, ?)";
        PreparedStatement stmt_insert = conn.prepareStatement(SQLI);
        stmt_insert.setInt(1, a);
        stmt_insert.setInt(2, c);
        stmt_insert.setInt(3, b);
        stmt_insert.setInt(3, result);
        stmt_insert.execute();
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String x = req.getParameter("x");
        String y = req.getParameter("y");
        String op = req.getParameter("op");
        Integer result = 0;
        Integer a = 0;
        a = Integer.parseInt(x);
        Integer b = 0;
        b = Integer.parseInt(y);
        char c = op.charAt(0);
        switch (c) {
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a / b;
                break;
        }
        try {
            save(a,c,b,result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PrintWriter writer = resp.getWriter();
        writer.printf("%d", result);
        writer.close();
    }}