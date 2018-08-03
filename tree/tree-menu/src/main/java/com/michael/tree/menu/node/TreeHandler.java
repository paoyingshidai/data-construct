package com.michael.tree.menu.node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TreeHandler {

	public static List<TreeNode<Menu>> createTree(Map<Integer, Menu> menus) {

		Map<Integer, TreeNode<Menu>> treeNodes = new HashMap<Integer, TreeNode<Menu>>();
		List<TreeNode<Menu>> nodeList = new ArrayList<>();

		for(Entry<Integer, Menu> menuEntry : menus.entrySet()) {
			Menu menu = menuEntry.getValue();
			TreeNode<Menu> node = new TreeNode<Menu>(menu);
			treeNodes.put(menu.getMenuId(), node);
		}

		for(Entry<Integer, TreeNode<Menu>> menuEntry : treeNodes.entrySet()) {
			TreeNode<Menu> menu = menuEntry.getValue();
			Integer parentId = menu.getNode().getParentId();

//			if (parentId == null || parentId == 0) {
			if (menu.getNode().getLevel() == 0) {
				nodeList.add(menu);
			} else {
				treeNodes.get(parentId).getChildren().add(menu);
			}
		}
		return nodeList;
	}

}
