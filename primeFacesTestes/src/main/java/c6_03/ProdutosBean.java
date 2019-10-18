package c6_03;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ProdutosBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<String> produtos = new ArrayList<>();
	private String nomeProsuto;

	public void incluirProduto() {
		produtos.add(nomeProsuto);
		nomeProsuto = null;
	}

	public String getNomeProsuto() {
		return nomeProsuto;
	}

	public void setNomeProsuto(String nomeProsuto) {
		this.nomeProsuto = nomeProsuto;
	}

	public List<String> getProdutos() {
		return produtos;
	}
}
