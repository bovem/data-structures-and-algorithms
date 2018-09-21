# DATA STRUCTURES IN C  

## Array
Array is a primitive data structure that stores a collection of similar kind(type) of data in an order(index).  

```int arr[5] = {1,23,54,64,45};```  

This is an array with space for 5 elements and it can only store data of integer type.  

## Stack  
Stack is an abstract data type based on First In Last Out i.e. the first element to be pushed to the stack will be the last to be popped. Like in a book stack, in order to get to the book at the bottom, you have to remove the books at the top.

A stack has a *top* and *last*. 

### Insertion into Stack
At the beginning the top and last are -1 (not 0 because if last is 0 then there must be an element at 0th index). As soon as first element is inserted into stack the top and last shifts from -1 to 0, as second element is inserted the top shifts to 1, then at next push top shifts to 2 and so on.  

### Deletion from Stack  
Assuming we have a stack with 5 elements(last=0 and top=4). If we remove an element, the first element from top will be popped and top will be shifted to 3, and at next deletion top will be shifted to 2. When there are no more elements to pop, top and last are resetted to -1.  

### Algorithms for Pushing and Popping from Stack  
```if sizeofstack - 1 == top```   
```      Stack Overflow     ``` 
```endif                    ``` 
```top = top + 1            ```
```stack[top] = item        ```
```Element pushed           ```    


**USES**: In Recursive functions  

## Queue  
Queue is also an abstract data type based on First In First Out i.e. the first element to be pushed to the queue will be the first one to be pulled out. Like in queue, the first person to get  in line will be first to go out.  

**USES**: In 

## List  
List is a similar data type to Array but it can store different kinds(types) of data rather than storing single kind of data. A list can have string, char, int and float in it at the same time.  

## Linked List  
