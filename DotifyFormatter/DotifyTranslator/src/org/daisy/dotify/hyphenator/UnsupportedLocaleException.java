package org.daisy.dotify.hyphenator;

/**
 * Provides an exception that indicates that a locale is not supported.
 * 
 * @author joha
 *
 */
public class UnsupportedLocaleException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5227463578664358907L;

	public UnsupportedLocaleException() {
		super();
	}

	public UnsupportedLocaleException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnsupportedLocaleException(String message) {
		super(message);
	}

	public UnsupportedLocaleException(Throwable cause) {
		super(cause);
	}

}