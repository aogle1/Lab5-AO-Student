package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order
    LinkedStack<Node<String>> stack = new LinkedStack<>();
    stack.push(new Node<>("Hello", new Node<>("Second data")));
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack.peek());
    final Scanner input = new Scanner(System.in);
    while (input.hasNextLine()) {
      final String line = input.nextLine();



    }



  }
}
