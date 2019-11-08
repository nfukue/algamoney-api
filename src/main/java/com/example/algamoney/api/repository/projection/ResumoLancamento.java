package com.example.algamoney.api.repository.projection;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.algamoney.api.model.TipoLancamento;

public class ResumoLancamento {

	private Long codigo;
	private String descricao;
	private LocalDate dataVencimento;
	private LocalDate datapagamento;
	private BigDecimal valor;
	private TipoLancamento tipo;
	private String categoria;
	private String Pessoa;
	
	public ResumoLancamento(Long codigo, String descricao, LocalDate dataVencimento, LocalDate datapagamento,
			BigDecimal valor, TipoLancamento tipo, String categoria, String pessoa) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.dataVencimento = dataVencimento;
		this.datapagamento = datapagamento;
		this.valor = valor;
		this.tipo = tipo;
		this.categoria = categoria;
		Pessoa = pessoa;
	}
	
	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public LocalDate getDatapagamento() {
		return datapagamento;
	}
	
	public void setDatapagamento(LocalDate datapagamento) {
		this.datapagamento = datapagamento;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public TipoLancamento getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getPessoa() {
		return Pessoa;
	}
	
	public void setPessoa(String pessoa) {
		Pessoa = pessoa;
	}
	
}
