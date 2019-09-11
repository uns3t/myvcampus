package message;

import java.io.Serializable;
import java.util.ArrayList;

public class BookMessage implements Serializable {

    private String type = "Book";
    ArrayList<BookInfo> bookInfo = null;


    public BookMessage(){
        bookInfo = new ArrayList<BookInfo>();
    }
    public void addBookInfo(BookInfo b){
        bookInfo.add(b);
    }
    public void setBooklist(ArrayList<BookInfo> booklist){
        bookInfo=booklist;
    }
    public ArrayList getbook(){
        return bookInfo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
