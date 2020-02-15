/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LINKED_LIST;

import java.util.Scanner;

/**
 *
 * @author Syed Iqbal
 */
public class LinkList_Main {

    public static void main(String[] args) {
        LinkList root = new LinkList();
        Scanner input = new Scanner(System.in);
        System.out.println("---LINKLIST MENU---");
        System.out.println("-------------------");
        System.out.println("1:SINGLE LINKLIST");
        System.out.println("2:DOUBLE LINKLIST");
        System.out.println("3:DOUBLY LINKLIST");
        System.out.println("-------------------");
        System.out.println("\nENTER YOUR CHOICE:");
        try {
            int choice = input.nextInt();
            if (choice == 1) {
                linklist_Interface inter = (linklist_Interface) LinkList.getlinklist("single");
                System.out.println("--------SINGLE LINKEDLIST MENU--------");
                System.out.println("\n--------------------------------------");
                System.out.println("            1:INSERTION");
                System.out.println("            2:DISPLAY");
                System.out.println("            3:SEARCHING");
                System.out.println("            4:DELETION");
                System.out.println("--------------------------------------");
                while (true) {
                    System.out.println("\nENTER YOUR CHOICE:");
                    int ch = input.nextInt();
                    switch (ch) {
                        case 1:
                            char cho = 'y';
                            while (cho == 'y') {
                                inter.Single_insertion();
                                System.out.println("ENTER Y TO INSERT NEW LINK");
                                cho = input.next().charAt(0);

                            }
                            break;
                        case 2:
                            System.out.println("\n----------------------");
                            inter.Single_display(1);
                            break;
                        case 3:
                            System.out.println("ENTER SEARCH KEY:");
                            int s_key = input.nextInt();
                            inter.Single_Search(s_key);
                            break;
                        case 4:
                            System.out.println("ENTER DELETE KEY:");
                            int d_key = input.nextInt();
                            inter.Single_Deletion(d_key);
                            break;

                    }
                    if (choice == 5) {
                        break;
                    }

                }

            }
            if (choice == 2) {
                linklist_Interface inter1 = (linklist_Interface) LinkList.getlinklist("double");
                System.out.println("--------DOUBLE LINKEDLIST MENU--------");
                System.out.println("\n--------------------------------------");
                System.out.println("            1:INSERTION");
                System.out.println("            2:DISPLAY");
                System.out.println("            3:SEARCHING");
                System.out.println("            4:DELETION");
                System.out.println("            5:SECOND LARGEST");
                System.out.println("            6:SMALLEST");
                System.out.println("            7:PRIME");
                System.out.println("--------------------------------------");
                while (true) {
                    System.out.println("\nENTER YOUR CHOICE:");
                    int ch = input.nextInt();
                    switch (ch) {
                        case 1:
                            char cho = 'y';
                            while (cho == 'y') {
                                inter1.Double_insertion();
                                System.out.println("ENTER Y TO INSERT NEW LINK");
                                cho = input.next().charAt(0);

                            }
                            break;
                        case 2:
                            System.out.println("\n----------------------");
                            inter1.Double_display(1);
                            break;
                        case 3:
                            System.out.println("ENTER SEARCH KEY:");
                            int s_key = input.nextInt();
                            inter1.Double_Search(s_key);
                            break;
                        case 4:
                            System.out.println("ENTER DELETE KEY:");
                            int d_key = input.nextInt();
                            inter1.Double_Delete(d_key);
                            break;
                        case 5:
                            inter1.Double_Second_Largest();
                            break;
                        case 6:
                            inter1.Double_Smallest();
                            break;
                        case 7:
                            inter1.Double_Prime();
                            break;

                    }
                    if (choice > 7) {
                        break;
                    }

                }
            }
            if (choice == 3) {
                linklist_Interface inter1 = (linklist_Interface) LinkList.getlinklist("doubly");
                System.out.println("--------DOUBLY LINKEDLIST MENU--------");
                System.out.println("\n--------------------------------------");
                System.out.println("            1:INSERTION");
                System.out.println("            2:DISPLAY");
                System.out.println("            3:SEARCHING");
                System.out.println("            4:DELETION");
                System.out.println("            5:SWAPING");
                System.out.println("--------------------------------------");
                while (true) {
                    System.out.println("\nENTER YOUR CHOICE:");
                    int ch = input.nextInt();
                    switch (ch) {
                        case 1:
                            char cho = 'y';
                            while (cho == 'y') {
                                inter1.Doubly_insertion();
                                System.out.println("ENTER Y TO INSERT NEW LINK");
                                cho = input.next().charAt(0);

                            }
                            break;
                        case 2:
                            System.out.println("\n----------------------");
                            inter1.Doubly_display(1);
                            break;
                        case 3:
                            System.out.println("ENTER SEARCH KEY:");
                            int s_key = input.nextInt();
                            inter1.Doubly_Search(s_key);
                            break;
                        case 4:
                            System.out.println("ENTER DELETE KEY:");
                            int d_key = input.nextInt();
                            inter1.Doubly_Delete(d_key);
                            break;
                        case 5:
                            inter1.Doubly_FINDING_Duplicate();
                            break;
                        case 6:
                            inter1.Double_Smallest();
                            break;
                        case 7:
                            inter1.Double_Prime();
                            break;

                    }
                    if (choice > 7) {
                        break;
                    }

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
