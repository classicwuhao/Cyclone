
import java.io.*;
import java.lang.Exception;

public final class AlphabetException extends RuntimeException{
	private String msg;
	public AlphabetException(){this.msg="cannot find alphabet.";}
	public AlphabetException(String msg){
		this.msg = msg;
	}
	
}

