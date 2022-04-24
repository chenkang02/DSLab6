/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab6;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author CHEN KANG
 */
public class MyStack<E> {
    private ArrayList<E> stack = new ArrayList<>();
    
    public MyStack() {

    }

    
    public void push(E o){
        stack.add(o);
    }
    
    public E pop(){
        try{
            E element = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return element;
        }
        catch(Exception e){
            new NoSuchElementException("Stack is empty");
            return null;
        }
        
    }
    public E peek(){
        return stack.get(stack.size() - 1);
    }
    
    public int getSize(){
        return stack.size();
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    @Override
    public String toString(){
        return "stack: " + stack.toString();
    }
    
    public boolean search(E o) {
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i).equals(o)) {
                return true;
            }
        }
        return false;

    }
    
    public int sum(){
        int size = this.getSize();
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += (Integer)this.pop();
        }
        return sum;
    }
    
    
    
    
    
}
