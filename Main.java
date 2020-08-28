/*
  Important note:
  1.(U)List out 3 different input/output examples (short input, long input, edge case)

  2.(U)List out any additional clarifying questions

    Are there any space and time constraints?

    How should we handle null/empty inputs and outputs?

    Will the inputs be sorted?
    
    What is the largest input expected?

  3.(M) Verbally discuss 1-2 ways to solve the problem and discuss, discussing tradeoffs 

  4.(M) Think of helper methods if any
  
  5.(P) Pseudocode
*/

/****************************
Given an array of size n and a number x, determine the first two elements in the array, if any, whose sum is exactly x.

  U: Is the array sorted?

    Are values in the array positive and negative?

    Do you want them 
    next to each other? For example

    [1  5 2  4]; output: (1, 5)
    OR is the tie breaker starting with the first number like so:
    [1  2  5 4]; output:? (1, 5)?


  M: A HashMap can help us find the sum by (keys=index, values, being numbers) 

  P:You can go to the first key, 
  subtract the value from x
  then use the .containsValue method to see if the corresponding  addend
***************************/
class Main {
  public static void main(String[] args) {
  int[] arr = {1, 5, 2, 4};
  FindSum<Intger> obj = new FindSum<Integer>(arr);
  int[] result;
  result = obj.findPair(6);
  }
}

class FindSum
{
  private int[] numb = {};


  public FindSum(int[] arr)
  {
    numb = arr;
  } 

  public int[] findPair(int x)
  {
    int[] result = {};
    //initializing the HashMap
    Hashtable<Integer, Integer> arrayToDict = new Hashtable<Integer, Integer>();

    for(i = 1; i < numb.length;i++)
    {
      arrayToDict.put(i, num[i]);
    }
    for(i = 1; i < numb.length;i++)
    {
      array
    }


    return result;
  }
}