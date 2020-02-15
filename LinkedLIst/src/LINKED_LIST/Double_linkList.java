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
public class Double_linkList implements linklist_Interface {

    Scanner input = new Scanner(System.in);

    LinkList curr, pre, first, last;
    boolean flage, cheak;
    int large, small, sec_large, j, count, i;

    public Double_linkList(LinkList curr, LinkList pre, LinkList first, LinkList last) {
        this.curr = curr;
        this.pre = pre;
        this.first = first;
        this.last = last;
        flage = false;
        cheak = false;
        count = 0;
        j = 0;
        i = 2;
    }

    public void Single_insertion() {

    }

    public void Single_display(int i) {

    }

    @Override
    public int Single_Search(int S_key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Single_Deletion(int D_key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Double_insertion() {
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
            first = last = pre = curr;
        } else {
            pre.next = curr;
            last = pre = curr;
        }

    }

    public int Double_display(int i) {
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
        if (first == null) {
            System.out.println("\nLINKLIST IS EMPTY...");
        }
        return 0;
    }

    public int Double_Search(int S_key) {
        curr = first;
        while (curr != null) {
            cheak = true;
            if (curr.id == S_key) {
                flage = true;
                System.out.println("\n-------------------");
                System.out.println("USER ID FIND: " + curr.getId());
                System.out.println("USER NAME: " + curr.getName());
                System.out.println("USER EMAIL: " + curr.getEmail());
                System.out.println("---------------------");
                break;
            } else {
                curr = curr.next;

            }
        }
        if (flage == false) {
            System.out.println("USER ID NOT FOUND IN LINKLIST:");
        }
        if (cheak = false) {
            System.out.println("LINKL LIST IS empty");
        }
        return 0;

    }

    public int Double_Delete(int D_key) {
        curr = first;
        while (curr != null) {
            cheak = true;
            if (curr.id == D_key) {
                flage = true;
                if ((first == curr) && (last == curr)) {
                    first = null;
                    break;

                } else if ((last == curr) && (curr.next == null)) {
                    last = pre;
                    pre.next = null;
                    break;

                } else if (curr.next != null) {
                    pre.next = curr.next;
                    break;

                }

            } else {
                pre = curr;
                curr = pre.next;
            }
        }
        if (flage == true) {
            System.out.println("\nDISPLAY AFTER DELETING LINK:");
            Double_display(1);
        }
        if (cheak == false) {
            System.out.println("LINKLIST IS EMPTY......");
        }
        return 0;

    }

    public int Double_Second_Largest() {
        curr = first;
        large = curr.getId();
        small = curr.getId();
        while (curr != null) {
            flage = true;
            if (curr.getId() > large) {
                large = curr.getId();
            } else if (curr.getId() < small) {
                small = curr.getId();
            } else {
                curr = curr.next;
                if (curr == null) {
                    curr = first;
                    sec_large = curr.getId();
                    break;
                }

            }
        }
        while (true) {
            if (curr.getId() > sec_large) {
                if (curr.getId() < large) {
                    sec_large = curr.getId();
                } else if (curr.getId() == large) {
                    curr = curr.next;
                    if (curr == null) {
                        break;
                    }
                }
            } else {
                curr = curr.next;
                if (curr == null) {
                    break;
                }
            }

        }
        if (flage == true) {
            System.out.println("\n-------------------------------------");
            System.out.println("LAEGEST NUMBER IN LINKEDLIST IS:" + large);
            System.out.println("SMALLEST NUMBER IN LINKLIST IS:" + small);
            System.out.println("SECOND LARGEST NUMEBR IN LINKLIST IS:" + sec_large);
            System.out.println("--------------------------------------------");
        } else {
            System.out.println("LINKED LSIT IS EMPTY.....");
        }
        return 0;
    }

    @Override
    public int Double_Smallest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Double_Prime() {
        curr = first;
        while (curr != null) {
            if (curr.getId() == 1) {
                System.out.println("1: IS EITHER PRIME OR NOT");
                curr = curr.next;
                flage = false;
                count = 0;
            } else {
                if (count == 0) {
                    for (i = 2; i <= curr.getId(); i++) {
                        if (curr.getId() % i == 0) {
                            count++;
                            if ((curr.getId() == i) && (count == 1)) {
                                flage = true;
                                System.out.println(curr.getId() + ":  PRIME");
                            } else if ((flage == false) && (count > 1) && (curr.getId() == i)) {
                                System.out.println(curr.getId() + ":  NOT PRIME");
                            }
                        }

                    }
                } else {
                    if (count > 0) {
                        curr = curr.next;
                        flage = false;
                        count = 0;

                    }
                }

            }
        }
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
