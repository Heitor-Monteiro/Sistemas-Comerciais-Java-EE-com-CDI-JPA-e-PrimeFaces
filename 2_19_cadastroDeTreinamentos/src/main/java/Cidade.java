import java.io.Serializable;

public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer codigo;
	private String nomeCidade;

	public Cidade(Integer codigo, String nomeCidade) {
		this.codigo = codigo;
		this.nomeCidade = nomeCidade;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
}
