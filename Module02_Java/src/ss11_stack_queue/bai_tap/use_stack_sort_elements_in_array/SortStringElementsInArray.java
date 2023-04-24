package ss11_stack_queue.bai_tap.use_stack_sort_elements_in_array;

import java.util.Queue;
import java.util.Stack;

public class SortStringElementsInArray {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        String ramdomString = "Không Biết Ghi Gì";
        String[] mWord = ramdomString.split(" ");
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }
        System.out.println("Old StackArray: ");
        for (Object newStr : wStack) {
            System.out.println(newStr);
        }
        int i = 0;
        while (!wStack.isEmpty()) {
            mWord[i] = wStack.pop();
            i++;
        }
        for (int j = 0; j < mWord.length  ; j++) {
            ramdomString += mWord[j];
        }
        System.out.println(ramdomString);
    }
}
