package com.bridgeLabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {
	@Test
	void given3NumbersWhenAddedToLinkedList_ShouldBeAddedToTop(){
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(56);
		MyLinkedList myLinkedList= new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNode();
		boolean result=myLinkedList.head.equals(myThirdNode) &&
				myLinkedList.head.getNext().equals(mySecondNode)&&
				myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}
	@Test
	void given3NumbersAppend_ShouldBeAddedToLast(){
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(70);
		MyLinkedList myLinkedList= new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printMyNode();
		boolean result=myLinkedList.head.equals(myFirstNode) &&
				myLinkedList.head.getNext().equals(mySecondNode)&&
				myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	@Test
	void givenNumbersWhenInsert_ShouldPassLinkListResult(){
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(70);
		MyLinkedList myLinkedList= new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode,mySecondNode);
		myLinkedList.printMyNode();
		boolean result=myLinkedList.head.equals(myFirstNode) &&
				myLinkedList.head.getNext().equals(mySecondNode)&&
				myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	@Test
	void givenNumbersWhenDeleted_ShouldPassLinkListResult(){
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(70);
		MyLinkedList myLinkedList= new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.pop();
		myLinkedList.printMyNode();
		boolean result=myLinkedList.head.equals(mySecondNode) &&
				       myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
}