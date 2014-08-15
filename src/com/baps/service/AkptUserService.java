package com.baps.service;

import com.baps.dao.AkptUserDao;
import com.baps.model.AkptUser;

public class AkptUserService {
	
	AkptUserDao akptuserdao = new AkptUserDao ();

	public AkptUser write (AkptUser akptuserS) {
		akptuserS = akptuserdao.addUser(akptuserS);
		return akptuserS;
		}
	
	
	public AkptUser delete (String un) {
		AkptUser akptuser = akptuserdao.deleteUser(un);
		return akptuser;
	    }
	
	public AkptUser find (String un) {
		AkptUser akptuserS = akptuserdao.find(un);
		return akptuserS;
		
	}
	

}
