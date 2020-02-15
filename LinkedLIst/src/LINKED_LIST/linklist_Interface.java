/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LINKED_LIST;

/**
 *
 * @author Syed Iqbal
 */
public interface linklist_Interface {

    public void Single_insertion();

    public void Single_display(int i);

    public int Single_Search(int  S_key);

    public int  Single_Deletion(int  D_key);

    public void Double_insertion();

    public int Double_display(int i);

    public int  Double_Search(int S_key);

    public int  Double_Delete(int  D_key);

    public int Double_Second_Largest();

    public int Double_Smallest();

    public void Double_Prime();

    public void Doubly_insertion();

    public int Doubly_display(int i);

    public int Doubly_Search(int S_key);

    public int Doubly_Delete(int D_key);

    public int Doubly_Second_Largest(LinkList link);

    public int Doubly_Smallest(LinkList link);
    public void Doubly_FINDING_Duplicate();
    public void Delete_DUPLICATE();

}
