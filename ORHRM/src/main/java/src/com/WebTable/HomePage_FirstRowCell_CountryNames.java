
package com.WebTable;

import java.sql.Driver;

import org.apache.poi.ss.formula.functions.Index;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage_FirstRowCell_CountryNames extends BaseTest {

	public void capturing_FirstCell_CountryNames() {

		for (int i = 1; i <= 36; i++) {

			By countryproperty = (By
					.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[" + i + "]/td[1]"));
			WebElement CountryName = driver.findElement(countryproperty);
			String name = CountryName.getText();
			System.out.println(i + "  " + name);

		}
	}

	public static void main(String[] args) {
		HomePage_FirstRowCell_CountryNames m1 = new HomePage_FirstRowCell_CountryNames();
		m1.applicationLaunch();
		m1.capturing_FirstCell_CountryNames();
		m1.applicationclose();
	}
}