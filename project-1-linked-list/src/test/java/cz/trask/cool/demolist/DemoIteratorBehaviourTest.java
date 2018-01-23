package cz.trask.cool.demolist;

import cz.trask.helper.Dogs;
import cz.trask.pojo.Dog;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DemoIteratorBehaviourTest {



	@Test
	public void iteratorTest() {

		System.out.println("iterating over elements - start");

		List anotherList = new ArrayList();

		anotherList.add(Dogs.dog1);
		anotherList.add(Dogs.dog2);
		anotherList.add(Dogs.dog3);
		anotherList.add(Dogs.dog4);
		anotherList.add(Dogs.dog5);
		anotherList.add(Dogs.dog6);

		int counterForTest=0;

		Iterator iterator = anotherList.iterator();

		Dog expectDogAtPosition = null;

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
