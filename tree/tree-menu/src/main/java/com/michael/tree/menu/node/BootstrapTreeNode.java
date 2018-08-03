package com.michael.tree.menu.node;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TreeNode 的再封装
 * @author Michael
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BootstrapTreeNode {

	private Integer menuId;

	private String name;

	private String url;

	private List<BootstrapTreeNode> children;
}
