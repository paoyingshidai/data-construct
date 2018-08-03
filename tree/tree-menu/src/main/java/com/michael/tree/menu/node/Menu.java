package com.michael.tree.menu.node;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Menu {

	private Integer menuId;

	private String  name;

	private String 	url;

	private Integer parentId;

	public Menu(Integer menuId, String name, String url, Integer parentId) {
		super();
		this.menuId = menuId;
		this.name = name;
		this.url = url;
		this.parentId = parentId;
	}
}
