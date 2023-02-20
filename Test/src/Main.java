import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main{
	public static void main(String[] args) throws Exception{
		try {
			Class.forName("org.h2.Driver");
		} catch(ClassNotFoundException e) {
			throw new IllegalStateException("ドライバのロードに失敗しました");
		}
		
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
			
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM MONSTERS WHERE HP >= ?");
			pstmt.setInt(1, 10);
			
			ResultSet rs = pstmt.executeQuery();
			
			rs.close();
			pstmt.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
