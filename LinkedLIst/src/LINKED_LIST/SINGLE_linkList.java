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
public class SINGLE_linkList implements linklist_Interface {

    Scanner input = new Scanner(System.in);
    LinkList first;
    LinkList curr;
    LinkList pre;
    int id;
    int i;
    boolean flag;

    public SINGLE_linkList(LinkList first, LinkList curr, LinkList pre) {
        this.first = first;
        this.curr = curr;
        this.pre = pre;
        id = 0;
        i = 1;
        flag = false;
    }

    public void Single_insertion() {

        curr = new LinkList();
        System.out.println("ENTER USER ID:");
        int id = input.nextInt();
        curr.setId(id);
        System.out.println("ENTER USER NAME:");
        String name = input.next();
        curr.setName(name);
        System.out.println("ENTER USER EMAIL:");
        String email = input.next();
        curr.setEmail(email);
        if (first == null) {
            first = pre = curr;
        } else if (first != null) {

            pre.next = curr;
            pre = curr;
        }

    }

    public void Single_display(int i) {
        curr = first;
        while (curr != null) {
            System.out.println("STUDENT(" + i + ")DATA:");
            System.out.println("ID:" + curr.getId());
            System.out.println("NAME:" + curr.getName());
            System.out.println("EMAIL:" + curr.getEmail());
            System.out.println("---------------------");
            curr = curr.next;
            i++;
        }

    }

    public int  Single_Search(int  S_key) {
        curr = first;
        while (curr != null) {
            if (curr.getId()==S_key) {
                flag = true;
                System.out.println("\n----------------------------");
                System.out.println("|USER ID FIND: " + curr.getId() + "            |");
                System.out.println("|USER NAME: " + curr.getName() + "            |");
                System.out.println("|USER EMAIL: " + curr.getEmail() + "          |");
                System.out.println("-----------------------------");
                break;

            } else {
                curr = curr.next;
            }
        }
        if (flag == false) {
            System.out.println("USER ID NOT FOUND IN LINKLIST:");
        }
        return 0;
    }

    public int  Single_Deletion(int D_key) {
        curr = first;
        while (curr != null) {
            if (curr.id==D_key) {
                flag = true;
                if (curr.next == null) {
                    curr = null;
                    break;

                } else if (curr.next != null) {
                    pre.next = curr.next;
                    break;
                }
            } else if (!(curr.id==D_key)) {
                pre = curr;
                curr = pre.next;
            }
        }
        if (flag == true) {
            System.out.println("\nDISPLAY AFTER DELETING A LINK:");
            Single_display(1);
        } else {
            System.out.println("LINKLIST IS EMPTY....");
        }

        return 0;
    }

    @Override
    public void Double_insertion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Double_display(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int  Double_Search(int  S_key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Double_Delete(int  D_key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Double_Second_Largest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Double_Smallest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Double_Prime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Doubly_insertion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Doubly_display(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Doubly_Search(int S_key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Doubly_Delete(int D_key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Doubly_Second_Largest(LinkList link) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public void Doubly_FINDING_Duplicate(){
         
     }
    public void Delete_DUPLICATE(){
        
    }

    @Override
    public int Doubly_Smallest(LinkList link) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
