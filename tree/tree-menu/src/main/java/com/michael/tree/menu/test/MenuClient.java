package com.michael.tree.menu.test;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuClient {

	@RequestMapping("getMenuTree")
	public List<Menu> getMenuTree() {

		return MenuHandler.createTree(MenuFactory.getMenus());
	}

}
