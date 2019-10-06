package c4_02;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "MBdb")
@ViewScoped
public class DataBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public Date getDataAtual() {
		return new Date();
	}
}
