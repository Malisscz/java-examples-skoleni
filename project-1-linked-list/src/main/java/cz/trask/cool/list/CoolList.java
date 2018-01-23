package cz.trask.cool.list;

import java.util.Collection;

public interface CoolList extends SimpleCoolList{

	/**
	 * Appends all of the elements in the specified collection to the end of
	 * this list, in the order that they are returned by the specified
	 * collection's iterator (optional operation).  The behavior of this
	 * operation is undefined if the specified collection is modified while
	 * the operation is in progress.  (Note that this will occur if the
	 * specified collection is this list, and it's nonempty.)
	 *
	 * @param c collection containing elements to be added to this list
	 * @return <tt>true</tt> if this list changed as a result of the call
	 * @throws NullPointerException if the specified collection contains one
	 *         or more null elements and this list does not permit null
	 *         elements, or if the specified collection is null
	 */
	boolean addAllToEndOfList(Collection c);



	/**
	 * Replaces the element at the specified position in this list with the
	 * specified element (optional operation).
	 *
	 * @param index index of the element to replace
	 * @param element element to be stored at the specified position
	 * @return the element previously at the specified position
	 * @throws NullPointerException if the specified element is null and
	 *         this list does not permit null elements
	 * @throws IndexOutOfBoundsException if the index is out of range
	 *         (<tt>index &lt; 0 || index &gt;= getListSize()</tt>)
	 */
	Object replaceAtPosition(int index, Object element);

	/**
	 * Inserts the specified element at the specified position in this list
	 * (optional operation).  Shifts the element currently at that position
	 * (if any) and any subsequent elements to the right (adds one to their
	 * indices).
	 *
	 * @param index index at which the specified element is to be inserted
	 * @param element element to be inserted
	 * @throws NullPointerException if the specified element is null and
	 *         this list does not permit null elements
	 * @throws IndexOutOfBoundsException if the index is out of range
	 *         (<tt>index &lt; 0 || index &gt; getListSize()</tt>)
	 */
	void addAtPosition(int index, Object element);

	/**
	 * Removes the element at the specified position in this list (optional
	 * operation).  Shifts any subsequent elements to the left (subtracts one
	 * from their indices).  Returns the element that was removed from the
	 * list.
	 *
	 * @param index the index of the element to be removed
	 * @return the element previously at the specified position
	 * @throws UnsupportedOperationException if the <tt>remove</tt> operation
	 *         is not supported by this list
	 * @throws IndexOutOfBoundsException if the index is out of range
	 *         (<tt>index &lt; 0 || index &gt;= getListSize()</tt>)
	 */
	Object removeAtPosition(int index);


	/**
	 * Returns the element at the specified position in this list.
	 *
	 * @param index index of the element to return
	 * @return the element at the specified position in this list
	 * @throws IndexOutOfBoundsException if the index is out of range
	 *         (<tt>index &lt; 0 || index &gt;= getListSize()</tt>)
	 */
	Object get(int index);

}
