package com.example;

import java.util.*;
import org.json.simple.*;

public class QueueStackLab {

  private static Queue<String> cupcakeQueue = new LinkedList<String>();
  private static Stack<String> cupcakeStack = new Stack<String>();
  private static Collection<String> cupcaNameArray;
  private static LinkedList<String> cupcakeNameArray;

  public static void main(String[] args) {
    String fileName =
      "/Users/natnaelebuy/Documents/GitHub/Githubnatnael/lab-week-8/demo/src/main/java/com/example/cupcake_test_10.json";

    // read cupcake names
    JSONArray cupcakeArray = JSONFile.readArray(fileName);

    // get and sort array
    ArrayList<String> cupcakeNameArray = new ArrayList<String>();
    cupcakeNameArray = nameArray(cupcakeArray);
    System.out.println(cupcakeNameArray);
    Collections.sort(cupcakeNameArray);

    // print array
    System.out.println("----- array -----");
    print(cupcakeNameArray);

    // print queue
   System.out.println("----- queue -----");
   print(cupcakeNameArray);

   // print stack
  System.out.println("----- stack -----");
  print(cupcakeNameArray);

    // add each cupcake to a queue
    copyToQueue(cupcakeNameArray);
    printAndEmptyQueue(cupcakeNameArray);

    // add each cupcake to a stack
    copyToStack(cupcakeNameArray);
    printAndEmptyQueue(cupcakeNameArray);
  }

  // get array of cupcake names
  public static ArrayList<String> nameArray(JSONArray cupcakeArray) {
    ArrayList<String> arr = new ArrayList<String>();

    // get names from json object
    for (int i = 0; i < cupcakeArray.size(); i++) {
      JSONObject o = (JSONObject) cupcakeArray.get(i);
      String name = (String) o.get("name");
      arr.add(name);
    }
    return arr;
  }

  // print cupcake array
  public static void print(ArrayList<String> cupcakeNameArray) {
    for (int i = 0; i < cupcakeNameArray.size(); i++) {
      System.out.printf("%04d\t%s\n", i, cupcakeNameArray.get(i));
    }
  }

  // copy cupcakes to the queue
  public static void copyToQueue(ArrayList<String> cupcakeNameArray) {
    for (int i = 0; i < cupcaNameArray.size(); i++){
      System.out.printf("%04d\t%s\n", i , cupcakeNameArray.get(i));
    }
    
  }

  // prints and empties the queue
  public static void printAndEmptyQueue(ArrayList<String> cupcakeNameArrayList) {
    int sizeof = cupcaNameArray.size();
    for (int i = 0; i < sizeof; i ++){
      System.out.printf("%04d\t%s\n", i , cupcakeNameArray.get(0));
      cupcaNameArray.remove(0);
    }
    
  }

  // copy cupcakes to the stack
  public static void copyToStack(ArrayList<String> cupcakeNameArray) {
    for ( int i = 0; i < cupcakeNameArray.size(); i++){
      System.out.printf("%04d\t%s\n", i , cupcakeNameArray.get(i));
    }
  }

  // prints and empties the queue
  public static void printAndEmptyStack(ArrayList<String> cupcaArrayList) {
    int sizeof = cupcaNameArray.size();
    for (int i = sizeof; i > 0; i-- ){
      System.out.printf("%04d\t%s\n", i , cupcakeNameArray.get(-1));
      cupcaNameArray.remove(-i);
    }
    
  }
  
}
