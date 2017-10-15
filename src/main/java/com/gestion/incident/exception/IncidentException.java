package com.gestion.incident.exception;

public class IncidentException extends Exception{

	private static final long serialVersionUID = 1L;

	public IncidentException(){}
	
	public IncidentException(String message){
		super(message);	
	}
	
	public IncidentException(String message, final Throwable cause){
		super(message, cause);
	}
	
}
