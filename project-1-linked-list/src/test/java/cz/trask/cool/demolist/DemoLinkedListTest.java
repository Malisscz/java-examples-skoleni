package cz.trask.cool.demolist;

import cz.trask.cool.list.CoolIterator;
import cz.trask.cool.list.CoolList;
import cz.trask.helper.Dogs;
import cz.trask.cool.list.SimpleCoolList;
import cz.trask.cool.list.existing.DemoLinkedList;
import cz.trask.thing.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoLinkedListTest {


	@Test
	public void addAndRemoveTest() {

		System.out.println("addRemoveTest start");

		SimpleCoolList firstList = new DemoLinkedList();

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

		SimpleCoolList anotherList = new DemoLinkedList();


		anotherList.addAsLast(Dogs.dog1);
		anotherList.addAsLast(Dogs.dog5);
		anotherList.addAsLast(Dogs.dog6);

		assertEquals(3,anotherList.getListSize());

		Object lastDog = anotherList.getLastElement();

		assertEquals(Dogs.dog6,lastDog);

		anotherList.removeLastElement();

		Object nowLastDog = anotherList.getLastElement();

		assertEquals(Dogs.dog5,nowLastDog);

		anotherList.removeLastElement();

		Object lastAndFirstDog = anotherList.getLastElement();

		assertEquals(Dogs.dog1,lastAndFirstDog);

		anotherList.removeLastElement();

		assertEquals(0,anotherList.getListSize());

		System.out.println("addAndGetAndRemoveTest finished");

	}

	@Test
	public void testThatWillFail() {

		System.out.println("will fail test - start");

		SimpleCoolList anotherList = new DemoLinkedList();

		anotherList.addAsLast(Dogs.dog2);
		anotherList.addAsLast(Dogs.dog1);
		anotherList.addAsLast(Dogs.dog6);

		assertEquals(3,anotherList.getListSize());

		Object lastDog = anotherList.getLastElement();

		assertEquals(Dogs.dog3,lastDog);

		anotherList.removeLastElement();

		Object nowLastDog = anotherList.getLastElement();

		assertEquals(Dogs.dog5,nowLastDog);

		anotherList.removeLastElement();

		Object lastAndFirstDog = anotherList.getLastElement();

		assertEquals(Dogs.dog1,lastAndFirstDog);

		anotherList.removeLastElement();

		assertEquals(0,anotherList.getListSize());

		System.out.println("will fail test - finished");

	}

}