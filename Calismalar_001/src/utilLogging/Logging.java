package utilLogging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Logging {

	// SEVERE (highest level)
	// • WARNING
	// • INFO
	// • CONFIG
	// • FINE
	// • FINER
	// • FINEST (lowest level)

	static Logger log = Logger.getLogger(Logging.class.getPackage().getName());

	private FileHandler fileHandler;

	public Logging() {
//		MyFormatter formatter = new MyFormatter();
//		fileHandler.setFormatter(formatter);
//		log.addHandler(fileHandler);
		addFileHandler(log);
		//
		
	

//	java.util.logging.SimpleFormatter="%1$tb %1$td, %1$tY %1$tl:%1$tM:%1$tS %1$Tp %2$s%n%4$s: %5$s%n";

	}

	public static void main(String[] args) {
		log.info("main() method called.");
		Logging le = new Logging();

		/*
		 * Anonymous inner class method for adding a FileHandler in main()
		 * method.
		 */
		try {
			log.info("Adding FileHandler");
			log.addHandler(new FileHandler(Logging.class.getName()
					+ ".main.log"));
			log.info("Added FileHandler to Logger");
		} catch (IOException ex) {
			log.log(Level.SEVERE, null, ex);
		} catch (SecurityException ex) {
			log.log(Level.SEVERE, null, ex);
		}

		// Example logging.
		log.info("Logging for fun and profit");
		log.fine("Fine...");
		log.finer("Finer...");
		log.finest("Finest...");
		log.warning("Warning...");
		log.severe("Severe...");
		log.info("Logging complete.");

	}

	private void addFileHandler(Logger logger) {
		try {
			fileHandler = new FileHandler(Logging.class.getName() + ".log");
		} catch (IOException ex) {
			logger.log(Level.SEVERE, null, ex);
		} catch (SecurityException ex) {
			logger.log(Level.SEVERE, null, ex);
		}
		logger.addHandler(fileHandler);
	}

}
