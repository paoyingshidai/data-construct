package com.michael.tree.menu.node;

import java.util.HashMap;
import java.util.Map;

public class MenuFactory {

	public static Map<Integer, Menu> getMenus() {
		Map<Integer, Menu> menus = new HashMap<>();
		menus.put(1, new Menu(1, "menu1", "url1", 0));
		menus.put(2, new Menu(2, "menu2", "url2", 1));
		menus.put(3, new Menu(3, "menu3", "url3", 1));
		menus.put(4, new Menu(4, "menu4", "url4", 1));
		menus.put(5, new Menu(5, "menu5", "url5", 2));
		menus.put(6, new Menu(6, "menu6", "url6", 2));
		menus.put(7, new Menu(7, "menu7", "url7", 4));
		return menus;
	}

}
