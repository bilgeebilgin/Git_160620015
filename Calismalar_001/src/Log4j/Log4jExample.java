package Log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class Log4jExample {
	private static final Logger LOG = LoggerFactory.getLogger(Log4jExample.class);
	
	
	
		public Log4jExample() {
			System.out.println("Loglamaya ba�an�yor...");
			
			LOG.info("Bu bir info mesajd�r!");
			LOG.warn("Bu bir warn");			
			LOG.error("Bu bir err");
			LOG.trace("Bu bir trace mesaj�d�r");
			
			
			
		}

}
