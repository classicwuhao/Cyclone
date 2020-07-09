
package org.nuim.cyclone.parser;
import java.io.PrintWriter;
/**
 * Used by all parsers in this package. 
 * Collects error information during parsing.
 * 
 * @author green
 */
public class ParseErrorHandler {
    private int fErrorCount = 0;

    private String fFileName;
    private PrintWriter fErrWriter;
    
    /**
     * @param fileName The name of the parsed file - used for constructing
     * error strings.
     * @param errWriter Error messages are passed through to this 
     * writer.
     */
    public ParseErrorHandler(String fileName, PrintWriter errWriter)  {
        fFileName = fileName;
        fErrWriter = errWriter;
    }
    
    public String getFileName() {
        return fFileName;
    }
    
    public PrintWriter getErrorWriter() {
    	return fErrWriter;
    }
    
    public int errorCount() {
        return fErrorCount;
    }

    void incErrorCount() {
        fErrorCount++;
    }
    
    public void reportError(String error) {
        fErrWriter.println(fFileName + ":" + error);
        fErrWriter.flush();
        incErrorCount();
    }

}
