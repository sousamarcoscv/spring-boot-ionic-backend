package com.marcossousa.domain;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.marcossousa.domain.enums.EstadoPagamento;

@JsonTypeName("pagamentoComCartao")
@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Integer numerodeParcelas;

	public PagamentoComCartao() {
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numerodeParcelas) {
		super(id, estado, pedido);
		this.numerodeParcelas = numerodeParcelas;
	}

	public Integer getNumerodeParcelas() {
		return numerodeParcelas;
	}

	public void setNumerodeParcelas(Integer numerodeParcelas) {
		this.numerodeParcelas = numerodeParcelas;
	}

}
