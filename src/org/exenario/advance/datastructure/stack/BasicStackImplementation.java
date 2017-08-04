package org.exenario.advance.datastructure.stack;

/**
 *
 *  Stack implementation with a fixed-size array.
 *
 *  Created by barunb on 6/4/17.
 */

public class BasicStackImplementation {
   // private int stackSize;
    private int[] stackArray;
    private int top;

    public BasicStackImplementation(int sizeOfStack){
       // this.stackSize=sizeOfStack;
        this.stackArray=new int[sizeOfStack];
        this.top=-1;

    }

    public void push(int items)throws Exception{
        if(this.isFull()){
            throw new Exception("Stack is Full");
        }
        else{
            System.out.println("Adding Item : " + items);
            this.stackArray[++top]=items;
        }

    }

    public int pop()throws Exception{
        if(this.isEmpty()){
            throw new Exception("Stack is empty");
        }
        System.out.print("Removing item ");
        int item = this.stackArray[top--];
        System.out.println(item);
        return item;
    }

    public int peek(){
        return this.stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == stackArray.length -1);
    }

    public void printStack(){
        for(int i=0;i<=top;i++){
            System.out.print(stackArray[i] + ", ");
        }
        System.out.println(" ");
    }

    public static void main(String args[]){
        BasicStackImplementation mystack = new BasicStackImplementation(5);
        try{
            System.out.println("Is Your Stack Empty "+ mystack.isEmpty());
            //System.out.println("current item at top "+mystack.peek());
            mystack.push(1);
            mystack.push(2);
            System.out.println("Is Your Stack Empty "+ mystack.isEmpty());
            System.out.println("Is Your Stack full "+ mystack.isFull());
            mystack.push(3);
            System.out.println("current item at top "+mystack.peek());
            mystack.push(4);
            mystack.push(5);
            System.out.println("Is Your Stack full "+ mystack.isFull());
            mystack.pop();
            System.out.println("Is Your Stack full "+ mystack.isFull());
            System.out.println("Current Stack Size "+ (mystack.top+1));
            mystack.printStack();
            System.out.println("current item at top "+mystack.peek());

        }catch (Exception e){
            System.out.println(e);
        }
    }

}

