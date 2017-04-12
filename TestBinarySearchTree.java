package assignmentfive;

import java.util.*;
import java.io.*;


public class TestBinarySearchTree {

  public static void main(String[] args) {
      
    /**
    * instantiate multiple different arrays to make five different trees with
    */
      Integer[] num1 = {67, 87, 55, 43, 48, 73, 91, 39, 59, 92, 34, 95, 81, 66, 40, 53, 84, 77};
      Integer[] num2 = { 13, 27, 89, 17, 29, 4, 62, 67, 98,41, 87, 44, 35, 22, 74, 93, 88};
      Integer[] num3 = {37, 19, 7, 38, 12, 23, 27, 85, 76, 45, 51, 92, 66, 77};
      Integer[] num4 = {7, 15, 8, 23, 5, 18, 85, 76, 45, 5, 92, 88,16,30};
      Integer[] num5 = {51, 92, 88, 37, 19, 0, 12, 23, 27,85, 76, 45};
      Integer[] num6 = {64, 85, 70, 61, 53, 46, 35,20};
       
      // Create an empty BinaryTree
      
     /**
       * instantiate multiple different trees to test
       */ 
      BinarySearchTree<Integer> tree1 = new BinarySearchTree<>(num1);
      BinarySearchTree<Integer> tree2 = new BinarySearchTree<>(num2);
      BinarySearchTree<Integer> tree3 = new BinarySearchTree<>(num3);
      BinarySearchTree<Integer> tree4 = new BinarySearchTree<>(num4);
      BinarySearchTree<Integer> tree5 = new BinarySearchTree<>(num5);
      BinarySearchTree<Integer> tree6 = new BinarySearchTree<>(num6);
     
      //Search
      Scanner input = new Scanner(System.in);
      System.out.println("\nEnter an element to search");
      Integer key = input.nextInt();
      System.out.println("Results for element search for Tree1");
      System.out.println(tree1.search(key));
      System.out.println("Results for element search for Tree2");
      System.out.println(tree2.search(key));
      
      //Insert
      System.out.println("\nEnter an element to insert");
      Integer insertkey = input.nextInt();
      System.out.println("Results for element insert for Tree1");
      System.out.println(tree1.delete(insertkey));
      System.out.println("Results for element insert for Tree4");
      System.out.println(tree4.delete(insertkey));
      
      //Delete
      System.out.println("\nEnter an element to delete");
      Integer deletekey = input.nextInt();
      System.out.println("Results for element delete for Tree2");
      System.out.println(tree2.delete(deletekey));
      System.out.println("\nEnter an element to delete");
      Integer deletekey2 = input.nextInt();
      System.out.println("Results for element delete for Tree4");
      System.out.println(tree4.delete(deletekey2));
      
      //Inorder
      System.out.println("Inorder traversal of Tree1");
      tree1.inorder();
      System.out.println("Inorder traversal of Tree2");
      tree2.inorder();
      System.out.println("Inorder traversal of Tree3");
      tree3.inorder();
      
      //Perorder
      System.out.println("Preorder traversal of Tree2");
      tree2.inorder();
      System.out.println("Preorder traversal of Tree3");
      tree3.inorder();
      System.out.println("Preorder traversal of Tree4");
      tree4.inorder();
      
      //Postorder
      System.out.println("Postorder traversal of Tree2");
      tree2.inorder();
      System.out.println("Postorder traversal of Tree5");
      tree3.inorder();
      System.out.println("Postorder traversal of Tree6");
      tree4.inorder();
      
      //Path
      System.out.println("\nEnter an element to find the path in Tree2");
      Integer pathkey = input.nextInt();
      System.out.println("Path of element of Tree2");
      System.out.println(tree2.path(pathkey));
      System.out.println("\nEnter an element to find the path in Tree3");
      Integer pathkey2 = input.nextInt();
      System.out.println("Path of element of Tree3");
      System.out.println(tree3.path(pathkey2));
      
      //LeftSubTree
      System.out.println("\nEnter an element to find the left sub-tree of");
      Integer leftsubtreekey1 = input.nextInt();
      System.out.println("left subtree of element in Tree1");
      System.out.println(tree1.leftSubTree(leftsubtreekey1));
      System.out.println("\nEnter an element to find the left sub-tree of");
      Integer leftsubtreekey2 = input.nextInt();
      System.out.println("left subtree of element in Tree4");
      System.out.println(tree4.leftSubTree(leftsubtreekey2));
      
      //RightSubTree
      System.out.println("\nEnter an element to find the right sub-"
              + ""
              + ""
              + "tree of");
      Integer rightsubtreekey1 = input.nextInt();
      System.out.println("right subtree of element in Tree1");
      System.out.println(tree1.leftSubTree(rightsubtreekey1));
      System.out.println("\nEnter an element to find the right sub-tree of");
      Integer rightsubtreekey2 = input.nextInt();
      System.out.println("right subtree of element in Tree3");
      System.out.println(tree3.leftSubTree(rightsubtreekey2));
      
      //GetNumberOfLeaves
      System.out.println("Number of leaves in Tree2");
      System.out.println(tree2.getNumberOfLeaves());
      System.out.println("Number of leaves in Tree5");
      System.out.println(tree5.getNumberOfLeaves());
      
      //SameTree
      System.out.println("Is Tree1 equal to Tree2?");
      System.out.println(tree1.sameTree(tree2));
      System.out.println("Is Tree3 equal to Tree6?");
      System.out.println(tree3.sameTree(tree6));



      
      //complete the code as suggested in the Lab document.
      

     
  }
}
