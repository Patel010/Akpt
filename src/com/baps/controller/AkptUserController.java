package com.baps.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.baps.model.AkptBook;
import com.baps.model.AkptUser;
import com.baps.service.AkptUserService;

@Controller
public class AkptUserController {
	
	@RequestMapping (value="/createNewUser", method=RequestMethod.GET)
	public String showLoginPage (ModelMap m) {
		
		AkptUser akptuser = new AkptUser ();
		m.addAttribute("userCMD", akptuser);
		return "createUser";		
	    }
	
	@RequestMapping (value="/userCretion", method=RequestMethod.POST)
	public String varifyUser (@ModelAttribute("userCMD")AkptUser akptusercmd){
		
		AkptUserService akptUserSrvObj = new AkptUserService();
		AkptUser akptuser = akptUserSrvObj.write(akptusercmd);
		return "home";
	   }
	
	@RequestMapping (value="/loginxx", method=RequestMethod.GET)
	public String userlogin (ModelMap m){
		
		AkptUser akptuser = new AkptUser();
		m.addAttribute("inputUserCMD", akptuser);
		return "login";
	   }
	
	@RequestMapping (value="/finduser", method=RequestMethod.POST )
	public String findUser (@ModelAttribute("inputUserCMD") AkptUser inputUserCMD ) {
		
		AkptUserService akptUserSrvObj = new AkptUserService ();
		AkptUser akptuser = akptUserSrvObj.find(inputUserCMD.getUserName());
		
		String DBuser = akptuser.getUserName();
		String DBpw = akptuser.getPassword();
		String inputUser = inputUserCMD.getUserName();
		String inputPw = inputUserCMD.getPassword();
	
		
		if (DBuser.equals(inputUser) && DBpw.equals(inputPw) ){  
			
			return "welcome";
		}else {
			
			return "home";
		}
		
	}
	

}
