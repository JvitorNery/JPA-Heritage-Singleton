package br.com.Library.Exception;

public class CommitException extends Exception {
	
	public CommitException(){
		super();
	}
	
	public CommitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public CommitException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CommitException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CommitException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
