package Server;
/**
 * 类 {@code ServerThread} 服务器端消息处理的类.
 *
 * <p> 通过使用该类的handle函数在客户端与服务器进行交互
 *
 * @since 2019/8/19
 */
import message.*;
import DAO.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.lang.Exception;


public class ServerThread extends Thread {
    private Server currentServer;

    /** 客户端对象 {@value} */
    private Socket client;

    /** 输入流对象 {@value} */
    private ObjectInputStream ois;

    /** 输出流对象 {@value} */
    private ObjectOutputStream oos;

    /** 当前登陆用户 {@value} */
    public static String theUsr;

    /** 用于从数据库获得数据端ToAccess对象 {@value} */
    public static ToAccess toAccess;



    public ServerThread(Socket s, Server st) {
        client = s;
        currentServer = st;
        theUsr = "";
        try {
            //建立输入输出流（次序与客户端相反）
            ois = new ObjectInputStream(client.getInputStream());
            oos = new ObjectOutputStream(client.getOutputStream());

            System.out.println("Client connected");

        } catch (IOException e) {
            System.out.println("Cannot get IO stream");
            e.printStackTrace();
        }
    }

    public void run() {
        toAccess=new ToAccess();
        toAccess.getcon();
        Message message=null;
        while (true) {
            //读取消息
            try {
                message = (Message) ois.readObject();
                System.out.println(message.getType());
            } catch (Exception e) {
//                e.printStackTrace();
                //客户端已关闭
                System.out.println("连接断开");
                return;
            }

            //判断消息属于哪一类型，调用对应模块函数完成相应功能
            switch (message.getType()) {


                //用户模块
                case "Login":
                    Login(message);
                    break;

                case "SignUp":
                    Signup(message);
                    break;

                case "UsrDelete":
                    deleteusr(message);
                    break;

                case "UsrUpdate":
                    updateusr(message);
                    break;
                case "LogOut":
                    exitlogin();
                    break;

                //学籍管理模块
                case "Student":
                    Studentlist();
                    break;

                case "AddStudent":
                    addstudent(message);
                    break;

                case "DeleteStudent":
                    deletestudent(message);
                    break;

                case "UpdateStudent":
                    updatestudent(message);
                    break;

                case "UsrStudent":
                    usrstudent();
                    break;

                //图书馆模块
                case "Book":
                    Librarylist();
                    break;

                case "adminBookBorrowList":
                    adminbookborrowlist(message);
                    break;

                case "usrBookBorrowList":
                    break;

                case "BookBorrow":
                    bookBorrow(message);
                    break;

                case "AddBook":
                    addbook(message);
                    break;

                case "DeleteBook":
                    deletebook(message);
                    break;

                case "UpdateBook":
                    updatebook(message);
                    break;

                case "BookReturn":
                    returnBook(message);
                    break;

                //商店模块
                case "Shop":
                    Shoplist();
                    break;

                case "Buy":
                    buyshop(message);
                    break;

                case "AddGood":
                    addshop(message);
                    break;

                case "DeleteGood":
                    deleteshop(message);
                    break;

                case "UpdateGood":
                    updateshop(message);
                    break;

                case "PwdConfirm":
                    PwdConfirm(message);
                    break;

                //课程选择模块
                case "Course":
                    Courselist();
                    break;

                case "AddCourse":
                    addcourse(message);
                    break;

                case "DeleteCourse":
                    deletecourse(message);
                    break;

                case "CourseSelect":
                    selectcourse(message);
                    break;

                case "UpdateCourse":
                    updatecourse(message);
                    break;

                case "CourseTable":
                    courseTable(message);
                    break;

                case "DeleteCourseSelect":
                    deletecourseSelect(message);
                    break;
            }
        }
    }

    public void close() {
        if (client != null) {
            try {
                oos.close();
                ois.close();


                client.close();

//                currentServer.closeClientConnection(this);//在服务器线程中关闭该客户端

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //-------------------------工具函数------------------------------------------------------------

    /**
     *
     * <p>
     *     发送处理结果端返回数据
     * </p>
     * @param message 返回给客户端的Message
     * @throws Exception socket异常
     */
    public void sendmsg(Message message)throws Exception{
        oos.writeObject(message);
        oos.flush();
        System.out.println("成功");

    }

    //------------------------------具体功能模块----------------------------------------------------
    //--------------------------------------------------------------------------------------------

    //------------------------------用户模块-------------------------------------

    /**
     *
     * <p>
     *     登陆请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void Login(Message message){
        UsrMessage usrMessage =(UsrMessage) message.getData();
        try {
            int temp=toAccess.getusr().Logincheck(usrMessage.getUsr_id(), usrMessage.getUsr_pwd());
            if(temp==1){
                theUsr= usrMessage.getUsr_id();
                usrMessage.set_isadmin(true);
                message.setData(usrMessage);
                message.setResponse(true);
                sendmsg(message);
            }else if(temp==0){
                theUsr= usrMessage.getUsr_id();
                usrMessage.set_isadmin(false);
                message.setData(usrMessage);
                message.setResponse(true);
                sendmsg(message);
            }else {
                message.setResponse(false);
                sendmsg(message);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     *
     * <p>
     *     密码确认请求d返回函数
     * </p>
     * @param message 得到的Message
     */
    public void PwdConfirm(Message message){
        UsrMessage usrMessage =(UsrMessage) message.getData();
        try {
            int temp=toAccess.getusr().Logincheck(theUsr, usrMessage.getUsr_pwd());
            if(temp!=-1){
                message.setData(usrMessage);
                message.setResponse(true);
                sendmsg(message);
            }else {
                message.setResponse(false);
                sendmsg(message);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     *
     * <p>
     *     注册请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void Signup(Message message){
        UsrMessage signupMessage=(UsrMessage)message.getData();
        try {
            toAccess.getusr().signup(signupMessage.getUsr_name(),signupMessage.getUsr_pwd(),signupMessage.getUsr_id());
            message.setResponse(true);
            oos.writeObject(message);
            oos.flush();
        }catch (Exception e){

        }
    }

    /**
     *
     * <p>
     *     删除用户请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void deleteusr(Message message){
        UsrMessage usrMessage=(UsrMessage)message.getData();
        try {
            toAccess.getusr().deleteUsr(usrMessage.getUsr_id());
            message.setResponse(true);
            sendmsg(message);
        }catch (Exception e){

        }
    }

    /**
     *
     * <p>
     *     更新用户信息请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void updateusr(Message message){
        UsrMessage signupMessage=(UsrMessage)message.getData();
        try {
            toAccess.getusr().updateusr(signupMessage.getUsr_name(),signupMessage.getUsr_pwd(),signupMessage.getUsr_id());
            message.setResponse(true);
            sendmsg(message);
        }catch (Exception e){

        }
    }

    /**
     *
     * <p>
     *     登出请求的操作函数
     * </p>
     */
    public void exitlogin(){
        theUsr=null;
    }

    //    -----------------------------图书馆模块--------------------------------------------

    /**
     *
     * <p>
     *     获得图书信息请求的返回函数
     * </p>
     */
    public void Librarylist(){
        BookMessage bookMessage=new BookMessage();
        try {
            bookMessage.setBooklist(toAccess.getBook().listBook());
            Message msg=new Message("Book",bookMessage);
            msg.setTheUsr(theUsr);
            msg.setResponse(true);
            oos.writeObject(msg);
            oos.flush();
        }catch (Exception e){}

    }

    /**
     *
     * <p>
     *     借书请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void bookBorrow(Message message){
        BookBorrowMessage bookBorrowMessage=(BookBorrowMessage) message.getData();
        try {
            toAccess.getBook().addBookborrow(bookBorrowMessage.getBook_id(),theUsr);
            message.setTheUsr(theUsr);
            message.setResponse(true);
            sendmsg(message);
        }catch (Exception e){

        }
    }

    /**
     *
     * <p>
     *     添加图书请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void addbook(Message message){
        BookMessage bookMessage=(BookMessage) message.getData();
        BookInfo bookInfo=(BookInfo) bookMessage.getbook().get(0);
        try {
            toAccess.getBook().addBook(bookInfo.getBook_name(),bookInfo.getBook_id(),bookInfo.getBook_author(),bookInfo.getBook_press(),
                    bookInfo.getBook_total()+"",bookInfo.getBook_borrowed()+"",bookInfo.getBook_introduction());
            message.setResponse(true);
            message.setTheUsr(theUsr);
            oos.writeObject(message);
            oos.flush();
        }catch (Exception e){}
    }

    /**
     *
     * <p>
     *     删除图书请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void deletebook(Message message){
        BookMessage bookMessage=(BookMessage) message.getData();
        BookInfo bookInfo=(BookInfo) bookMessage.getbook().get(0);
        try {
            toAccess.getBook().deleteBook(bookInfo.getBook_id());
            message.setTheUsr(theUsr);
            message.setResponse(true);
            oos.writeObject(message);
            oos.flush();
        }catch (Exception e){}
    }

    /**
     *
     * <p>
     *     更新图书请求d返回函数
     * </p>
     * @param message 得到的Message
     */
    public void updatebook(Message message){
        BookMessage bookMessage=(BookMessage) message.getData();
        BookInfo bookInfo=(BookInfo) bookMessage.getbook().get(0);
        try {
            toAccess.getBook().updateBook(bookInfo.getBook_name(),bookInfo.getBook_id(),bookInfo.getBook_author(),bookInfo.getBook_press(),
                    bookInfo.getBook_total()+"",bookInfo.getBook_borrowed()+"",bookInfo.getBook_introduction());
            message.setResponse(true);
            message.setTheUsr(theUsr);
            oos.writeObject(message);
            oos.flush();
        }catch (Exception e){}
    }

    /**
     *
     * <p>
     *     还书请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void returnBook(Message message){
        BookMessage bookMessage=(BookMessage) message.getData();
        BookInfo bookInfo=(BookInfo) bookMessage.getbook().get(0);
        try {
            toAccess.getBook().returnBook(bookInfo.getBook_id(),theUsr);
            message.setResponse(true);
            message.setTheUsr(theUsr);
            oos.writeObject(message);
            oos.flush();
        }catch (Exception e){}
    }

    /**
     *
     * <p>
     *     获得管理员端借书信息请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void adminbookborrowlist(Message message){
        BookMessage bookMessage=new BookMessage();
        try {
            bookMessage.setBooklist(toAccess.getBook().listBookBorrow());
            Message msg=new Message("adminBookBorrowList",bookMessage);
            msg.setTheUsr(theUsr);
            msg.setResponse(true);
            oos.writeObject(msg);
            oos.flush();
        }catch (Exception e){}
    }

    /**
     *
     * <p>
     *     获得用户端借书信息请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void usrbookborrowlist(Message message){
        BookMessage bookMessage=new BookMessage();
        try {
            bookMessage.setBooklist(toAccess.getBook().listUsrBookBorrow(theUsr));
            Message msg=new Message("usrBookBorrowList",bookMessage);
            msg.setTheUsr(theUsr);
            msg.setResponse(true);
            oos.writeObject(msg);
            oos.flush();
        }catch (Exception e){}
    }

    //-------------------------------学籍管理----------------------------------------------

    /**
     *
     * <p>
     *     获得学生学籍信息请求的返回函数
     * </p>
     */
    public void Studentlist(){
        StudentMessage studentMessage=new StudentMessage();
        try {
            studentMessage.setStudentlist(toAccess.getstudent().listStudent());
            Message msg=new Message("Student",studentMessage);
            msg.setResponse(true);
            msg.setTheUsr(theUsr);
            oos.writeObject(msg);
            oos.flush();
        }catch (Exception e){}
    }

    /**
     *
     * <p>
     *     添加学生学籍信息请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void addstudent(Message message){
        StudentMessage studentMessage=(StudentMessage) message.getData();
        Studentinfo studentinfo=(Studentinfo) studentMessage.getStudent().get(0);
        try {
            toAccess.getstudent().addStudent(studentinfo.getStudent_id(),studentinfo.getStudent_name(),studentinfo.getStudent_college()
                    ,studentinfo.getStudent_onecardid(),studentinfo.getStudent_phone(),studentinfo.getStudent_card_type(),studentinfo.getStudent_card_id(),studentinfo.getStudent_ins(),
                    studentinfo.getStudent_birthday(),studentinfo.getStudent_shengyuandi(),studentinfo.getStudent_sex());
            message.setResponse(true);
            message.setTheUsr(theUsr);
            oos.writeObject(message);
            oos.flush();
        }catch (Exception e){}

    }

    /**
     *
     * <p>
     *     删除学生学籍信息请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void deletestudent(Message message){
        StudentMessage studentMessage=(StudentMessage) message.getData();
        Studentinfo studentinfo=(Studentinfo) studentMessage.getStudent().get(0);
        try {
            toAccess.getstudent().deleteStudent(studentinfo.getStudent_id());
            message.setResponse(true);
            message.setTheUsr(theUsr);
            oos.writeObject(message);
            oos.flush();
        }catch (Exception e){}
    }

    /**
     *
     * <p>
     *     更新学生学籍信息请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void updatestudent(Message message){
        StudentMessage studentMessage=(StudentMessage) message.getData();
        Studentinfo studentinfo=(Studentinfo) studentMessage.getStudent().get(0);
        try {
            toAccess.getstudent().updateStudent(studentinfo.getStudent_id(),studentinfo.getStudent_name(),studentinfo.getStudent_college()
                    ,studentinfo.getStudent_onecardid(),studentinfo.getStudent_phone(),studentinfo.getStudent_card_type(),studentinfo.getStudent_card_id(),studentinfo.getStudent_ins(),
                    studentinfo.getStudent_birthday(),studentinfo.getStudent_shengyuandi(),studentinfo.getStudent_sex());
            message.setResponse(true);
            message.setTheUsr(theUsr);
            oos.writeObject(message);
            oos.flush();
        }catch (Exception e){}

    }

    /**
     *
     * <p>
     *     获得用户端学生学籍信息请求的返回函数
     * </p>
     */
    public void usrstudent(){
        StudentMessage studentMessage=new StudentMessage();
        try {
            studentMessage.setStudentlist(toAccess.getstudent().usrStudent(theUsr));
            Message msg=new Message("Student",studentMessage);
            msg.setResponse(true);
            msg.setTheUsr(theUsr);
            oos.writeObject(msg);
            oos.flush();
        }catch (Exception e){}
    }
    //-----------------------------------课程模块-------------------------------------------

    /**
     *
     * <p>
     *     获得课程信息请求的返回函数
     * </p>
     */
    public void Courselist(){
        CourseMessage courseMessage=new CourseMessage();
        try {
            courseMessage.setCourselist(toAccess.getCourse().listcourse());
            System.out.println("测试1");
            Message msg=new Message("Course",courseMessage);
            msg.setResponse(true);
            msg.setTheUsr(theUsr);
            oos.writeObject(msg);
            oos.flush();
        }catch (Exception e){
        }
    }

    /**
     *
     * <p>
     *     添加课程信息请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void addcourse(Message message){
        CourseMessage courseMessage=(CourseMessage) message.getData();
        CourseInfo courseInfo=(CourseInfo) courseMessage.getCourse().get(0);
        try {
            toAccess.getCourse().addcourse(courseInfo.getCourse_name(),courseInfo.getCourse_id(),courseInfo.getCourse_teacher(),courseInfo.getCourse_time());
            message.setResponse(true);
            message.setTheUsr(theUsr);
            sendmsg(message);
        }catch (Exception e){

        }
    }

    /**
     *
     * <p>
     *     删除课程信息请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void deletecourse(Message message){
        CourseMessage courseMessage=(CourseMessage) message.getData();
        CourseInfo courseInfo=(CourseInfo) courseMessage.getCourse().get(0);
        try {
            toAccess.getCourse().deletecourse(courseInfo.getCourse_id());
            message.setResponse(true);
            message.setTheUsr(theUsr);
            sendmsg(message);
        }catch (Exception e){
        }
    }

    /**
     *
     * <p>
     *     删除选课信息请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void deletecourseSelect(Message message){
        CourseMessage courseMessage=(CourseMessage) message.getData();
        CourseInfo courseInfo=(CourseInfo) courseMessage.getCourse().get(0);
        try {
            toAccess.getCourse().deletecourseSelect(courseInfo.getCourse_id(),theUsr);
            message.setResponse(true);
            message.setTheUsr(theUsr);
            sendmsg(message);
        }catch (Exception e){
        }
    }

    /**
     *
     * <p>
     *     选课请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void selectcourse(Message message){
        CourseMessage courseMessage=(CourseMessage) message.getData();
        CourseInfo courseInfo=(CourseInfo) courseMessage.getCourse().get(0);
        try {
            toAccess.getCourse().addCourseSelect(courseInfo.getCourse_id(),theUsr);
            message.setResponse(true);
            message.setTheUsr(theUsr);
            sendmsg(message);
        }catch (Exception e){
        }
    }

    /**
     *
     * <p>
     *     更新课程信息请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void updatecourse(Message message){
        CourseMessage courseMessage=(CourseMessage) message.getData();
        CourseInfo courseInfo=(CourseInfo) courseMessage.getCourse().get(0);
        try {
            toAccess.getCourse().updatecourse(courseInfo.getCourse_name(),courseInfo.getCourse_id(),courseInfo.getCourse_teacher(),courseInfo.getCourse_time());
            message.setResponse(true);
            message.setTheUsr(theUsr);
            sendmsg(message);
        }catch (Exception e){
        }
    }

    /**
     *
     * <p>
     *     获得学生课表请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void courseTable(Message message){
        CourseMessage courseMessage=new CourseMessage();
        try {
            courseMessage.setCourselist(toAccess.getCourse().showCourseSelect(theUsr));
            System.out.println("测试1");
            Message msg=new Message("CourseTable",courseMessage);
            msg.setResponse(true);
            message.setTheUsr(theUsr);
            oos.writeObject(msg);
            oos.flush();
        }catch (Exception e){
        }
    }

    //--------------------------------------商店模块-----------------------------------------

    /**
     *
     * <p>
     *     获得商品列表的请求的返回函数
     * </p>
     */
    public void Shoplist(){
        ShopMessage shopMessage=new ShopMessage();
        try {
            shopMessage.setGoodslist(toAccess.getshop().listShop());
            Message msg=new Message("Shop",shopMessage);
            msg.setResponse(true);
            msg.setTheUsr(theUsr);
            sendmsg(msg);
        }catch (Exception e){

        }
    }

    /**
     *
     * <p>
     *     添加商品信息请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void addshop(Message message){
        ShopMessage shopMessage=(ShopMessage) message.getData();
        GoodsInfo goodsInfo=(GoodsInfo)shopMessage.getGoodsInfo().get(0);
        try {
            toAccess.getshop().addShop(goodsInfo.getGoods_id(),goodsInfo.getGoods_name(),goodsInfo.getGoods_price()+"",
                    goodsInfo.getGoods_quantity()+"",goodsInfo.getGoods_sales()+"");
            message.setResponse(true);
            message.setTheUsr(theUsr);
            sendmsg(message);
        }catch (Exception e){

        }
    }

    /**
     *
     * <p>
     *     删除商品信息请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void deleteshop(Message message){
        ShopMessage shopMessage=(ShopMessage) message.getData();
        GoodsInfo goodsInfo=(GoodsInfo)shopMessage.getGoodsInfo().get(0);
        try {
            System.out.println(goodsInfo.getGoods_id());
            toAccess.getshop().deleteShop(goodsInfo.getGoods_id());
            message.setResponse(true);
            message.setTheUsr(theUsr);
            sendmsg(message);
        }catch (Exception e){

        }
    }

    /**
     *
     * <p>
     *     购买商品请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void buyshop(Message message){
        System.out.println("buyshop function");
        ShopMessage shopMessage=(ShopMessage) message.getData();
        GoodsInfo goodsInfo=(GoodsInfo)shopMessage.getGoodsInfo().get(0);
        try {
            if (toAccess.getshop().buygoods(goodsInfo.getGoods_id(),goodsInfo.getGoods_quantity(),theUsr)){
                message.setResponse(true);
                message.setTheUsr(theUsr);
                sendmsg(message);
            }
            else {
                message.setResponse(false);
                message.setTheUsr(theUsr);
                sendmsg(message);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     *
     * <p>
     *     更新商品信息请求的返回函数
     * </p>
     * @param message 得到的Message
     */
    public void updateshop(Message message){
        ShopMessage shopMessage=(ShopMessage) message.getData();
        GoodsInfo goodsInfo=(GoodsInfo)shopMessage.getGoodsInfo().get(0);
        try {
            toAccess.getshop().updateShop(goodsInfo.getGoods_id(),goodsInfo.getGoods_name(),goodsInfo.getGoods_price()+"",
                    goodsInfo.getGoods_quantity()+"",goodsInfo.getGoods_sales()+"");
            message.setResponse(true);
            message.setTheUsr(theUsr);
            sendmsg(message);
        }catch (Exception e){

        }
    }
/**
 * @see {@link Message}
 * @see {@link BookMessage}
 * @see {@link BookBorrowMessage}
 * @see {@link CourseMessage}
 * @see {@link ShopMessage}
 * @see {@link StudentMessage}
 * @see {@link UsrMessage}
 * @see {@link Server}
 * @see {@link ToAccess}
 */
}
