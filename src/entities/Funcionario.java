package entities;

import java.util.Date;

import enums.TipoContratacao;

public class Funcionario extends Pessoa {
	private String matricula;
	private Date dataAdimssao;
	private TipoContratacao tipoContratacao;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getDataAdimssao() {
		return dataAdimssao;
	}

	public void setDataAdimssao(Date dataAdimssao) {
		this.dataAdimssao = dataAdimssao;
	}

	public TipoContratacao getTipoContratacao() {
		return tipoContratacao;
	}

	public void setTipoContratacao(TipoContratacao tipoContratacao) {
		this.tipoContratacao = tipoContratacao;
	}
}
