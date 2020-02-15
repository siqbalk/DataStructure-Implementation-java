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
public class DOUBLY_Linklist implements linklist_Interface {

    Scanner input = new Scanner(System.in);
    LinkList curr, pre, first, last, cheak_dup;
    boolean flage, cheak, temp;
    int count, flg, k;

    public DOUBLY_Linklist(LinkList curr, LinkList pre, LinkList first, LinkList last, LinkList cheak_dup) {
        this.curr = curr;
        this.pre = pre;
        this.first = first;
        this.last = last;
        this.cheak_dup = cheak_dup;
        flage = false;
        cheak = false;
        temp = false;
        count = 0;
        flg = 0;
    }

    @Override
    public void Single_insertion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Single_display(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Single_Search(int S_key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Single_Deletion(int D_key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public int Double_Search(int S_key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Double_Delete(int D_key) {
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
            last = first = pre = curr;
        } else {
            pre.next = curr;
            curr.prev = pre;
            last = pre = curr;

        }

    }

    @Override
    public int Doubly_display(int i) {
        System.out.println("DISPLAY CHOICE:");
        System.out.println("1:FRONT DISPLAY");
        System.out.println("2:BACK DISPLAY");
        System.out.println("-----------------");
        System.out.println("\nENTER YOUR CHOICE:");
        int ch = input.nextInt();
        if (ch == 1) {
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
        } else if (ch == 2) {
            curr = last;
            while (curr != null) {
                System.out.println("STUDENT(" + i + ")DATA:");
                System.out.println("ID:" + curr.getId());
                System.out.println("NAME:" + curr.getName());
                System.out.println("EMAIL:" + curr.getEmail());
                System.out.println("---------------------");
                curr = curr.prev;
                i++;

            }

        } else if ((ch > 2) && (ch <= 0)) {
            System.out.println("WRONG ENTRY..TRY AGAIN");
        }
        if (first == null) {
            System.out.println("LINKED LIST IS EMPTY..");
        }
        return 0;

    }

    @Override
    public int Doubly_Search(int S_key) {
        curr = first;
        while (curr != null) {
            flage = true;
            if (S_key == curr.getId()) {
                count++;
                cheak = true;
                System.out.println("\n---------------------");
                System.out.println("USER ID FIND: " + curr.getId());
                System.out.println("USER NAME: " + curr.getName());
                System.out.println("USER EMAIL: " + curr.getEmail());
                System.out.println("---------------------");
                curr = curr.next;
            } else {
                curr = curr.next;
            }

        }
        if (count > 1) {
            System.out.println(S_key + " :FOUND  " + count + " TIME IN LINKLIST");
        }
        if (cheak == false) {
            System.out.println("NUMBER NOT FOUND IN LINKEDLIST....");
        }
        if (flage == false) {
            System.out.println("LINKED LSIT IS EMPTY...");
        }
        return 0;

    }

    public int Doubly_Delete(int D_key) {
        pre = curr = first;
        while (curr != null) {
            flage = true;
            if (D_key == curr.getId()) {
                count++;
                cheak = true;
                if ((curr == first) && (curr == last)) {
                    first = null;
                    last = null;

                } else if ((curr.next != null)) {
                    pre.next = curr.next;
                    curr = curr.next;
                    curr.prev = pre;
                    pre = curr;
                    curr = pre.next;

                } else if ((curr == last) && (curr != first)) {
                    last = pre;
                    curr.prev = null;
                    pre.next = null;
                    pre = curr;
                    curr = pre.next;

                } else if ((curr == first) && (curr != last)) {
                    first = curr.next;
                    first.prev = null;
                    pre = curr;
                    curr = pre.next;

                }
            } else {
                pre = curr;
                curr = pre.next;
            }

        }
        if (cheak == true) {
            System.out.println("DISPLAY AFTER DELETING LINKS...");
            Doubly_display(1);
        }
        if (flage == false) {
            System.out.println("LINKLIST IS EMPTY....");
        }
        if (count == 0) {
            System.out.println("DELETION NOT FOUND IN LINKLIST...");
        }
        return 0;
    }

    @Override
    public int Doubly_Second_Largest(LinkList link) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Doubly_FINDING_Duplicate() {
        cheak_dup = first;
        while (cheak_dup != null) {
            curr = cheak_dup.next;
            while (curr != null) {
                if (flg == 0) {
                    if (cheak_dup.id == curr.id) {
                        count++;
                        flg = 1;
                        cheak = true;
                        curr = curr.next;
                        if (curr == null) {
                            System.out.println(cheak_dup.id + ": REPEATED " + count + " TIME IN LINKLIST");
                            cheak = false;
                        }

                        flg = 0;
                    } else {
                        curr = curr.next;
                        if ((curr == null) && (cheak == true)) {
                            if (k == 0) {
                                System.out.println(cheak_dup.id + ": REPEATED " + count + " TIME IN LINKLIST");
                                cheak = false;
                                k = 1;
                            }
                        }

                        flg = 0;

                        if (curr == null) {
                            cheak_dup = cheak_dup.next;
                            count = 0;
                            break;
                        }
                    }
                }

            }

        }
        if (cheak == false) {
            System.out.println("DUPLICATE NOT FOUND IN LINKLIST....");
        }

        if (first == null) {
            System.out.println("LINKLIST IS EMPTY....");
        }

    }

    public void Delete_DUPLICATE() {

    }

    @Override
    public int Doubly_Smallest(LinkList link) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
