package message;

import java.io.Serializable;
import java.util.Date;

public class BookBorrowMessage implements Serializable {
    private String Book_id;
    private String type = "BookBorrow";




    public void setBook_id(String book_id) {
        Book_id = book_id;
    }

    public String getBook_id() {
        return Book_id;
    }



//    public void setTimeLimit(int timeLimit) {
//        TimeLimit = timeLimit;
//    }
//
//    public int getTimeLimit() {
//        return TimeLimit;
//    }

    public String getType() {
        return type;
    }
}
