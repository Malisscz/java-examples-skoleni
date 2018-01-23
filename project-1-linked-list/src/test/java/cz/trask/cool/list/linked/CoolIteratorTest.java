package cz.trask.cool.list.linked;

import cz.trask.cool.list.CoolIterator;
import cz.trask.cool.list.CoolList;
import cz.trask.helper.Dogs;
import cz.trask.pojo.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoolIteratorTest {


	@Test
	public void iteratorTest() {

		System.out.println("iterating over elements - start");

		CoolList anotherList = new CoolLinkedList();

		anotherList.addAsLast(Dogs.dog1);
		anotherList.addAsLast(Dogs.dog2);
		anotherList.addAsLast(Dogs.dog3);
		anotherList.addAsLast(Dogs.dog4);
		anotherList.addAsLast(Dogs.dog5);
		anotherList.addAsLast(Dogs.dog6);

		int counterForTest=0;


		CoolIterator iterator = anotherList.getCoolIterator();

		Dog expectDogAtPosition = null;

		assertEquals(6 , anotherList.getListSize());

		while(iterator.hasNext()){
			Dog currentDog = (Dog) iterator.next();

			switch (counterForTest){
			case 0:
				expectDogAtPosition = Dogs.dog1;
				break;
			case 1:
				expectDogAtPosition = Dogs.dog2;
				break;
			case 2:
				expectDogAtPosition = Dogs.dog3;
				break;
			case 3:
				expectDogAtPosition = Dogs.dog4;
				break;
			case 4:
				expectDogAtPosition = Dogs.dog5;
				break;
			case 5:
				expectDogAtPosition = Dogs.dog6;
				break;
			default:
				break;
			}

			counterForTest++;

			System.out.println(currentDog);
			assertEquals(expectDogAtPosition , currentDog);
		}


		System.out.println("iterating over elements - end");


	}
}
