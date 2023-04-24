package ss11_stack_queue.bai_tap.use_stack_sort_elements_in_array;

import java.util.Scanner;
import java.util.Stack;

public class SortIntegerElementsInArray {
    public static void main(String[] args) {
        Stack<Integer> stackArray = new Stack<>();
        Scanner sc = new Scanner(System.in);
     stackArray.push(8);
     stackArray.push(7);
     stackArray.push(6);
     stackArray.push(5);
     stackArray.push(4);
     stackArray.push(3);
     stackArray.push(2);
     stackArray.push(1);
        System.out.println("Old StackArray: ");
        for (Object arr: stackArray) {
            System.out.println(arr);
        }
        int holdArr[] = new int[stackArray.size()];
        for (int i = 0; i < holdArr.length  ; i++) {
            holdArr[i] = stackArray.pop();
        }
        for (int i = 0; i < holdArr.length ; i++) {
            stackArray.push(holdArr[i]);
        }
        System.out.println("New StackArray: ");
        for (Object arr: stackArray) {
            System.out.println(arr);
        }
    }
}
