package com.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.web.bind.annotation.RequestMapping;



public class Login {
	@Autowired
	HibernateTemplate hibernatetemplate;
	@Autowired
	JdbcTemplate jdbcTemplate;
	public Login(){}
    private String name;
    private String pass;
    private String mob;

    public String getPassword() {
        return pass;
    }

    public void setPassword(String password) {
        this.pass = password;
    }

    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = username;

}
    public String getMob(){
    	return mob;
    	
    }
    public void setMob(String mobl){
    	this.mob=mobl;
    }
   
    	
    	
    
@RequestMapping("/register")
public String regname(HttpServletRequest req){
	String name=req.getParameter("uname");
     String pass=req.getParameter("pwd");
     String mob= req.getParameter("num");
     return "index";
}
@RequestMapping("/login")
public String usrname(HttpServletRequest req){
	String name=req.getParameter("uname");
	String psd=req.getParameter("pwd");
	return "home";
}
}
