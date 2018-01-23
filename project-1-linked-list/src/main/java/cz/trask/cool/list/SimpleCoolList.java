package cz.trask.cool.list;

public interface SimpleCoolList {

	/**
	 * Returns the number of elements in this list.  If this list contains
	 * more than <tt>Integer.MAX_VALUE</tt> elements, returns
	 * <tt>Integer.MAX_VALUE</tt>.
	 *
	 * @return the number of elements in this list
	 */
	int getListSize();

	/**
	 * Returns <tt>true</tt> if this list contains no elements.
	 *
	 * @return <tt>true</tt> if this list contains no elements
	 */
	boolean isListEmpty();

	/**
	 * Appends the specified element to the end of this list (optional
	 * operation).
	 *	 *
	 * @param e element to be appended to this list
	 * @throws NullPointerException if the specified element is null and this
	 *         list does not permit null elements
	 */
	void addAsLast(Object e);

	/**
	 * Removes first element from this list
	 *
	 * 	 @throws NullPointerException if the first element is null
	 */
	boolean removeFirstElement();

	/**
	 * Removes last element from this list
	 *
	 * @throws NullPointerException if the last element is null
	 */
	void removeLastElement();


	/**
	 * Returns the element at first position of this list.
	 *
	 * @return the element at the first position in this list
	 */
	Object getFirstElement();


	/**
	 * Returns the element at last position of this list.
	 *
	 * @return the element at the last position in this list
	 */
	Object getLastElement();


	/**
	 * Removes all of the elements from this list.
	 * The list will be empty after this call returns.
	 *
	 */
	void clearList();
}
