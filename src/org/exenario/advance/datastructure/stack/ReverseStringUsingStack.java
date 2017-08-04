package org.exenario.advance.datastructure.stack;

/**
 * Created by barunb on 6/5/17.
 */
public class ReverseStringUsingStack {
    public String ReverseStringUsingStack(String originalString) throws Exception{

        StringBuilder reverseString = new StringBuilder();
        StackImplementation mystack = new StackImplementation(originalString.length());
        for(int i=0;i<originalString.length();i++){
            mystack.push(originalString.charAt(i));
        }
        while(!mystack.isEmpty()){
            reverseString.append(mystack.pop());
        }

        return reverseString.toString();

    }
    public static void main(String a[]){
        ReverseStringUsingStack mwr = new ReverseStringUsingStack();
        try {
            System.out.println("Java2Novice == "+mwr.ReverseStringUsingStack("Java2Novice"));
            System.out.println("Java == "+mwr.ReverseStringUsingStack("Java"));
            System.out.println("program == "+mwr.ReverseStringUsingStack("program"));
        }catch (Exception e){

        }
    }
}

class StackImplementation {
    // private int stackSize;
    private int[] stackArray;
    private int top;

    public StackImplementation(int sizeOfStack){
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

}
