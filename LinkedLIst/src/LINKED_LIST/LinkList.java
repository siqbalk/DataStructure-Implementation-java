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
public class LinkList {

    String name;
    String email;
    LinkList next;
    LinkList prev;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static linklist_Interface getlinklist(String linklist) {
        if (linklist == "single") {
            return new SINGLE_linkList(null, null, null);
        } else if (linklist == "double") {
            return new Double_linkList(null, null, null, null);
        } else if (linklist == "doubly") {
            return new DOUBLY_Linklist(null, null, null, null, null);
        }
        return null;
    }

}
