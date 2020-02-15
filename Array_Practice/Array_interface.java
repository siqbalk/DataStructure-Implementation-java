/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_Practice;

/**
 *
 * @author Syed Iqbal
 */
public interface Array_interface {

    public int insertion(int[] no1, int[] no2);

    public void print();

    public int Search(int search_key);

    public int deletion(int del_key);                     //REMAING **********************************.

    public void sortig();

    public void Find_duplication();

    public void Delete_duplication();                       //REMAINING*********************************.

    public void find_Secondlargest();

    public void find_Second_smallest();

    public void find_intersection();

    public int pair_array(int no);        //find all pair of array whose sum is equal to given number.

    public void find_single_element();   //find the element in array which is not repeated twice..

    public void reverse_element();       //to reverse element in array from a given position eg(revrse position of element in array).

}
