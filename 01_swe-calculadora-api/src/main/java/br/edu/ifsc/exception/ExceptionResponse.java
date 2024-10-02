package br.edu.ifsc.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Date diaHora;
	private String mensagem;
	private String detalhes;
	
	public ExceptionResponse(Date diaHora, String mensagem, String detalhes) {
		super();
		this.diaHora = diaHora;
		this.mensagem = mensagem;
		this.detalhes = detalhes;
	}

	public Date getDiaHora() {
		return diaHora;
	}

	public String getMensagem() {
		return mensagem;
	}

	public String getDetalhes() {
		return detalhes;
	}
	
	
}
