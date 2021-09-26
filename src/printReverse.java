import java.util.Stack;
import java.io.*;
import java.util.*;

public class printReverse {

    public static String reverseS(String str){

        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();


        for(int i =0;i<str.length();i++){
            if(str.charAt(i) != ' '){ //take '' for Character and "" for String
                stack.push(str.charAt(i));
            }
            else{ //this will reverse the element from right to left
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                sb.append(' ');
            }
        }
            //while there must be other last element which did not encounter any '' space , so we will be adding them in reverse order
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();

    }

    public static void main(String[] args) {

       String s =  printReverse.reverseS("I am a super women");
       System.out.println(s);
    }
}
