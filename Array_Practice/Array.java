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
public class Array implements Array_interface {

    int count;
    int temp;
    int duplicate;
    int dup;
    int j, l, k, i;
    int[] arr1, arr2, intersection;
    int flage;
    int large;
    int second_large;
    int small;
    int s_small;
    int flg;
    boolean flag;

    public Array(int size) {
        arr1 = new int[size];
        arr2 = new int[size];
        intersection = new int[size];
        i = 0;
        count = 0;
        dup = 0;
        flage = 1;
        small = 0;
        large = 0;
        second_large = 0;
        flg = 0;
        flag = false;
    }

    public int insertion(int[] no1, int[] no2) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = no1[i];
            arr2[i] = no2[i];
        }

        return 0;

    }

    public void print() {
        System.out.println("ARRAY 1 ELEMENTS:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("AARAY 2 ELEMENTS:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    public int Search(int search_key) {
        int i = 0;

        boolean flage = false;
        while (i < arr1.length) {
            if (search_key == arr1[i]) {
                flage = true;

                System.out.println("-------------------------------------------------");
                System.out.println("NUMBER : " + arr1[i] + " : FOUND  AT INDEX :" + i);
                System.out.println("--------------------------------------------------");
                i++;
            } else {
                i++;
            }

        }
        if (flage == false) {
            System.out.println("-------------------------------------");
            System.out.println("SEARCH KEY DOES NOT EXSIST IN ARRAY:");
            System.out.println("--------------------------------------");
        }

        return 0;
    }

    public int deletion(int del_key) {
        for (i = 0; i < arr1.length; i++) {
            if (del_key == arr1[i]) {
                count++;
                System.out.println("count:" + count);
                if (i == arr1.length - 1) {
                    System.out.println("DISPLAY OF ARRAY AFTER DELETION: [" + del_key + "]");
                    for (j = 0; j < arr1.length - count; j++) {
                        System.out.println(arr1[j]);
                    }
                } else {

                    for (j = i; j < arr1.length - 1; j++) {
                        temp = arr1[j];
                        arr1[j] = arr1[j + 1];
                        arr1[j + 1] = temp;

                    }
                    count--;

                }

            }
        }
        if (count < 0) {
            System.out.println("-----------------------------------");
            System.out.println("DELETE KEY DOES NOT EXSIST IN ARRAY:");
            System.out.println("------------------------------------");
        }
        return 0;
    }

    public void sortig() {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int sort = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = sort;

                }

            }
        }
        for (i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] < arr1[j]) {
                    int sort = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = sort;

                }

            }
        }
        System.out.println("SORTING IN DECENDING ORDER:");
        for (i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
        System.out.println("------------------------");

    }

    public void Find_duplication() {

        if (temp < arr1.length - 1) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] == arr1[j]) {
                        count++;
                        duplicate = arr1[i];
                        temp = count;
                    }

                }
                if (dup == duplicate) {
                    count = count - count;
                } else {
                    if (count > 0) {
                        for (int k = i; k <= i; k++) {
                            System.out.println("NUMBER: [" + duplicate + "] REPEATED [" + count + "] TIME IN ARRAY:");
                            dup = duplicate;
                            count = count - count;
                        }
                    }

                }
            }
        }
    }

    public void Delete_duplication() {
        for (i = 0; i < arr1.length; i++) {
            for (j = i + 1; j < arr1.length - count; j++) {

                if (arr1[i] == arr1[j]) {
                    count++;
                    for (k = i; k < arr1.length - count; k++) {

                        temp = arr1[k];
                        arr1[k] = arr1[k + 1];
                        arr1[k + 1] = temp;
                        if (k == arr1.length - count) {
                            j = i + 1;

                        }
                    }
                }

            }
        }
        for (i = 0; i < arr1.length - count; i++) {
            System.out.println(arr1[i]);

        }

    }

    public void find_Secondlargest() {
        large = arr1[0];
        System.out.println("arr1[0]:" + arr1[0]);
        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] > large) {
                temp = large;
                large = arr1[i];
                arr1[i] = temp;
            }

        }
        System.out.println("\n-------------------------------------");
        System.out.println("LARGEST NUMBER IN ARRAY: " + large);
        large = 0;
        arr1[0] = second_large;
        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] > second_large) {
                temp = second_large;
                second_large = arr1[i];
                arr1[i] = temp;
            }

        }
        System.out.println("SECOND LARGEST NUMBER IN ARRAY: " + second_large);
        System.out.println("--------------------------------------");
    }

    public void find_Second_smallest() {
        for (i = count; i < arr2.length; i++) {
            for (j = i + 1; j < arr2.length; j++) {
                if (arr2[i] > arr2[j]) {
                    small = arr2[j];
                    count = j;
                    j = arr2.length - 1;
                }

            }
        }
        s_small = arr2[0];
        System.out.println("\n------------------------------------------------------");
        System.out.println(" SMALLEST SMALLEST NUMBER IN ARRAY [2]: " + +small);
        for (i = 0; i < arr2.length; i++) {
            if (arr2[i] != small) {
                if ((s_small > small) && (s_small > arr2[i])) {
                    s_small = arr2[i];

                }
            }
        }
        System.out.println(" SECOND SMALLEST SMALLEST NUMBER IN ARRAY [2]: " + s_small);
        System.out.println("--------------------------------------------------------");

    }

    public void find_intersection() {
        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    flg = 0;
                    for (k = count; k < intersection.length; k++) {
                        if (count < arr1.length) {
                            for (l = 0; l <= count; l++) {
                                if ((intersection[l] != arr1[i]) && (flg != 1)) {
                                    flag = true;

                                } else {
                                    flag = false;
                                    flg = 1;
                                }
                            }
                            if (flag == true) {
                                count++;
                                intersection[k] = arr1[i];
                            }
                        }
                    }

                }
            }
        }

        System.out.println("\nINTERSECTION OF ARRAY 1 AND 2:");
        System.out.println("-------------------------");
        System.out.print("{");
        for (i = 0; i < count; i++) {
            System.out.print(intersection[i] + ",");

        }
        System.out.print("}");
        System.out.println("-------------------------");

    }

    public int pair_array(int no) {
        return 0;

    }

    @Override
    public void find_single_element() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reverse_element() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
