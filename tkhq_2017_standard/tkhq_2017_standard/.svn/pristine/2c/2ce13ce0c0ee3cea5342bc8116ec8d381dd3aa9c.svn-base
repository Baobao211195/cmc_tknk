package com.tkhq.cmc.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.captcha.Captcha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.client.RestTemplate;


import org.springframework.web.util.WebUtils;

//import com.captcha.botdetect.web.servlet.Captcha;
import com.tkhq.cmc.utils.Utils;

public class CaptchaFilter extends UsernamePasswordAuthenticationFilter {

	@Autowired
	private RestTemplate restTemplate;
	private static final String POST = "POST";
	
	@Override
	  public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
	    final HttpServletRequest request = (HttpServletRequest) req;
	    final HttpServletResponse response = (HttpServletResponse) res;
	    if(request.getRequestURI().indexOf("login") != -1 && request.getMethod().equals(POST)){
	        //Captcha validation here
	    	//Captcha captcha = Captcha.load(request, "exampleCaptcha");
	    	Captcha captcha = (Captcha) WebUtils.getSessionAttribute(request,Captcha.NAME);
	    	
	    	boolean isHuman = captcha.isCorrect(request.getParameter("captchaCode"));
	    	if(isHuman){
	    		chain.doFilter(request, response);
	    	}
	    	else{
	    		response.sendRedirect(Utils.getBaseUrl(request) + "/login?captchaerror");
	    	}
	    }else{
	        chain.doFilter(request, response);
	    }
	  }

}
