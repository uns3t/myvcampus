package message;

import java.io.Serializable;
import java.util.Date;

public class BookBorrowMessage implements Serializable {
    private String Book_name;
    private String Book_id;
    private static int Borrow_id = 0;
    private long StartTime;
    private int TimeLimit;
    private String type = "BookBorrow";

    public BookBorrowMessage(){
        Date Time = new Date();
        StartTime = Time.getTime();
        Borrow_id++;
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

    public static int getBorrow_id() {
        return Borrow_id;
    }

    public void setTimeLimit(int timeLimit) {
        TimeLimit = timeLimit;
    }

    public int getTimeLimit() {
        return TimeLimit;
    }

    public long getStartTime() {
        return StartTime;
    }

    public String getType() {
        return type;
    }
}
