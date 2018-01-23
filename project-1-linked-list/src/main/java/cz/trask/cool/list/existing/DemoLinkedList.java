package cz.trask.cool.list.existing;

import cz.trask.cool.list.SimpleCoolList;

import java.util.LinkedList;

/**
 * Linked list based on java's own linkedList for testing purpose
 */
public class DemoLinkedList extends LinkedList implements SimpleCoolList {

	public int getListSize() {
		return size();
	}

	public boolean isListEmpty() {
		return isEmpty();
	}

	public void addAsLast(Object e) {
		add(e);
	}

	public boolean removeFirstElement() {
		Object removed = remove(0);

		return removed == null ? false : true;
	}

	public void removeLastElement() {
		removeLast();
	}

	public Object getFirstElement() {
		return getFirst();
	}

	public Object getLastElement() {
		return getLast();
	}

	public void clearList() {
		clear();
	}

}
