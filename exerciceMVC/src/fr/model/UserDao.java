/**
 * 
 */
package fr.model;

/**
 * @author dao303
 *
 */
public class UserDao {
	/**
	 * @param request
	 * @param password
	 * @return
	 */
	public static boolean CheckLogin (String login, String password) {
		boolean check = false;
		if (password.equals("toto")) {
			check = true;
		}
		return check;

	}
}
