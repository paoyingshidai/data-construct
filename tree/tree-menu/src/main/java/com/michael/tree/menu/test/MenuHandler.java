package com.michael.tree.menu.test;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MenuHandler {

	public static List<Menu> createTree(Map<Integer, Menu> menus) {

		Menu root = new Menu();

		for(Entry<Integer, Menu> menuEntry : menus.entrySet()) {
			Menu menu = menuEntry.getValue();
			if (0 == menu.getParentId() || menu.getParentId() == null) {
				root.getMenus().add(menu);
			} else {
				menus.get(menu.getParentId()).getMenus().add(menu);
			}
		}

		return root.getMenus();
	}

}
