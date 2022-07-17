import java.util.*;

class Stack{
    static int MAX = 99999;
    static int TOP = -1;
    static String array[] = new String[MAX];

    public static void display( ){
        if(TOP==-1){System.out.println("Stack is EMPTY");}
        else{
            System.out.println("Stack: ");
            for(int i=TOP;i>=0;i--){
            System.out.println("|"+array[i]+"|");
            }
        }
    }
    public static void push(String el){
        if(TOP == 99999){System.out.println("Stack Overflow");}
        else{
            array[++TOP]=el;
            System.out.println("Pushed "+el);

        }
    }
    public static void pop( ){
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
        Stack.push("5");
        Stack.push("2");
        Stack.push("6");
        Stack.display();
        Stack.pop();
        Stack.display();
        Stack.push("3");
        Stack.display();
        Stack.pop();
        Stack.display();
    }
}