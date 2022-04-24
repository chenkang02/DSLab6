/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab6;

/**
 *
 * @author CHEN KANG
 */
public class TestMyStack {

    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();

        stack.push('a');
        stack.push('b');
        stack.push('c');

        System.out.println(stack.toString());

        System.out.println("Is b in the stack? : " + stack.search('b'));
        System.out.println("Is k in the stack? : " + stack.search('k'));

        MyStack<Integer> stack1 = new MyStack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        
        System.out.println(stack1.toString());
        System.out.println("Is 6 in the stack? : " + stack1.search(6));
        
        System.out.println(isPalindrome("civic"));
        
    }
    
    public static boolean isPalindrome(String s){
        
        int length = s.length();
        
        MyStack<Character> stack = new MyStack<>();
        MyStack<Character> temp = new MyStack<>();
        
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        for(int i = 0; i < Math.floor(length/2); i++){
            temp.push(stack.pop());
        }
        if(length % 2 == 0){
            return temp.toString().equals(stack.toString());
        }
        else {
            stack.pop();
            return temp.toString().equals(stack.toString());
        }
    }
}
