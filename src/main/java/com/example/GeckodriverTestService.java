package com.example;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckodriverTestService {

	private static final Logger log = Logger.getLogger(GeckodriverTestService.class.getName());

	private static WebDriver webDriver = null;

	public static void main(String args[]) {
		try {
			String mode = "start";
			String[] actualArgs = args;
			if (args.length >= 1) {
				mode = args[0];
				actualArgs = Arrays.copyOfRange(args, 1, args.length);
			}

			log.log(Level.FINE, "Mode is: {0}", mode);
			log.log(Level.FINE, "Arguments are: {0}", Arrays.toString(actualArgs));

			if ("start".equals(mode)) {
				start(actualArgs);
			} else if ("stop".equals(mode)) {
				stop(actualArgs);
			} else {
				log.severe("Unknown mode: " + mode);
			}
		} catch (Exception ex) {
			log.log(Level.SEVERE, "Exception during main", ex);
			System.exit(1);
		}
	}

	public static void start(String args[]) {
		try {
			log.info("Creating FirefoxDriver");
			webDriver = new FirefoxDriver();

			log.info("Getting website");
			webDriver.get("http://example.com");

			log.info("End of test");
		} catch (RuntimeException ex) {
			log.log(Level.SEVERE, "Exception during start", ex);
			throw ex;
		}
	}

	public static void stop(String args[]) {
		try {
			if (null != webDriver) {
				log.info("Closing webdriver");
				webDriver.close();
			}
		} catch (RuntimeException ex) {
			log.log(Level.SEVERE, "Exception during stop", ex);
			throw ex;
		}
	}
}
