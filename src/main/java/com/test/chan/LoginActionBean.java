package com.test.chan;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "loginActionBean")
@SessionScoped
public class LoginActionBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -573085215964303769L;

	public String login() {
		System.out.println("/login.xhtml");
		return "/login.xhtml";
	}
}
