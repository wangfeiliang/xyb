package com.pb.security;

import java.security.Provider;
import java.security.Security;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Sha256Hash;

public class PassWordSave {

	/**
	 * @param args
	 * @author wfl
	 */
	public static void main(String[] args) {
		
		  String password="111111";
		  int hashIterations = 5000;
	      RandomNumberGenerator saltGenerator = new SecureRandomNumberGenerator();
          //	   默认256字符长度
	      String salt = saltGenerator.nextBytes().toHex();
	      System.out.println(salt);
          //	  加密密码
	      String newPass = new Sha256Hash(password, salt,hashIterations).toHex();
          System.out.println(newPass);
          
          Provider d=null;
          Security s=null;
	}

}
