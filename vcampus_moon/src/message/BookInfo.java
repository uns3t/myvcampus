package message;

import java.io.Serializable;

public class BookInfo implements Serializable {
    private String Book_name;
    private String Book_id;
    private String Book_author;
    private String Book_press;
    private int Book_total;
    private int Book_borrowed;
    private String Book_introduction;

    public void setBook_press(String book_press) {
        Book_press = book_press;
    }

    public String getBook_press() {
        return Book_press;
    }

    public void setBook_name(String book_name) {
        Book_name = book_name;
    }

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_id(String book_id) {
        Book_id = book_id;
    }

    public String getBook_id() {
        return Book_id;
    }

    public void setBook_author(String book_author) {
        Book_author = book_author;
    }

    public String getBook_author() {
        return Book_author;
    }


    public void setBook_total(int book_total) {
        Book_total = book_total;
    }

    public int getBook_total() {
        return Book_total;
    }



    public void setBook_borrowed(int book_borrowed) {
        Book_borrowed = book_borrowed;
    }

    public int getBook_borrowed() {
        return Book_borrowed;
    }



    public void setBook_introduction(String book_introduction) {
        Book_introduction = book_introduction;
    }

    public String getBook_introduction() {
        return Book_introduction;
    }
}
