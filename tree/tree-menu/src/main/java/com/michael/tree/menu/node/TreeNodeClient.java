package com.michael.tree.menu.node;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TreeNodeClient {

	@RequestMapping("getTreeNode")
	public List<TreeNode<Menu>> getTreeNode() {
		return TreeHandler.createTree(MenuFactory.getMenus());
	}

}
