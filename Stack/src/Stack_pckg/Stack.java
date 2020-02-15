/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_pckg;

/**
 *
 * @author syed iqbal
 */
public class Stack {

    static int Stack_arr[];
    static int top, peak, s_count;
    static Stack s = new Stack();
    static boolean flag, cheak;

    private Stack() {

    }

    public static Stack getObject(int size) {
        Stack_arr = new int[size];
        top = -1;
        peak = size;
        s_count = -1;
        flag = false;
        cheak = false;

        return s;
    }

    public int push(int[] no, int count) {
        while (!(top == count)) {
            top++;
            Stack_arr[top] = no[top];
        }

        s_count = top;
        return 0;
    }

    public void pop() {
        System.out.println("POP(DISPLAY)........");
        while (top >= 0) {
            flag = true;
            System.out.println(Stack_arr[top]);
            top--;
        }
        if (flag == false) {
            System.out.println("STACK IS EMPTY......");
        }
    }

    public int Search(int S_key) {
        while (s_count >= 0) {
            flag = true;
            if (S_key == Stack_arr[s_count]) {
                cheak = true;
                System.out.println("NUMBER (" + Stack_arr[s_count] + ") FOUND ON STACK AT ADDRESS: [" + s_count + "] ");
                s_count--;
            } else {
                s_count--;
            }
        }

        if (cheak == false) {
            System.out.println("NUMBER NOT EXISTS IN STACK...");
        }
        if (flag == false) {
            System.out.println("STACK IS EMPTY.......");
        }
        return 0;
    }

}
