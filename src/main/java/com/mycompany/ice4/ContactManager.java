/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jacob
 */
public class ContactManager {
//    private Contact[] contactList = new Contact[2];
      private List<Contact> contactList = new ArrayList<>();
      public List<Contact> getList(){return contactList;}
      

    public Contact findContact(String emailAddress){
        for(int i = 0; i < contactList.size();i++){
            if(contactList.get(i).getEmailAddress().equals(emailAddress)){return contactList.get(i);}
        }
        return null;
    }

    public void clearContacts(){
        for(int i = 0;i <contactList.size();i++){
            contactList.remove(i);
        }
    }

}

