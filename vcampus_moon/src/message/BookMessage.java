package message;
/**
 * 类 {@code BookMessage} 图书信息消息类.
 *
 * <p> 传输书籍相关信息
 *
 * @since 2019/8/19
 */
import java.io.Serializable;
import java.util.ArrayList;

public class BookMessage implements Serializable {

    /** Message类型 {@value} */
    private String type = "Book";

    /** 书籍对象列表 {@value} */
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

    /**
     *
     * @see {@link BookInfo}
     * @see {@link Message}
     */
}
