import java.sql.*;
public class ConnectionBD {
	private Connection con;
	private Statement  stmt;
	public ConnectionBD() {
		try {
			Class.forName(new String("com.mysql.jdbc.Driver"));
			con = DriverManager.getConnection(new String("jdbc:mysql://localhost/miniProjetJava"),"root","");
			stmt = con.createStatement();
		}catch(Exception error) {
			System.out.println(error);
		}
	}
	public int verifierDonner(String x, String y) throws SQLException {
		int a=0;
		ResultSet rs = stmt.executeQuery("select * from forfait where numTele = '" + x + "' and codeFidelio= '" + y + "'");
		while(rs.next()) {
			++a;
		}
		return a;
	}
	public int verifierDonner2(String x1, String y1,String x2, String y2,String x3, String y3) throws SQLException {
		int a=0;
		ResultSet rs = stmt.executeQuery("select * from forfait where "
				+ "typeCarte = '" + x1 
				+ "'and nomBank = '" + y1
				+ "'and numCarte = '" + x2 
				+ "' and moisExperie = '" + y2 
				+ "'and AnneeExperie = '" + x3 
				+ "' and codeCarte = '" + y3 + "'");
		while(rs.next()) {
			System.out.println("********");
			a++;
			
		}
		System.out.println(x1 + y1 +x2+y2+x3+y3);
		
		return a;
	}
}
/*
alter table forfait
ADD column typeCarte varchar(20);
alter table forfait
ADD column nomBank varchar(20);
alter table forfait
ADD column numCarte varchar(20);
alter table forfait
ADD column moisExperie varchar(20);
alter table forfait
ADD column AnneeExperie varchar(20);
alter table forfait
ADD column codeCarte varchar(20);




*/