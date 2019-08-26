package client;

import message.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ClientThread extends Thread {
    private Client client;
    private ObjectInputStream ob_is = null;
    private ObjectOutputStream ob_os = null;
    private boolean isWaiting = false;
    private Message reMessage = null;


    public ClientThread(Client client) throws IOException {
        this.client = client;
        ob_is = new ObjectInputStream(client.getSocket().getInputStream());
        ob_os = new ObjectOutputStream(client.getSocket().getOutputStream());
    }

    public void run(){
        while (true){
            if (isWaiting){
                try {
                    reMessage = (Message) ob_is.readObject();
                    System.out.println(reMessage.getType());
                } catch (Exception e) {
                    //读不到指令，说明已登出
                    return;
                }
                isWaiting = false;
            }

        }
    }

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

    public Message getREMessage(){
        while (reMessage == null){
            continue;
        }
        return reMessage;
    }



    //--------------------------------------------------------


    public boolean handleLoginMessage(String L_id, String L_pwd){
        UsrMessage loginMessage = new UsrMessage();
        loginMessage.setType("Login");
        loginMessage.setUsr_id(L_id);
        loginMessage.setUsr_pwd(L_pwd);
        Message message = new Message(loginMessage.getType(),loginMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleSignUpMessage(String S_id, String S_pwd, String S_name){
        UsrMessage signupMessage = new UsrMessage();
        signupMessage.setUsr_id(S_id);
        signupMessage.setUsr_pwd(S_pwd);
        signupMessage.setType("SignUp");
        signupMessage.setUsr_name(S_name);
        Message message = new Message(signupMessage.getType(),signupMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleUsrDeleteMessage(String delete_id){
        UsrMessage usrMessage = new UsrMessage();
        usrMessage.setUsr_id(delete_id);
        usrMessage.setType("UsrDelete");
        Message message = new Message(usrMessage.getType(),usrMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleShowStudentMessage(){
        StudentMessage studentMessage = new StudentMessage();
        studentMessage.setType("Student");
        Message message = new Message(studentMessage.getType(),studentMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleAddStudentMessage(String S_id,String S_name,int S_age,String S_college){
        Studentinfo studentinfo = new Studentinfo();
        studentinfo.setStudent_id(S_id);
        studentinfo.setStudent_name(S_name);
        studentinfo.setStudent_age(S_age);
        studentinfo.setStudent_college(S_college);
        StudentMessage studentMessage= new StudentMessage();
        studentMessage.addStudentInfo(studentinfo);
        studentMessage.setType("AddStudent");
        Message message = new Message(studentMessage.getType(),studentMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleDeleteStudentMessage(String S_id){
        Studentinfo studentinfo = new Studentinfo();
        studentinfo.setStudent_id(S_id);
        StudentMessage studentMessage= new StudentMessage();
        studentMessage.addStudentInfo(studentinfo);
        studentMessage.setType("DeleteStudent");
        Message message = new Message(studentMessage.getType(),studentMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleAddBookMessage(String id,String name,String author,int total,int borrowed,String introduction){
        BookInfo bookInfo = new BookInfo();
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
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleDeleteBookMessage(String id){
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBook_id(id);
        BookMessage bookMessage = new BookMessage();
        bookMessage.setType("DeleteBook");
        bookMessage.addBookInfo(bookInfo);
        Message message = new Message(bookMessage.getType(),bookMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleBookBorrowMessage(String book_id){
        BookBorrowMessage bookBorrowMessage = new BookBorrowMessage();
        bookBorrowMessage.setBook_id(book_id);
        Message message = new Message(bookBorrowMessage.getType(),bookBorrowMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleShowBookMessage(){
        BookMessage bookMessage = new BookMessage();
        bookMessage.setType("Book");
        Message message = new Message(bookMessage.getType(),bookMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleShowGoodsMessage(){
        ShopMessage shopMessage = new ShopMessage();
        shopMessage.setType("Shop");
        Message message = new Message(shopMessage.getType(),shopMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }



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
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleAddGood(String name,String id,int price,int quantity){
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setGoods_name(name);
        goodsInfo.setGoods_id(id);
        goodsInfo.setGoods_price(price);
        goodsInfo.setGoods_quantity(quantity);
        ShopMessage shopMessage = new ShopMessage();
        shopMessage.setType("AddGood");
        shopMessage.addGoodsInfo(goodsInfo);
        Message message = new Message(shopMessage.getType(),shopMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleDeleteGoodMessage(String id){
        GoodsInfo goodsInfo = new GoodsInfo();
        ShopMessage shopMessage = new ShopMessage();
        shopMessage.setType("DeleteGood");
        shopMessage.addGoodsInfo(goodsInfo);
        Message message = new Message(shopMessage.getType(),shopMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleCourseSelectMessage(String user_id,String course_id){
        CourseInfo courseInfo = new CourseInfo();
        courseInfo.setCourse_id(course_id);
        CourseMessage courseSelectMessage = new CourseMessage();
        courseSelectMessage.addCourseInfo(courseInfo);
        courseSelectMessage.setType("CourseSelect");
        Message message = new Message(courseSelectMessage.getType(),courseSelectMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleShowCourseMessage(){
        CourseMessage courseMessage = new CourseMessage();
        courseMessage.setType("Course");
        Message message = new Message(courseMessage.getType(),courseMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

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
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }

    public boolean handleDeleteCourseMessage(String id){
        CourseInfo courseInfo = new CourseInfo();
        courseInfo.setCourse_id(id);
        CourseMessage courseMessage = new CourseMessage();
        courseMessage.setType("DeleteCourse");
        courseMessage.addCourseInfo(courseInfo);
        Message message = new Message(courseMessage.getType(),courseMessage);
        if (sendMessage(message)){
            System.out.println("发送成功");
            isWaiting = true;
            return true;
        }
        else {
            System.out.println("发送失败");
            return false;
        }
    }
}
