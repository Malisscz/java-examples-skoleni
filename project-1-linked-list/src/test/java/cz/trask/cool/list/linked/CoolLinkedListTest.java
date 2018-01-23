package cz.trask.cool.list.linked;

import cz.trask.cool.list.SimpleCoolList;
import cz.trask.thing.Dog;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoolLinkedListTest {

	final Dog dog1 = new Dog("Max");
	final Dog dog2 = new Dog("Bella");
	final Dog dog3 = new Dog("Cooper");
	final Dog dog4 = new Dog("Charlie");
	final Dog dog5 = new Dog("Lucy");
	final Dog dog6 = new Dog("Daisy");

	@Before
	public void setUp() throws Exception {

		System.out.println("Dogs: ");
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		System.out.println(dog4);
		System.out.println(dog5);
		System.out.println(dog6);
	}

	@Test
	public void addAndRemoveTest() {

		System.out.println("addRemoveTest start");

		SimpleCoolList firstList = new SimpleLinkedList();

		firstList.addAsLast(dog1);
		firstList.addAsLast(dog2);
		firstList.addAsLast(dog3);
		firstList.addAsLast(dog4);

		assertEquals(4,firstList.getListSize());

		firstList.removeLastElement();
		firstList.removeLastElement();

		assertEquals(2,firstList.getListSize());


		firstList.removeLastElement();
		firstList.removeLastElement();

		assertEquals(0,firstList.getListSize());

		System.out.println("addRemoveTest finished");

	}

	@Test
	public void addAndGetAndRemoveTest() {

		System.out.println("addAndGetAndRemoveTest start");

		SimpleCoolList anotherList = new SimpleLinkedList();


		anotherList.addAsLast(dog1);
		anotherList.addAsLast(dog2);
		anotherList.addAsLast(dog3);

		assertEquals(3,anotherList.getListSize());

		Object lastDog = anotherList.getLastElement();

		assertEquals(dog3,lastDog);

		anotherList.removeLastElement();

		Object nowLastDog = anotherList.getLastElement();

		assertEquals(dog2,nowLastDog);

		anotherList.removeLastElement();

		Object lastAndFirstDog = anotherList.getLastElement();

		assertEquals(dog1,lastAndFirstDog);

		anotherList.removeLastElement();

		assertEquals(0,anotherList.getListSize());

		System.out.println("addAndGetAndRemoveTest finished");

	}


}