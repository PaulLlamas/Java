package Week6;

import java.util.ArrayList;

public class Textbook extends Book{

    private String subject;
    private ArrayList<String> resources;

    public Textbook(String title, double price, String author, String subject){
        super(author, price,title);
        this.subject = subject;
        resources = new ArrayList<>();
    }

    public void addResources(String newResource){
        if(!resources.contains(newResource)){
            resources.add(newResource);
        }
    }

    public String doSomething(){
        return "Textbook is 1";
    }

    public String toString(){
        return super.toString() + " subject is " + subject + " with resources " + resources;
    }
}
