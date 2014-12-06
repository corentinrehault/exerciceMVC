/**
 * 
 */
package fr.db;

import fr.beans.User;

/**
 * @author dao303
 *
 */
public class VirtualDb {
	
	
	public void CreateUsers () {
		User toto = new User();
		toto.setId("toto");
		toto.setLogin("toto");
		toto.setPassword("toto");
		
		User tutu = new User();
		tutu.setId("tutu");
		tutu.setLogin("tutu");
		tutu.setPassword("tutu");
	}
	

}
