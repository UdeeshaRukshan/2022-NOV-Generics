package PastPapers.Question2;

public class Book<T,V> {
    private T bookTitle;
    private V bookISBN;
Book(T bookTitle,V bookISBN){
    this.bookTitle=bookTitle;
    this.bookISBN=bookISBN;
}
public void add ( T bookTitle,V bookISBN){
        this.bookTitle=bookTitle;
        this.bookISBN=bookISBN;
    }

    public Book() {

    }

    T getBookTitle(){
    return bookTitle;
}

    V getBookISBN(){
    return bookISBN;
}

}
