package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String maskCpfCnpj = "";
	private String labelCpfCnpj = "CPF";
	private Boolean tipoPessoa;

	public void definirMaskTipoPessoa() {
		if (tipoPessoa != null) {
			if (tipoPessoa) {
				maskCpfCnpj = "999.999.999-99";
				labelCpfCnpj = "CPF";
			} else {
				maskCpfCnpj = "99.999.999/9999-99";
				labelCpfCnpj = "CNPJ";
			}
		}
	}

	public String getMaskCpfCnpj() {
		return maskCpfCnpj;
	}

	public String getLabelCpfCnpj() {
		return labelCpfCnpj;
	}

	public Boolean getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(Boolean tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
}
