package c6_05;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class MBclienteControl implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Cliente> clientes = new ArrayList<>();
	private Cliente cliente = new Cliente();
	private Cliente clienteSelecionado;

	private void messagem(String texto1, String texto2) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, texto1, texto2);
		context.addMessage("destinoAviso", msg);
	}

	public void incluirCliente() {
		clientes.add(cliente);
		cliente = new Cliente();
		messagem("Novo cliente", "Cliente adicionado com sucesso!");
	}

	public void excluirCliente() {
		clientes.remove(clienteSelecionado);
		messagem("Cliente excluido", "Os dados do cliente foram excluidos com sucesso!");
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Cliente getClienteSelecionado() {
		return clienteSelecionado;
	}

	public void setClienteSelecionado(Cliente clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
	}
}
