package cz.trask.main.cool.demo;

import cz.trask.cool.list.SimpleCoolList;
import cz.trask.cool.list.existing.DemoLinkedList;
import cz.trask.helper.Dogs;

public class LinkedListDemo {

	public static void main(String[] args) {

		try {

			System.out.println("Cool linkedList main execute ...");

			SimpleCoolList demoLinkedList = new DemoLinkedList();

			demoLinkedList.addAsLast(Dogs.dog1);



		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
