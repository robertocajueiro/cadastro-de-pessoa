package com.roberto.cadastropessoa.event;

import org.springframework.context.ApplicationEvent;

import jakarta.servlet.http.HttpServletResponse;

public class RecursoCriadoEvent extends ApplicationEvent {
	
	private static final long serialVersionUID = 1L;
	
	private HttpServletResponse response;
	private Long id;
	
	public RecursoCriadoEvent(Object source, HttpServletResponse response, Long id) {
		super(source);
		this.response = response;
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public Long getId() {
		return id;
	}
			
}
