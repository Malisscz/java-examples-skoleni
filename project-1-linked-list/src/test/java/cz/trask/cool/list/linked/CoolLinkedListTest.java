package cz.trask.cool.list.linked;

import cz.trask.helper.Dogs;
import cz.trask.cool.list.SimpleCoolList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoolLinkedListTest {



	@Before
	public void setUp() throws Exception {

		System.out.println("Dogs: ");
		System.out.println(Dogs.dog1);
		System.out.println(Dogs.dog2);
		System.out.println(Dogs.dog3);
		System.out.println(Dogs.dog4);
		System.out.println(Dogs.dog5);
		System.out.println(Dogs.dog6);
	}

	@Test
	public void addAndRemoveTest() {

		System.out.println("addRemoveTest start");

		SimpleCoolList firstList = new SimpleLinkedList();

		firstList.addAsLast(Dogs.dog1);
		firstList.addAsLast(Dogs.dog2);
		firstList.addAsLast(Dogs.dog3);
		firstList.addAsLast(Dogs.dog4);

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


		anotherList.addAsLast(Dogs.dog1);
		anotherList.addAsLast(Dogs.dog2);
		anotherList.addAsLast(Dogs.dog3);

		assertEquals(3,anotherList.getListSize());

		Object lastDog = anotherList.getLastElement();

		assertEquals(Dogs.dog3,lastDog);

		anotherList.removeLastElement();

		Object nowLastDog = anotherList.getLastElement();

		assertEquals(Dogs.dog2,nowLastDog);

		anotherList.removeLastElement();

		Object lastAndFirstDog = anotherList.getLastElement();

		assertEquals(Dogs.dog1,lastAndFirstDog);

		anotherList.removeLastElement();

		assertEquals(0,anotherList.getListSize());

		System.out.println("addAndGetAndRemoveTest finished");

	}


}