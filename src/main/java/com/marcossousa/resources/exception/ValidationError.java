package com.marcossousa.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandartError {
	private static final long serialVersionUID = 1L;

	private List<FieldMessage> list = new ArrayList<>();

	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
		// TODO Auto-generated constructor stub
	}

	public List<FieldMessage> getErrors() {
		return list;
	}

	public void addError(String fieldName, String message) {
		this.list.add(new FieldMessage(fieldName, message));
	}

}
