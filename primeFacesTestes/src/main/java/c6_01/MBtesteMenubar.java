package c6_01;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "MBtmb")
@ViewScoped
public class MBtesteMenubar implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean autoDisplay = true;

	public boolean isAutoDisplay() {
		return autoDisplay;
	}

	public void setAutoDisplay(boolean autoDisplay) {
		this.autoDisplay = autoDisplay;
	}
}
