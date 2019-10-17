package c6_02;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class MessagesBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public void adicionarMensagemErro() {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Resumo da mensagem de erro",
				"Mensagem de erro completa");
		context.addMessage("destinoErro", msg);
	}

	public void adicionarAvisoFlutuante() {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Resumo do aviso flutuante",
				"Mensagem flutuante completa");
		context.addMessage("destinoAviso", msg);
	}

}
