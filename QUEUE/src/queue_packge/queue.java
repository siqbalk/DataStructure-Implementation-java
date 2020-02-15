/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_packge;

import java.util.Scanner;

/**
 *
 * @author syed iqbal
 */
public class queue {

    Scanner input = new Scanner(System.in);

    static queue obj = new queue();
    public static int[] queue;
    public static int rear;
    public static int front;
    public static boolean flag, cheak;

    private queue() {

    }

    public static queue getObject(int size) {
        queue = new int[size];
        rear = -1;
        front = -1;
        flag = false;
        cheak = false;
        return obj;
    }

    public int Enqueue(int peak) {
        System.out.println("ENTER QUEUE INSERTION....(ENQUEUE)..");
        while (!(rear == peak - 1)) {
            rear++;
            queue[rear] = input.nextInt();

        }

        return 0;

    }

    public int Dequeue(int peak) {
        System.out.println("QUEUE DISPLAY.....(DEQUEUE)...");
        while (!(front == peak - 1) &&(rear==peak-1)) {
            flag = true;
            front++;
            System.out.println(queue[front]);
        }
        if (flag == false) {
            System.out.println("QUEUE IS EMPTY.........");
        }
        return 0;

    }

    public int Search(int S_key, int peak, int front) {
        while (!(front == peak)) {
            flag = true;

            if (S_key == queue[front]) {
                cheak = true;
                System.out.println("NUMBER (" + S_key + ") FOUND  IN QUEUE AT ADDRESS: " + front);
                front++;
            } else {
                front++;
            }
        }
        if (cheak == false) {
            System.out.println("NUMBER NOT EXSIST ON QUEUE.....");
        }
        if (flag == false) {
            System.out.println("QUEUE IS EMPTY......");
        }

        return 0;
    }
}
