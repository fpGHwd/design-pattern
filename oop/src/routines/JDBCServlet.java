package routines;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Suzumiya
 * @version Nov 18, 2018 7:15:54 PM
 * 
 */

public class JDBCServlet extends HttpServlet {
	protected Connection conn = null;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		String driver = config.getInitParameter("driver");
		String url = config.getInitParameter("url");
		String username = config.getInitParameter("username");
		String pwd = config.getInitParameter("pwd");
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url, username, pwd);
			System.out.println("Connection successfully...");
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void executeSQL(PrintWriter out) throws SQLException {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

	}
}
