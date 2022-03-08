package com.test;

       /*
DEVELOPING GAME IN JAVA 

Caracteristiques

Editeur : NEW RIDERS 
Auteur : BRACKEEN 
Parution : 09 2003 
Pages : 972 
Isbn : 1-59273-005-1 
Reliure : Paperback 
Disponibilite : Disponible a la librairie 
*/

public class TreeStructure {

  public static void main(String[] args) {
    new TreeStructure().run();
  }

  class Node {
    Node left;
    Node right;

    int value;

    public Node(int value) {
      this.value = value;
    }
  }

  public void run() {
    // build the simple tree from chapter 11.
    Node root = new Node(5);
    System.out.println("Binary Tree Example");
    System.out.println("Building tree with root value " + root.value);
    insert(root, 1);
    insert(root, 8);
    insert(root, 6);
    insert(root, 3);
    insert(root, 9);
    System.out.println("Traversing tree in order");
    printInOrder(root);
    //System.out.println("Traversing tree front-to-back from location 7");
    //printFrontToBack(root, 7);
  }

  public void insert(Node node, int value) {
    if (value < node.value) {
      if (node.left != null) {
        insert(node.left, value);
      } else {
        System.out.println("  Inserted " + value + " to left of "
            + node.value);
        node.left = new Node(value);
      }
    } else if (value > node.value) {
      if (node.right != null) {
        insert(node.right, value);
      } else {
        System.out.println("  Inserted " + value + " to right of "
            + node.value);
        node.right = new Node(value);
      }
    }
  }

  public void printInOrder(Node node) {
    if (node != null) {
      printInOrder(node.left);
      System.out.println("  Traversed " + node.value);
      printInOrder(node.right);
    }
  }

  /**
   * uses in-order traversal when the origin is less than the node's value
   * 
   * uses reverse-order traversal when the origin is greater than the node's
   * order
   */
  public void printFrontToBack(Node node, int camera) {
    if (node == null)
      return;
    if (node.value > camera) {
      // print in order
      printFrontToBack(node.left, camera);
      System.out.println("  Traversed " + node.value);
      printFrontToBack(node.right, camera);
    } else if (node.value < camera) {
      // print reverse order
      printFrontToBack(node.right, camera);
      System.out.println("  Traversed " + node.value);
      printFrontToBack(node.left, camera);
    } else {
      // order doesn't matter
      printFrontToBack(node.left, camera);
      printFrontToBack(node.right, camera);
    }
  }

}