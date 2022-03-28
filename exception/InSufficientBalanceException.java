package com.tyss.exception;

public class InSufficientBalanceException extends Throwable{
	
//	private String msg;
	
	InSufficientBalanceException(String msg){
		super(msg);
//		this.msg = msg;
	}
	
//	public String getMsg() {
//		return msg;
//	}
}
