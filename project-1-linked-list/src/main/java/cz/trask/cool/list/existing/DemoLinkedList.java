package cz.trask.cool.list.existing;

import cz.trask.cool.list.CoolIterator;
import cz.trask.cool.list.CoolList;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Linked list based on java's own linkedList for testing purpose
 */
public class DemoLinkedList extends LinkedList implements CoolList {

	//--- z SimpleCoolListu

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


	//--- z SimpleCoolListu - END



	//--- z IndexAccessListu

	public boolean addAllToEndOfList(Collection c) {
		return addAll(c);
	}

	public Object replaceAtPosition(int index, Object element) {
		return set(index, element);
	}

	public void addAtPosition(int index, Object element) {
		add(index, element);
	}

	public Object removeAtPosition(int index) {
		return remove(index);
	}


	//--- z IndexAccessListu - END


	//--- z CoolListu

	public CoolIterator getCoolIterator(){
		throw new UnsupportedOperationException();
	}

	//--- z CoolListu - END

}
