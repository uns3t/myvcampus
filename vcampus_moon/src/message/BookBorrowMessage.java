package message;

import java.io.Serializable;
import java.util.Date;

public class BookBorrowMessage implements Serializable {
    private String Book_id;
    private Date StartTime;
    private String Usr_id;
    private String type = "BookBorrow";

    public BookBorrowMessage(){
        this.StartTime = new Date();
    }


    public void setBook_id(String book_id) {
        Book_id = book_id;
    }

    public String getBook_id() {
        return Book_id;
    }

    public void setusr_id(String usr_id) {
        Usr_id = usr_id;
    }

    public String getusr_id() {
        return Usr_id;
    }

//    public void setTimeLimit(int timeLimit) {
//        TimeLimit = timeLimit;
//    }
//
//    public int getTimeLimit() {
//        return TimeLimit;
//    }

    public Date getStartTime() {
        return StartTime;
    }

    public String getType() {
        return type;
    }
}
