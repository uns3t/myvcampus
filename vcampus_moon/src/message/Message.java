
package message;

/**
 * 类 {@code Message} 信息传输类.
 *
 * <p> 作为数据传输的载体的类
 *
 * @since 2019/8/19
 */

import java.io.Serializable;

public class Message implements Serializable{

    /** Message类型 {@value} */
    private String type;

    /** Message的具体存储对象 {@value} */
    private Object data;

    /** 服务器端返回的结果（请求是否成功） {@value} */
    private boolean response = false;

    /** 服务器端返回d当前用户的ID  {@value} */
    private String theUsr;

    public void setType(String t){ this.type = t; }

    public String getType(){ return this.type; }

    public void setData(Object d){ this.data = d; }

    public Object getData(){ return this.data; }

    public void setResponse(boolean response){ this.response = response; }

    public boolean getResponse(){ return response; }

    public void setTheUsr(String theUsr) {
        this.theUsr = theUsr;
    }

    public String getTheUsr() {
        return theUsr;
    }

    public Message(String type, Object data){
        this.type = type;
        this.data = data;
    }
/**
 *
 *
 * <p> 服务器和客户端传递信息的类.
 *
 * <p><pre>{@code
 * 演示如何使用该类
 * 例如客户端调用handleShowBookMessage()
 * 调用getREMessage()
 * 即Message message = getREMessage();
 * 将获得的message解释为你需要的比如ShopMessage message = (ShopMessage)message.getData();
 * 通过ShopMessage的getGoodsList()函数得到你需要的list
 * 再比如调用handleBuyMessage(… , …);
 * 之后又需调用getREMessage()比如Message message = (Message)getREMessage();
 * 然后通过message.getResponse()来获得购买是否成功的返回结果
 * }
 * </pre>
 *
 *
 * @see {@link BookMessage}
 * @see {@link BookBorrowMessage}
 * @see {@link CourseMessage}
 * @see {@link ShopMessage}
 * @see {@link StudentMessage}
 * @see {@link UsrMessage}
 * @see {@link client.ClientThread}
 */


}
