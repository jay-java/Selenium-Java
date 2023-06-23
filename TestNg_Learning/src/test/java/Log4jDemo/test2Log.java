package Log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class test2Log {
	private static final Logger log = LogManager.getLogger(logTestDemo.class);
	public static void main(String[] args) {
		log.debug("debug2 compelete");
		log.error("err2 log");
		log.info("info2 msg");
	}
}
