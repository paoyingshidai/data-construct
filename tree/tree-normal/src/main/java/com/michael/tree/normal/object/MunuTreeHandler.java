package com.michael.tree.normal.object;

import java.util.List;

import org.springframework.util.CollectionUtils;

public class MunuTreeHandler {

	/**
	 * 输入的是一堆节点，输出一颗有结构的树
	 * @param nodes
	 * @return
	 */
	public static TreeNode<Menu> createTree(List<Menu> menus) {

		if (CollectionUtils.isEmpty(menus)) {
			return null;
		}
		
		


		return null;
	}

	/**
	 * 前序遍历
	 * @param node
	 */
	public static <T> void preTraverse(TreeNode<T> node) {

	}

	/**
	 * 中序遍历
	 * @param node
	 */
	public static <T> void midTraverse(TreeNode<T> node) {

	}

	/**
	 * 后序遍历
	 * @param node
	 */
	public static <T> void postTraverse(TreeNode<T> node) {

	}

}
