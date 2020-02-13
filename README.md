# TimeAndSpaceComplexity
  
**In this tutorial i am going to explain the time and space complexity in any program. I will cover the below Topics in this Tutorial.**  
  
**1. Time Complexity**
**2. Space Complexity**
**3. Programs and their Time Complexity**  
**4. Types of time complexity**
**5. What is the use of Time Complexity**  
  
### What is Time Complexity  
In simple word, total time require to execute a program or a block of code is known as the time complexity.We can analyze the type of time complexity using the **ASYMPTOTIC ANALYSIS**.  
    
### Asymptotic Analysis  
It is the method of describing the limiting (best, average and worst ) behavior of any programming operation.  
The main Objective of Asymptotic Analysis is to measure of efficiency of the program.  
![alt tag](https://github.com/spdobest/TimeAndSpaceComplexity/blob/master/assets/asymptotic_analysis.png)     
  
There are three types of Asymptotoc Analysis  
**1. Best case**    - Which is most desirable situation which takes **minimum** time required to execute the program.     
**2. Average case** - It is average desirable situation - the **average time** required to execute the program.     
**3. Worst Case**   - It is not desirable situation at all. The **maximum time** required to execute the program.  
  
### Asymptotic Notation  
By using asymptotic notation we will calculate the running time required to execute the program.  
![alt tag](https://github.com/spdobest/TimeAndSpaceComplexity/blob/master/assets/asymptotic_notation.png)  
There are three types of **ASYMPTOTIC NOTATION**  
**1. Ο (Big Oh) Notation -** It describes the performance of the program. Big O describes the worst-case scenario i.e the longest amount of time taken to execute the program.    
**2. Ω (Omega) Notation -**  Omega describes the best-case scenario i.e the best amount of time taken to execute the program.  
**3. θ (theta)Notation -** Theta describes the both best case scenario and worst-case scenario  of a program running time.  
  
**Now i will explain Big O notation with each exmaple and its use**  
![alt tag](https://github.com/spdobest/TimeAndSpaceComplexity/blob/master/assets/common_asymptoticNotation.png)  
  
Lets understand the Big O Notation thoroughly by taking the java examples on common orders of growth like,

## O(1) – Constant**  
The O(1) is also called as constant time, it will always execute in the same time regardless of the input size. For example if the input array could be 1 item or 100 items, but this method required only one step.  
**Note:O(1) is best Time Complexity method.**  
```
int x = 10;
int y = 23;
int z = x+y;
```  

## O(log n) – Logarithmic  
In O(log n) function the complexity increases as the size of input increases. It scale up very well i.e increases the number of steps to handle large size of inputs. For example in the Binary search program it uses divide and conquer technique   (breaking down a problem into two or more sub-problems of the same type, until it become simple to be solved directly) for.  searching elements in large sized array.  
**Note: In O(log n) number of steps increases as the Size of elements increases.**  
Here is the example of O(log n)  
```
public class BinarySearch {

    int binarySearch(int []arr,int l, int r, int x){

        if(r >= l){
            int mid = (l+(r-1))/2;
            if(arr[mid] == x){
                return mid;
            }
            else{
                if(arr[mid] > x){
                    return binarySearch(arr,l,mid-1,x);
                }
                else{
                    return binarySearch(arr,mid+1,r,x);
                }
            }
        }
        else{
            return -1;
        }
    }
    public static void main(String...args){

        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {2,3,4,5,6,10,30,40};
        int position = binarySearch.binarySearch(arr,0,arr.length-1,10);
        System.out.println(position);
        
    }
}
```  
in the above example if we will increase the length of the array the time complexity will increase accordingly.That means its directly propertional to the length of the array you are passing as an argument in the program.  

## O(n log n) – n log n  
The O(n log n) function fall between the linear and quadratic function ( i.e O(n) and Ο(n2). It is mainly used in sorting algorithm to get good Time complexity. For example Merge sort and quick sort.
**Note: The O(n log n) is the good time Complexity method.**
  
```
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] x = {9, 2, 4, 7, 3, 7, 10};
        System.out.println(Arrays.toString(x));
        int low = 0;
        int high = x.length - 1;
        quickSort(x, low, high);
        System.out.println(Arrays.toString(x));
    }

    public static void quickSort(int[] arr, int low, int high) {

        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
// recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
    }
}
```
## O(n) – Linear  
The O(n) is also called as linear time, it is direct proportion to the number of inputs. For example if the array has 5 items, it will print 5 times.  
```
 public void linearProgram(int n){
        for(int i = 0;i<n;i++){
            System.out.println(i);
        }
    }  
```  
In the abve program , if the value of n increases the number of loop is also increase.  
  
**Note: In O(n) the number of elements increases, the number of steps also increases.**
## O(n2) – Quadratic    
```
public void linearProgram(int n){
  for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            System.out.println(i+" "+j);
        }
    }  
}  
```  
## O(2n) – exponential     
The O(2n) is also called as recursive calculation method i.e repeatedly it will check condition unless it becomes true, here the performance will be doubles for each input.  
```  
public class sample {
    static int n = 4;
    public static void main(String[] args) {
        if (n <= 3) {
            System.out.println(n);
        } else {
            System.out.println((n - 1) + (n - 2));
        }
    }
}
```    
## How to calculate the time complexity of the program below.  
```  
public class sample1 {

    public static void main(String[] args) {
        int n = 2;
        int p = 1;
        
        int a = 2+3;                        // O(1) complexity
        
        for (int i=0; i<n; i++) {           // O(n) complexity
            
            for (int j=0; j<n; j++)  {      //O(n) complexity
                
                for (int k=0; k<n; k++) {   //O(n) complexity
                    System.out.println(p++);
                }
            }
        }
    }
}
```  
**so the time complexity is**  
Time Complexity = O(1) + O(n) + O(n) + O(n) //taking big oh has a common factor   
   
= O(1) + O(n3)   
   
= O(1+n3)  //higher value is taken for complexity i.e n3   
   
= O(n3)   

**HERE ARE THE TIME COMPLEXITY OF THE SORTING ALGORITHM**  
![alt tag](https://github.com/spdobest/TimeAndSpaceComplexity/blob/master/assets/sortingAlgo_and_timeComplexity.png)  
