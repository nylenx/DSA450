import java.util.*;

class Stack{
    int MAX = 99999;
    int TOP = -1;
    String array[] = new String[MAX];

    public void display( ){
        if(TOP==-1){System.out.println("Stack is EMPTY");}
        else{
            System.out.println("Stack: ");
            for(int i=TOP;i>=0;i--){
            System.out.println("|"+array[i]+"|");
            }
        }
    }
    public void push(String el){
        if(TOP == 99999){System.out.println("Stack Overflow");}
        else{
            array[++TOP]=el;
            System.out.println("Pushed "+el);

        }
    }
    public void pop(){
        if(TOP == -1){System.out.println("Stack Underflow");}
        else{
            System.out.println("Popped "+array[TOP]);
            TOP--;
        }
    }
}

class SQ273{
    public static void main(String args[]){
        System.out.println("Hello World");
        Stack stack1 = new Stack();
        stack1.push("5");
        stack1.push("2");
        stack1.push("6");
        stack1.display();
        stack1.pop();
        stack1.display();
        stack1.push("3");
        stack1.display();
        stack1.pop();
        stack1.display();
    }
}