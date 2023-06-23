package Log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logTestDemo {
	private static final Logger log = LogManager.getLogger(logTestDemo.class);
	public static void main(String[] args) {
		log.error("err log");
		log.fatal("fatal error msg");
		log.debug("debug compelete");
		log.info("info msg");
	}
}
