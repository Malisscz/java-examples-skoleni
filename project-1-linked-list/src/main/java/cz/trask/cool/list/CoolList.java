package cz.trask.cool.list;


/**
 * CoolList spojuje SimpleCoolList a IndexAccessList
 * a rozsiruje je o iterator ...
 */
public interface CoolList extends SimpleCoolList,IndexAccessList {


	CoolIterator getCoolIterator();

}
