import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 *<p>MySQL に接続する為のユーティリティクラスです。<br>
 *ルートアカウントにて DB に接続されます。</p>
 */

  public class DBConnector{
/**
 *JDBC ドライバー名
 */
private static String driverName = "com.mysql.jdbc.Driver";
/**
 * データベース接続URL
 */
private static String url = "jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";
/**
 * データベース接続ユーザ名
 */
private static String user = "root";
/**
 * データベース接続パスワード
 */
private static String password ="mysql";

public Connection getConnection() {
	Connection con = null;
	try {
		Class.forName(driverName);
		con = DriverManager.getConnection(url,user,password);
	}	catch (ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;


	}
}