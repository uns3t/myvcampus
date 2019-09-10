package client;
/**
 * 类 {@code ClientThread} 为前端消息处理提供借口的类.
 *
 * <p> 通过使用该类的handle函数在客户端与服务器进行交互
 *
 * @since 2019/8/19
 */
import message.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ClientThread extends Thread {

    /** 客户端对象 {@value} */
    private Client client;

    /** 输入流对象 {@value} */
    private ObjectInputStream ob_is = null;

    /** 输出流对象 {@value} */
    private ObjectOutputStream ob_os = null;

    /** 服务器对请求的返回Message对象 {@value} */
    private Message reMessage = null;



    public ClientThread(Client client) {
        this.client = client;
        try {
            ob_os = new ObjectOutputStream(client.getSocket().getOutputStream());
            ob_is = new ObjectInputStream(client.getSocket().getInputStream());

            System.out.println("线程启动");
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.start();
    }

    public void run(){
        while (true){
//            if (isWaiting){
//                try {
//                    reMessage = (Message) ob_is.readObject();
//
//                    System.out.println(reMessage.getType());
//                } catch (Exception e) {
//                    //读不到指令，说明已登出
//                    return;
//                }
//                isWaiting = false;
//            }

        }
    }

    /**
     * <p> 发送信息给服务器.
     *
     * <p><pre>{@code
     * 演示如何使用该类
     *
     * 前端封装好相应的Message
     * 调用sendMessage(Message message)
     * }
     * </pre>
     * @param message 前端封装好的信息
     * @return 是否发送成功
     */
    public boolean sendMessage(Message message){
        if (!client.getCon()) {
            System.out.println("客户端还未启动,不能发送消息！");
            return false;
        }
        if (message == null ) {
            System.out.println("消息不能为空！");
            return false;
        }
        try {
            ob_os.writeObject(message);
            ob_os.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     *
     * <p> 获得服务器的返回信息</p>
     *
     * <p><pre>
     *     演示如何使用
     *
     *     前端调用完handle函数
     *     再调用getReMessage()获得返回信息
     * </pre></p>
     *
     * @return 返回的信息
     */
    public Message getREMessage(){
        try {
            reMessage = (Message) ob_is.readObject();
            System.out.println(reMessage.getType());
        } catch (Exception e) {
            //读不到指令，说明已登出
            e.printStackTrace();
        }
        return reMessage;
    }



    //-----------------------------------------------------工具函数-------------------------------------------------------


    //-----------------------------------------登陆注册----------------------------------------------

    /**
     *
     * <p>
     *     处理发送登陆信息
     * </p>
     * @param L_id 用户ID
     * @param L_pwd 用户密码
     * @return 是否成功
     */
    public boolean handleLoginMessage(String L_id, String L_pwd){
        UsrMessage loginMessage = new UsrMessage();
        loginMessage.setType("Login");
        loginMessage.setUsr_id(L_id);
        loginMessage.setUsr_pwd(L_pwd);
        Message message = new Message(loginMessage.getType(),loginMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理发送登出信息
     * </p>
     * @return 是否成功
     */
    public boolean handleLogOutMessage(){
        UsrMessage loginMessage = new UsrMessage();
        loginMessage.setType("LogOut");
        Message message = new Message(loginMessage.getType(),loginMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理发送注册信息
     * </p>
     *
     *
     * @param S_id 注册ID
     * @param S_pwd 注册密码
     * @param S_name 注册用户名
     * @return 是否成功
     */
    public boolean handleSignUpMessage(String S_id, String S_pwd, String S_name){
        UsrMessage signupMessage = new UsrMessage();
        signupMessage.setUsr_id(S_id);
        signupMessage.setUsr_pwd(S_pwd);
        signupMessage.setType("SignUp");
        signupMessage.setUsr_name(S_name);
        Message message = new Message(signupMessage.getType(),signupMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理发送更新用户信息
     * </p>
     *
     * @param S_id 更新的ID
     * @param S_pwd 更新的密码
     * @param S_name 更新的用户名
     * @return 是否成功
     */
    public boolean handleUpdateUsrMessage(String S_id, String S_pwd, String S_name){
        UsrMessage signupMessage = new UsrMessage();
        signupMessage.setUsr_id(S_id);
        signupMessage.setUsr_pwd(S_pwd);
        signupMessage.setType("UsrUpdate");
        signupMessage.setUsr_name(S_name);
        Message message = new Message(signupMessage.getType(),signupMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理删除用户信息
     * </p>
     * @param delete_id 删除的用户ID
     * @return 是否成功
     */
    public boolean handleUsrDeleteMessage(String delete_id){
        UsrMessage usrMessage = new UsrMessage();
        usrMessage.setUsr_id(delete_id);
        usrMessage.setType("UsrDelete");
        Message message = new Message(usrMessage.getType(),usrMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }


    //----------------------------------------------学籍管理-----------------------------------------------

    /**
     *
     * <p>
     *     处理获得学生学籍信息
     * </p>
     * @return 是否成功
     */
    public boolean handleShowStudentMessage(){
        StudentMessage studentMessage = new StudentMessage();
        studentMessage.setType("Student");
        Message message = new Message(studentMessage.getType(),studentMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理添加学生学籍信息
     * </p>
     * @param S_id 学生学号
     * @param S_name 学生姓名
     * @param S_college 学生学院
     * @param S_onecardid 学生一卡通
     * @param S_card_type 学生证件类型
     * @param S_card_id 学生证件ID
     * @param S_sex 学生性别
     * @param S_shengyuandi 学生生源地
     * @param S_phone 学生电话
     * @param S_content 学生简介
     * @param S_birthday 学生生日
     * @return 是否成功
     */
    public boolean handleAddStudentMessage(String S_id,String S_name,String S_college,String S_onecardid,
                                           String S_card_type, String S_card_id,String S_sex, String S_shengyuandi,
                                           String S_phone, String S_content,String S_birthday){
        Studentinfo studentinfo = new Studentinfo();
        studentinfo.setStudent_id(S_id);
        studentinfo.setStudent_name(S_name);
        studentinfo.setStudent_birthday(S_birthday);
        studentinfo.setStudent_card_id(S_card_id);
        studentinfo.setStudent_card_type(S_card_type);
        studentinfo.setStudent_onecardid(S_onecardid);
        studentinfo.setStudent_sex(S_sex);
        studentinfo.setStudent_phone(S_phone);
        studentinfo.setStudent_shengyuandi(S_shengyuandi);
        studentinfo.setStudent_college(S_college);
        studentinfo.setStudent_ins(S_content);
        StudentMessage studentMessage= new StudentMessage();
        studentMessage.addStudentInfo(studentinfo);
        studentMessage.setType("AddStudent");
        Message message = new Message(studentMessage.getType(),studentMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理更新学生学籍信息
     * </p>
     * @param S_id 学生学号
     * @param S_name 学生姓名
     * @param S_college 学生学院
     * @param S_onecardid 学生一卡通
     * @param S_card_type 学生证件类型
     * @param S_card_id 学生证件ID
     * @param S_sex 学生性别
     * @param S_shengyuandi 学生生源地
     * @param S_phone 学生电话
     * @param S_content 学生简介
     * @param S_birthday 学生生日
     * @return 是否成功
     */
    public boolean handleUpdateStudentMessage(String S_id,String S_name,String S_college,String S_onecardid,
                                           String S_card_type, String S_card_id,String S_sex, String S_shengyuandi,
                                           String S_phone, String S_content,String S_birthday){
        Studentinfo studentinfo = new Studentinfo();
        studentinfo.setStudent_id(S_id);
        studentinfo.setStudent_name(S_name);
        studentinfo.setStudent_birthday(S_birthday);
        studentinfo.setStudent_card_id(S_card_id);
        studentinfo.setStudent_card_type(S_card_type);
        studentinfo.setStudent_onecardid(S_onecardid);
        studentinfo.setStudent_sex(S_sex);
        studentinfo.setStudent_phone(S_phone);
        studentinfo.setStudent_shengyuandi(S_shengyuandi);
        studentinfo.setStudent_college(S_college);
        studentinfo.setStudent_ins(S_content);
        StudentMessage studentMessage= new StudentMessage();
        studentMessage.addStudentInfo(studentinfo);
        studentMessage.setType("UpdateStudent");
        Message message = new Message(studentMessage.getType(),studentMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理删除学生学籍信息
     * </p>
     * @param S_id 学生学号
     * @return 是否成功
     */
    public boolean handleDeleteStudentMessage(String S_id){
        Studentinfo studentinfo = new Studentinfo();
        studentinfo.setStudent_id(S_id);
        StudentMessage studentMessage= new StudentMessage();
        studentMessage.addStudentInfo(studentinfo);
        studentMessage.setType("DeleteStudent");
        Message message = new Message(studentMessage.getType(),studentMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    //------------------------------------------------图书馆-------------------------------------------------

    /**
     *
     * <p>
     *     处理添加图书信息
     * </p>
     * @param id 图书ID
     * @param name 书籍名称
     * @param author 书籍作者
     * @param total 书籍总数
     * @param borrowed 借书数量
     * @param introduction 书籍简介
     * @param press 书籍出版社
     * @return 是否成功
     */
    public boolean handleAddBookMessage(String id,String name,String author,int total,int borrowed,String introduction,String press){
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBook_press(press);
        bookInfo.setBook_id(id);
        bookInfo.setBook_author(author);
        bookInfo.setBook_name(name);
        bookInfo.setBook_total(total);
        bookInfo.setBook_borrowed(borrowed);
        bookInfo.setBook_introduction(introduction);
        BookMessage bookMessage = new BookMessage();
        bookMessage.setType("AddBook");
        bookMessage.addBookInfo(bookInfo);
        Message message = new Message(bookMessage.getType(),bookMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理更新图书信息
     * </p>
     * @param id 图书ID
     * @param name 书籍名称
     * @param author 书籍作者
     * @param total 书籍总数
     * @param borrowed 借书数量
     * @param introduction 书籍简介
     * @param press 书籍出版社
     * @return 是否成功
     */
    public boolean handleUpdateBookMessage(String id,String name,String author,int total,int borrowed,String press,String introduction){
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBook_id(id);
        bookInfo.setBook_author(author);
        bookInfo.setBook_name(name);
        bookInfo.setBook_total(total);
        bookInfo.setBook_press(press);
        bookInfo.setBook_borrowed(borrowed);
        bookInfo.setBook_introduction(introduction);
        BookMessage bookMessage = new BookMessage();
        bookMessage.setType("UpdateBook");
        bookMessage.addBookInfo(bookInfo);
        Message message = new Message(bookMessage.getType(),bookMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理删除书籍信息
     * </p>
     * @param id 书籍编号
     * @return 是否成功
     */
    public boolean handleDeleteBookMessage(String id){
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBook_id(id);
        BookMessage bookMessage = new BookMessage();
        bookMessage.setType("DeleteBook");
        bookMessage.addBookInfo(bookInfo);
        Message message = new Message(bookMessage.getType(),bookMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理借书信息
     * </p>
     * @param book_id 书籍编号
     * @return 是否成功
     */
    public boolean handleBookBorrowMessage(String book_id){
        BookBorrowMessage bookBorrowMessage = new BookBorrowMessage();
        bookBorrowMessage.setBook_id(book_id);
        Message message = new Message(bookBorrowMessage.getType(),bookBorrowMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理还书信息
     * </p>
     * @param book_id 书籍编号
     * @return 是否成功
     */
    public boolean handleBookReturnMessage(String book_id){
        BookBorrowMessage bookBorrowMessage = new BookBorrowMessage();
        bookBorrowMessage.setType("BookReturn");
        bookBorrowMessage.setBook_id(book_id);
        Message message = new Message(bookBorrowMessage.getType(),bookBorrowMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理获得书籍信息
     * </p>
     *
     * @return 是否成功
     */
    public boolean handleShowBookMessage(){
        BookMessage bookMessage = new BookMessage();
        bookMessage.setType("Book");
        Message message = new Message(bookMessage.getType(),bookMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理获得管理员端的借书信息
     * </p>
     * @return 是否成功
     */
    public boolean handleShowAdminBookBorrowMessage(){
        BookMessage bookMessage = new BookMessage();
        bookMessage.setType("adminBookBorrowList");
        Message message = new Message(bookMessage.getType(),bookMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理获得学生端的借书信息
     * </p>
     * @return 是否成功
     */
    public boolean handleShowUsrBookBorrowMessage(){
        BookMessage bookMessage = new BookMessage();
        bookMessage.setType("usrBookBorrowList");
        Message message = new Message(bookMessage.getType(),bookMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }
    //--------------------------------------------商店------------------------------------------------

    /**
     * <p>
     *     处理获得商品信息
     * </p>
     * @return 是否成功
     */
    public boolean handleShowGoodsMessage(){
        ShopMessage shopMessage = new ShopMessage();
        shopMessage.setType("Shop");
        Message message = new Message(shopMessage.getType(),shopMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理买商品信息
     * </p>
     * @param goods_id 货物编号
     * @param goods_quantity 购买货物数量
     * @return 是否成功
     */
    public boolean handleBuyMessage(String goods_id,int goods_quantity){
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setGoods_id(goods_id);
        goodsInfo.setGoods_quantity(goods_quantity);
        ShopMessage buyMessage = new ShopMessage();
        buyMessage.addGoodsInfo(goodsInfo);
        buyMessage.setType("Buy");
        Message message = new Message(buyMessage.getType(),buyMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理添加商品信息
     * </p>
     * @param name 商品名称
     * @param id 商品编号
     * @param price 商品价格
     * @param quantity 商品数量
     * @param sales 商品已售数量
     * @return 是否成功
     */
    public boolean handleAddGood(String name,String id,int price,int quantity,int sales){
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setGoods_name(name);
        goodsInfo.setGoods_id(id);
        goodsInfo.setGoods_price(price);
        goodsInfo.setGoods_quantity(quantity);
        goodsInfo.setGoods_sales(sales);
        ShopMessage shopMessage = new ShopMessage();
        shopMessage.setType("AddGood");
        shopMessage.addGoodsInfo(goodsInfo);
        Message message = new Message(shopMessage.getType(),shopMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }
    /**
     *
     * <p>
     *     处理更新商品信息
     * </p>
     * @param name 商品名称
     * @param id 商品编号
     * @param price 商品价格
     * @param quantity 商品数量
     * @param sales 商品已售数量
     * @return 是否成功
     */
    public boolean handleUpdateGood(String name,String id,int price,int quantity,int sales){
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setGoods_name(name);
        goodsInfo.setGoods_id(id);
        goodsInfo.setGoods_price(price);
        goodsInfo.setGoods_quantity(quantity);
        goodsInfo.setGoods_sales(sales);
        ShopMessage shopMessage = new ShopMessage();
        shopMessage.setType("UpdateGood");
        shopMessage.addGoodsInfo(goodsInfo);
        Message message = new Message(shopMessage.getType(),shopMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理删除商品数量
     * </p>
     * @param id 商品ID
     * @return 是否成功
     */
    public boolean handleDeleteGoodMessage(String id){
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setGoods_id(id);
        ShopMessage shopMessage = new ShopMessage();
        shopMessage.setType("DeleteGood");
        shopMessage.addGoodsInfo(goodsInfo);
        Message message = new Message(shopMessage.getType(),shopMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *  <p>
     *      处理密码确认请求
     *  </p>
     * @param pwd 用户密码
     * @return 是否成功
     */
    public boolean handlePwdConfirm(String pwd){
        UsrMessage usrMessage = new UsrMessage();
        usrMessage.setUsr_pwd(pwd);
        usrMessage.setType("PwdConfirm");
        Message message = new Message(usrMessage.getType(),usrMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    //--------------------------------------------选课---------------------------------------------------

    /**
     *
     * <p>
     *     处理选课信息
     * </p>
     * @param course_id 课程编号
     * @return 是否成功
     */
    public boolean handleCourseSelectMessage(String course_id){
        CourseInfo courseInfo = new CourseInfo();
        courseInfo.setCourse_id(course_id);
        CourseMessage courseSelectMessage = new CourseMessage();
        courseSelectMessage.addCourseInfo(courseInfo);
        courseSelectMessage.setType("CourseSelect");
        Message message = new Message(courseSelectMessage.getType(),courseSelectMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理获得课程信息
     * </p>
     * @return 是否成功
     */
    public boolean handleShowCourseMessage(){
        CourseMessage courseMessage = new CourseMessage();
        courseMessage.setType("Course");
        Message message = new Message(courseMessage.getType(),courseMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理添加课程信息
     * </p>
     * @param id 课程编号
     * @param name 课程名称
     * @param teacher 授课老师
     * @param time 上课时间
     * @return 是否成功
     */
    public boolean handleAddCourseMessage(String id,String name,String teacher,String time){
        CourseInfo courseInfo = new CourseInfo();
        courseInfo.setCourse_id(id);
        courseInfo.setCourse_name(name);
        courseInfo.setCourse_teacher(teacher);
        courseInfo.setCourse_time(time);
        CourseMessage courseMessage = new CourseMessage();
        courseMessage.setType("AddCourse");
        courseMessage.addCourseInfo(courseInfo);
        Message message = new Message(courseMessage.getType(),courseMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     更新
     * </p>
     * @param id 课程编号
     * @param name 课程名称
     * @param teacher 授课老师
     * @param time 上课时间
     * @return 是否成功
     */
    public boolean handleUpdateCourseMessage(String id,String name,String teacher,String time){
        CourseInfo courseInfo = new CourseInfo();
        courseInfo.setCourse_id(id);
        courseInfo.setCourse_name(name);
        courseInfo.setCourse_teacher(teacher);
        courseInfo.setCourse_time(time);
        CourseMessage courseMessage = new CourseMessage();
        courseMessage.setType("UpdateCourse");
        courseMessage.addCourseInfo(courseInfo);
        Message message = new Message(courseMessage.getType(),courseMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理删除课程信息
     * </p>
     * @param id 课程编号
     * @return是否成功
     */
    public boolean handleDeleteCourseMessage(String id){
        CourseInfo courseInfo = new CourseInfo();
        courseInfo.setCourse_id(id);
        CourseMessage courseMessage = new CourseMessage();
        courseMessage.setType("DeleteCourse");
        courseMessage.addCourseInfo(courseInfo);
        Message message = new Message(courseMessage.getType(),courseMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理删除选课信息
     * </p>
     * @param id 课程编号
     * @return是否成功
     */
    public boolean handleDeleteCourseSelectMessage(String id){
        CourseInfo courseInfo = new CourseInfo();
        courseInfo.setCourse_id(id);
        CourseMessage courseMessage = new CourseMessage();
        courseMessage.setType("DeleteCourseSelect");
        courseMessage.addCourseInfo(courseInfo);
        Message message = new Message(courseMessage.getType(),courseMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    /**
     *
     * <p>
     *     处理获得课表信息
     * </p>
     * @return 是否成功
     */
    public boolean handleShowCourseTable(){
        CourseInfo courseInfo = new CourseInfo();
        CourseMessage courseMessage = new CourseMessage();
        courseMessage.setType("CourseTable");
        courseMessage.addCourseInfo(courseInfo);
        Message message = new Message(courseMessage.getType(),courseMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
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
     * @see {@link Client}
     */
}

