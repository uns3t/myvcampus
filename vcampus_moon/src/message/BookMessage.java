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
    public ArrayList getbook(){
        return bookInfo;
    }

    public String getType() {
        return type;
    }
}
