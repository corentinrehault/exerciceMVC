/**
 * 
 */
package fr.controller;

import java.util.ArrayList;

//import java.util.ArrayList;

/**
 * @author dao303
 *
 */
public class ActionRules {
	
	private static String actionList [] = {"", "toLogin", "doLogin", "doLogout"};
	public static ArrayList<String> arrayActionList= new ArrayList<String>(4);
	
	public static void buildArrayActionList() {
		for (int i =0 ; i <actionList.length; i ++) {
			arrayActionList.add(actionList[i]);
		}
	}

}
