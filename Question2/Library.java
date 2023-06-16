package PastPapers.Question2;

import java.util.HashMap;

public class Library {
    public static void main(String [] args){
        HashMap<Integer,Book> bookList= new HashMap<Integer, Book>();

        Book<String,String> book1=new Book<>();
        Book<String,Integer> book2=new Book<>();

        book1.add("Harry Potter","ISBN1234");

        book2.add("Rings of power",123456);

        bookList.put(1,book1);
        bookList.put(2,book2);

        for(int id:bookList.keySet()){
            Book value=bookList.get(id);

            System.out.println("Book ID is :"+id+" and the ISBN is:" +value.getBookISBN()+" and The title is: "+value.getBookTitle());
        }


    }
}
