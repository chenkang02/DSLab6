/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab6;

import java.util.Scanner;

/**
 *
 * @author CHEN KANG
 */
public class TestIntMyStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Please enter an Integer value: ");
        int input = sc.nextInt();

        MyStack<Integer> stack = new MyStack<>();
        stack.push(input);
        stack.push(1);
        System.out.println("Current stack size: " + stack.getSize());
        for(int i = 0; i <= stack.getSize(); i++){
             System.out.println(stack.pop());
        }   
    }
}
