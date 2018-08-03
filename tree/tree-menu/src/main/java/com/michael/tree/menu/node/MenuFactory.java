package com.michael.tree.menu.node;

import java.util.HashMap;
import java.util.Map;

public class MenuFactory {

	public static Map<Integer, Menu> getMenus() {
		Map<Integer, Menu> menus = new HashMap<>();
		menus.put(1, new Menu(1, "menu1", "url1", 0, 0));
		menus.put(2, new Menu(2, "menu2", "url2", 1, 1));
		menus.put(3, new Menu(3, "menu3", "url3", 1, 1));
		menus.put(4, new Menu(4, "menu4", "url4", 1, 1));
		menus.put(5, new Menu(5, "menu5", "url5", 2, 2));
		menus.put(6, new Menu(6, "menu6", "url6", 2, 2));
		menus.put(7, new Menu(7, "menu7", "url7", 2, 4));
		menus.put(11, new Menu(11, "menu11", "url11", 0, 10));
		menus.put(12, new Menu(12, "menu12", "url12", 1, 11));
		menus.put(13, new Menu(13, "menu13", "url13", 1, 11));
		menus.put(14, new Menu(14, "menu14", "url14", 1, 11));
		menus.put(15, new Menu(15, "menu15", "url15", 2, 12));
		menus.put(16, new Menu(16, "menu16", "url16", 2, 12));
		menus.put(17, new Menu(17, "menu17", "url17", 2, 14));
		return menus;
	}

}
