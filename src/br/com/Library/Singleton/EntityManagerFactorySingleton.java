package br.com.Library.Singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	
	private static EntityManagerFactory fabrica;
	
	private EntityManagerFactorySingleton(){}
	
	//Método .getInstance()
	public static EntityManagerFactory getInsance(){
		if(fabrica == null){
			fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return fabrica;
	}
	
}
