package com.srh_heidelberg.jasperdemoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.sql.ConnectionPoolDataSource;
import com.mysql.jdbc.Driver;
import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import ar.com.fdvs.dj.domain.DynamicReport;
import ar.com.fdvs.dj.domain.builders.FastReportBuilder;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class App {
	public static void main(String[] args) throws Exception {
		
			DbConnect dbc = new DbConnect(); // Get Database Connection
			dbc.createCon();
		
	}
}

class DbConnect {
	public void createCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "sarang_18695");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from student");
		
			FastReportBuilder drb = new FastReportBuilder();
			DynamicReport dr = drb.addColumn("Studnet Name", "Student_Name", String.class.getName(), 30)
					.addColumn("Student Address", "Student_Address", String.class.getName(), 30)
					.addColumn("Student contact", "Student_Contact", String.class.getName(), 50)
					.addColumn("Matriculation No", "MatriculationNo", String.class.getName(), 50)
					.setTitle("List Of Students").setSubtitle("This report was generated at " + new Date())
					.setPrintBackgroundOnOddRows(true).setUseFullPageWidth(true).build();
			JRResultSetDataSource resultsetdatasource = new JRResultSetDataSource(rs);
			JasperPrint jp = DynamicJasperHelper.generateJasperPrint(dr, new ClassicLayoutManager(),
					resultsetdatasource);
			JasperViewer.viewReport(jp); // finally display the report report
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
