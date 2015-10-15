package utilLogging;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter {

	

	@Override
	public String format(LogRecord record) {
		String s=formatMessage(record)+""+getLineNumber(record);
				
		return s;
	}
	
	final int getLineNumber(final LogRecord record) {
        final int lineNumber;
        if (record.getThrown() != null) {
            lineNumber = getLineNumberFromStackTrace(
                    record.getThrown().getStackTrace());
        } else {
            lineNumber = 0;
        }
        return lineNumber;
    }
	 final int getLineNumberFromStackTrace(final StackTraceElement[] traces) {
	        final int lineNumber;
	        if (traces.length > 0 && traces[0] != null) {
	            lineNumber = traces[0].getLineNumber();
	        } else {
	            lineNumber = 0;
	        }
	        return lineNumber;
	    }
}