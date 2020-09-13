package com.arraylist;

//自定义异常
public class MyRuntimeException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public MyRuntimeException() {
		super();
	}

	public MyRuntimeException(String message) {
		super(message);
	}

	public MyRuntimeException(Throwable cause) {
		super(cause);
	}

}
