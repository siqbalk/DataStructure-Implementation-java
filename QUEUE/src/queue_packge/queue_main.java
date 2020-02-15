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
public class queue_main {

    public static void main(String[] args) {
        int sixe;
        int choice = 1;
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER SIXE OF QUEUE....");
        sixe = input.nextInt();
        queue obj = queue.getObject(sixe);

        System.out.println("------------------");
        System.out.println("-------MENU-------");
        System.out.println("1.ENQUEUE");
        System.out.println("2.DEQUEUE");
        System.out.println("3.SEARCHING");
        System.out.println("------------------");
        while (!((choice <= 0) && (choice > 3))) {
            flag = true;

            System.out.println("ENTER YOUR CHOICE....");
            try {
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        obj.Enqueue(sixe);
                        break;
                    case 2:
                        obj.Dequeue(sixe);
                        break;
                    case 3:
                        System.out.println("ENTER SEARCH KEY....");
                        int s_key = input.nextInt();
                        obj.Search(s_key, sixe, 0);
                        break;
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if (flag == false) {
            System.out.println("SORRY YOU ENTERD WRONG NUMBERED.........");
        }
    }

}
