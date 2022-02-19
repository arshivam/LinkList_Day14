package com.bridgeLabz;

public class MyLinkedList <K> {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}

	public void add(INode newNode) {

		if (this.tail==null){
			this.tail=newNode;
		}
		if (this.head==null){
			this.head=newNode;
		}else {
			INode tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode myNode) {
		if (this.head==null){
			this.head=myNode;
		}
		if (this.tail==null){
			this.tail=myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail=myNode;
		}
	}

	public void insert (INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	public INode pop () {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public INode popLast() {
		INode tempNode = head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode.setNext(null);
		return tempNode;
	}

	public boolean search(INode node) {
		INode tempNode = head;
		boolean found = false;
		while(tempNode.getNext() != null) {
			if(tempNode.getKey() == node.getKey()) {
				found = true;
			}
			tempNode = tempNode.getNext();
		}
		return found;
	}

	public void searchThenInsert(INode searchNode, INode insertNode) {
		MyLinkedList n = new MyLinkedList();
		INode tempNode = head;
		boolean inserted = false;
		while(tempNode.getNext() != null) {
			if(tempNode.getKey() == searchNode.getKey()) {
				n.insert(searchNode,insertNode);
			}
			tempNode = tempNode.getNext();
		}
	}
	
	public void printMyNode(){
		StringBuffer myNodes=new StringBuffer("My Nodes :");
		INode tempNode=head;
		while (tempNode.getNext()!=null){
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))myNodes.append("->");
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

}
