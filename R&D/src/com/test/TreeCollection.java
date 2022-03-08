package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TreeCollection {

	List<TreeCollection> tc = new ArrayList<TreeCollection>();

	private ArrayList<TreeCollection> leafs = new ArrayList<TreeCollection>();

	private TreeCollection parent = null;

	private HashMap<TreeCollection, TreeCollection> locate = new HashMap<TreeCollection, TreeCollection>();

	public TreeCollection(TreeCollection head) {
		this.head = head;
		locate.put(head, this);
	}

	public static void main(String[] args) {

	}

}
