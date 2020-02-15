/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_pckg;

import java.util.Scanner;

/**
 *
 * @author syed iqbal
 */
public class Stack_Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER STACK SIZE:");
        int ch = 1;
        int count = 0;
        boolean flage = false;
        int sixe = input.nextInt();
        int[] insertion = new int[sixe];
        Stack obj = Stack.getObject(sixe);
        System.out.println("------------------");
        System.out.println("-------MENU-------");
        System.out.println("1.PUSH");
        System.out.println("2.POP");
        System.out.println("3.SEARCHING");
        System.out.println("------------------");
        try {
            while (!((ch < 1) && (ch > 4))) {
                flage = true;
                System.out.println("\nENTER YOUR CHOICE...");
                ch = input.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("ENTER INSERTION KEYs....(PUSH) ");
                        while (sixe > count) {
                            insertion[count] = input.nextInt();
                            obj.push(insertion, count);
                            count++;
                        }
                        if (count == sixe) {
                            System.out.println("\n-----------------------------------------");
                            System.out.println("TOP IS EQUAL TO PEAK INSERTION IS ENDED....\nSTACK OVERFLOW...");
                            System.out.println("------------------------------------------");
                        }
                        break;
                    case 2:
                        obj.pop();
                        break;
                    case 3:
                        System.out.println("ENTER SEARCH KEY.....");
                        int s_key = input.nextInt();
                        obj.Search(s_key);
                        break;
                }
            }
            if (flage == false) {
                System.out.println(" WRONG NUMBER ENTERED BY USER....");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
