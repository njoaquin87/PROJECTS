package services.veritec;

import org.sql2o.Connection;
import org.sql2o.Query;
import org.sql2o.Sql2o;
import org.sql2o.data.Row;
import org.sql2o.data.Table;

public class VeritecConn {

	public boolean VeritecConnection(String stateCode) throws Exception{
		boolean veritecConn = false;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Sql2o oracleDatabase = new Sql2o(
				"jdbc:oracle:thin:@lpr01-devsql01:1521:starsdev",
				" CNG_OWN_STARS03", "fD5jzvnDNUUh");
		Connection conn = oracleDatabase.open();
		try (Query query = conn
				.createQuery("select PASS_ID from CA_CREDIT_AGENCY_ATTR AG join CA_SS_STORE SS "
						+ "on AG.ST_CODE = SS.ST_CODE where SS.STATE_ID = :state "
						+ "and AG.CREDIT_AGENCY_ID = 'VIP'")) {
			Table result = query.addParameter("state", stateCode)
					.executeAndFetchTable();
			Row val = result.rows().get(0);
			String passID = val.getString("PASS_ID");
			veritecConn = "testid".equals(passID);
			conn.close();
		}
		return veritecConn;
	}

	public static void main(String args[]) {
		VeritecConn var = new VeritecConn();
		boolean fl;
		try {
			fl = var.VeritecConnection("FL");
			System.out.println(fl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
