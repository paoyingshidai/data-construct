package com.michael.tree.menu.node;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TreeNodeClient {

	@RequestMapping("getTreeNode")
	public List<BootstrapTreeNode> getTreeNode() {
		List<TreeNode<Menu>> menuTree = TreeHandler.createTree(MenuFactory.getMenus());
		List<BootstrapTreeNode> bootstrapTreeNod = new ArrayList<>(menuTree.size());

		for(TreeNode<Menu> menu : menuTree) {
			bootstrapTreeNod.add(getNode(menu));
		}

		return bootstrapTreeNod;
	}

	private BootstrapTreeNode getNode(TreeNode<Menu> menus) {
		List<BootstrapTreeNode> bootNode = new ArrayList<>();
		for(TreeNode<Menu> menu : menus.getChildren()) {
			bootNode.add(getNode(menu));
		}
		if (bootNode.size() == 0) {
			bootNode = null;
		}
		Menu m = menus.getNode();
		BootstrapTreeNode node = new BootstrapTreeNode(m.getMenuId(), m.getName(), m.getUrl(), bootNode);
		return node;
	}

}
