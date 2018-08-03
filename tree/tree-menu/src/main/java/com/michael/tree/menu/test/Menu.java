package com.michael.tree.menu.test;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

	private Integer menuId;

	private String  name;

	private String 	url;

	private Integer parentId;

	private List<Menu> menus = new ArrayList<>();

	public Menu(Integer menuId, String name, String url, Integer parentId) {
		super();
		this.menuId = menuId;
		this.name = name;
		this.url = url;
		this.parentId = parentId;
	}
}
