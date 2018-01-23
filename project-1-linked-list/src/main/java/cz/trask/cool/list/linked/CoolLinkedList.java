package cz.trask.cool.list.linked;

import cz.trask.cool.list.CoolIterator;
import cz.trask.cool.list.CoolList;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;

public class CoolLinkedList implements CoolList {

	public int getListSize() {
		return 0;
	}

	public boolean isListEmpty() {
		return false;
	}

	public void addAsLast(Object e) {

	}

	public boolean removeFirstElement() {
		return false;
	}

	public void removeLastElement() {

	}

	public Object getFirstElement() {
		return null;
	}

	public Object getLastElement() {
		return null;
	}

	public void clearList() {

	}

	//--------

	public boolean addAllToEndOfList(Collection c) {
		return false;
	}

	public Object replaceAtPosition(int index, Object element) {
		return null;
	}

	public void addAtPosition(int index, Object element) {

	}

	public Object removeAtPosition(int index) {
		return null;
	}

	public Object get(int index) {
		return null;
	}

	//--------



	public CoolIterator getCoolIterator() {

		//TODO dokoncit anonymni tridu
		return new CoolIterator() {

			public boolean hasNext() {
				throw new NotImplementedException();
			}

			public Object next() {
				throw new NotImplementedException();
			}
		};

	}


}
