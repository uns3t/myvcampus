package message;

/**
 * 类 {@code BookInfo} 书籍对象.
 *
 * <p> 存储书籍相关信息
 *
 * @since 2019/8/19
 */

import java.io.Serializable;

public class BookInfo implements Serializable {

    /** 书籍名称 {@value} */
    private String Book_name;

    /** 书籍编号 {@value} */
    private String Book_id;

    /** 书籍作者 {@value} */
    private String Book_author;

    /** 出版社 {@value} */
    private String Book_press;

    /** 书籍数量 {@value} */
    private int Book_total;

    /** 借书数量 {@value} */
    private int Book_borrowed;

    /** 书籍简介 {@value} */
    private String Book_introduction;

    /** 借书起始时间 {@value} */
    private String Book_borrowStartTime;

    public void setBook_borrowStartTime(String book_borrowStartTime) {
        Book_borrowStartTime = book_borrowStartTime;
    }

    public String getBook_borrowStartTime() {
        return Book_borrowStartTime;
    }

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

    /**
     *
     * @see {@link BookMessage}
     */
}
