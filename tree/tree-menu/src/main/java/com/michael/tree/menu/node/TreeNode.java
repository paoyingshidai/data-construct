package com.michael.tree.menu.node;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode<T> {

	private T node;

	private List<TreeNode<T>> children = new ArrayList<>();

	public TreeNode(T node) {
		this.node = node;
	}

}
