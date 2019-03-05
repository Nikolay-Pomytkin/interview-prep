import java.util.*;
import java.io.*;

public class BinarySearchTree {


    public static void main(String [] args){

	BinarySearchTree tree = new BinarySearchTree(20);

	tree.add(10);
	tree.add(30);
	tree.add(5);
	tree.add(15);
	tree.add(25);
	tree.add(35);

	tree.printTree();
	
	
    }
    
    Node head;
    public BinarySearchTree(int head){
	this.head = new Node(null, null, head);			
    }



    public class Node{
	Node left, right;
	int d;
	public Node(Node left, Node right, int d){
		this.left = left;
		this.right = right;
		this.d = d;		
	}

    }

    public void add(int data){
	addAux(data, head);
    }

    private void addAux(int data, Node n){
	if(n data == n.d) return;
	if(data < n.d){
	    if(n.left != null){
		addAux(data, n.left);
	    } else {
		n.left = new Node(null, null, data);
	    }
	}
	if(data > n.d){
	    if(n.right != null) {
		addAux(data, n.left);
	    } else {
		n.right = new Node(null, null, data);
	    }
	}
    }

    public void printTree(){
	StringBuffer x = new StringBuffer();

	printAux(x, head);
	
	System.out.println(x.toString());
    }

    private void printAux(StringBuffer s, Node curr){

	if(curr == null){
	    return;
	}

	printAux(s, curr.left);
	s.append(curr.d + ", ");
	printAux(s, curr.right);
    }
    
    
}
