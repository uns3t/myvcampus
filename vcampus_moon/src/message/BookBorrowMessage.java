package message;

/**
 * 类 {@code BookBorrowMessage} 借书信息的信息传输类.
 *
 * <p> 作为数据传输的载体的类
 *
 * @since 2019/8/19
 */

import java.io.Serializable;
import java.util.Date;

public class BookBorrowMessage implements Serializable {

    /** 书籍编号 {@value} */
    private String Book_id;

    /** Message类型 {@value} */
    private String type = "BookBorrow";

    /** 结束时间 {@value} */
    private String time;


    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setBook_id(String book_id) {
        Book_id = book_id;
    }

    public String getBook_id() {
        return Book_id;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     *
     * @see {@link Message}
     */
}
