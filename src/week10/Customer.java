package week10;

import week7.BankAccount;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Customer {
    private String name;
    private List<BankAccount> accountList;
    private ListIterator<BankAccount> listIterator;

    public Customer(String name){
        this.name = name;
        accountList = new LinkedList<>();
        listIterator = accountList.listIterator();
    }

    public void addAccount(BankAccount acct){
        if(!accountList.contains(acct)) accountList.add(acct);
    }
    public String toString(){
        String out = name + " has the following account: ";
        while(listIterator.hasNext()){
            out += "Account " + listIterator.next();
        }
        return out;
    }

}
