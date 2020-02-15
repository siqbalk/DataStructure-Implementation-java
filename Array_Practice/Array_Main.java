/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_Practice;

import java.util.Scanner;

/**
 *
 * @author Syed Iqbal
 */
public class Array_Main {
    
    public static void main(String[] args) {
        int sixe;
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\t\t----MENU----");
        System.out.println("\t\t\t\t============");
        System.out.println("\t\t 1.INSERTION");
        System.out.println("\t\t 2.PRINTING");
        System.out.println("\t\t 3.SEARCHING");
        System.out.println("\t\t 4.DELETION");
        System.out.println("\t\t 5.SORTING");
        System.out.println("\t\t 6.FIND DUPLICATION");
        System.out.println("\t\t 7.DELETE DUPLICATION");
        System.out.println("\t\t 8.FIND LARGEST NUMBER");
        System.out.println("\t\t 9.FIND SMALLEST NUMBER");
        System.out.println("\t\t 10.FIND INTERSECTION BETWEEN TWO ARRAYS");
        System.out.println("\t\t 11.FIND ALL PAIRS OF ARRAY WHOSE SUM =GIVEN NUMBER");
        System.out.println("\t\t 12.FIND ELEMENT IN ARRAY WHICH IS  NOT REPEATED");
        System.out.println("\t\t 13.REVERSE THE POSITION OF ELEMENTS");
        System.out.println("\t\t----------------------------------------------------");
        
        System.out.println("\nENTER SIZE FOR ARRAY:");
        sixe = input.nextInt();
        System.out.println("--------------------------");
        Array obj = new Array(sixe);
        int choice;
        int[] element1 = new int[sixe];
        int[] element2 = new int[sixe];
        int count = 0;
        while (true) {
            try{
            System.out.println("\nENTER UR CHOICE...");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ENTER ARRAY ELEMENTS:");
                    while (count < sixe) {
                        element1[count] = input.nextInt();
                        element2[count] = input.nextInt();
                        obj.insertion(element1, element2);
                        count++;
                        if (count >= sixe) {
                            break;
                        }
                    }
                    break;
                case 2:
                    obj.print();
                    break;
                case 3:
                    System.out.println("ENTER SEARCH KEY FOR ARRAY 1:");
                    int search_key = input.nextInt();
                    obj.Search(search_key);
                    break;
                case 4:
                    System.out.println("ENTER DELETE KEY FOR ARRAY 1:");
                    int delete_key = input.nextInt();
                    obj.deletion(delete_key);
                    break;
                case 5:
                    System.out.println("\n---------------------------");
                     System.out.println(" SORTING IN ACCESDING ORDER:");
                    obj.sortig();
                    break;
                case 6:
                    obj.Find_duplication();
                    break;
                case 7:
                    System.out.println("\nDISPLAY AFTER DELETING DUPLICATE");
                    obj.Delete_duplication();
                    break;
                case 8:
                    obj.find_Secondlargest();
                    break;
                case 9:
                    obj.find_Second_smallest();
                    break;
                case 10:
                    obj.find_intersection();
                    break;
            }
            }
             catch(Exception e){
                System.out.println(e);
                     }
        }
        }
    
    
}
