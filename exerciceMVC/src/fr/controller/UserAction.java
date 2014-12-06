/**
 * 
 */
package fr.controller;

import fr.model.UserDao;

/**
 * @author dao303
 *
 */
public class UserAction {
	/**
	 * @param request
	 * @param password 
	 * @return
	 */
	public static boolean DoLogin (String login, String password) {
		boolean check = false;
		if (UserDao.CheckLogin(login, password)) {
			check = true;
		}
		return check;
	}
}
