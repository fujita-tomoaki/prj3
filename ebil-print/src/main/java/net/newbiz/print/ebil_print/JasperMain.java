package net.newbiz.print.ebil_print;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRCsvDataSource;

public class JasperMain {
	public static void main(String[] args) throws Exception {
		
//		// 地区別振替月報
//	    Map<String, Object> parameters = new HashMap<String, Object>();
//	    // getResourceAsStream -> ://aarkiton.blogspot.jp/2011/09/getresourceasstream.html
//	    try (InputStreamReader ir = new InputStreamReader(
//    			ClassLoader.getSystemResourceAsStream("chikubetstu_kansai_utf8.csv"), "UTF-8");
//	    		InputStream template = ClassLoader.getSystemResourceAsStream("jaspertmpl/ChikuBtFurikaeGeppou.jrxml")
//	    	)
//	    {
//		    JRCsvDataSource dataSource = new JRCsvDataSource(ir);
//		    dataSource.setUseFirstRowAsHeader(true);
//		    JasperReport report = JasperCompileManager.compileReport(template);
//		    JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters, dataSource);
//		    JasperExportManager.exportReportToPdfFile(jasperPrint, "ChikuBtFurikaeGeppou.pdf");
//	    }
//	    catch (Exception e)
//	    {
//	    	e.printStackTrace();
//	    }

		// 未収者一覧
	    Map<String, Object> parameters = new HashMap<String, Object>();
	    // getResourceAsStream -> ://aarkiton.blogspot.jp/2011/09/getresourceasstream.html
	    try (InputStreamReader ir = new InputStreamReader(
    			ClassLoader.getSystemResourceAsStream("mishulist_data.csv"), "UTF-8");
	    		InputStream template = ClassLoader.getSystemResourceAsStream("jaspertmpl/mishulist.jrxml")
	    	)
	    {
		    JRCsvDataSource dataSource = new JRCsvDataSource(ir);
		    dataSource.setUseFirstRowAsHeader(true);
		    JasperReport report = JasperCompileManager.compileReport(template);
		    JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters, dataSource);
		    JasperExportManager.exportReportToPdfFile(jasperPrint, "mishulist.pdf");
	    }
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	    }
	    
	    System.out.println("終了しました");
	  }
}
