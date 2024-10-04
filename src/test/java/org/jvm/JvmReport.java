package org.jvm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String jsonPath) {

		// 1.Mention the target folder location - File

		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\11CucumberBatch\\JvmF");

		// 2.Add details to the report using Configuration class ----
		// addClassifications("point1","point2")

		Configuration c = new Configuration(f, "facebook & amazon");
		c.addClassifications("platform name", "window");
		c.addClassifications("platform version", "winsows 10");
		c.addClassifications("browser name", "chrome");
		c.addClassifications("browser version", "128");

		// 3.Add json file paths into List<String>

		List<String> li = new LinkedList<String>();
		li.add(jsonPath);

		// 4.Create object for ReportBuilder class and using the created object call
		// generateReports() method.

		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();

	}

}
