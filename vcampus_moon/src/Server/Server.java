package Server;
import java.io.IOException;
import java.io.Serializable;
import java.net.BindException;
import java.net.ServerSocket;
import java.util.Vector;
import java.net.Socket;


public class Server extends Thread {
    private ServerSocket server;
    private Vector<ServerThread> manyserver;

    public Server() {
        try {
            server = new ServerSocket(10001);
            System.out.println("主线程开始监听10001");
            manyserver = new Vector<ServerThread>();
            this.start();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        //当服务器在运行
        while(!server.isClosed()) {
            try {
                Socket client = server.accept();//监听新的客户端

                ServerThread current = new ServerThread(client, this);
                current.start();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void close() {
        //如果服务器Socket已被打开
        if (server != null) {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 返回当前已连接客户端数量
     */
    public int getSize() {
        return manyserver.size();
    }

    /**
     * 向向量中添加新的客户端
     */
    public int addClientConnection(ServerThread ct) {
        manyserver.add(ct);

        return manyserver.size();
    }

    /**
     * 从向量中移除关闭的客户端
     *
     * @param ct 要关闭的客户端线程
     * @return 关闭状态
     */
    public boolean closeClientConnection(ServerThread ct) {
        if (manyserver.contains(ct)) {
            manyserver.remove(ct);

            return true;
        }

        return false;
    }

    /**
     * 在向量中按登录用户ID寻找客户端
     */
//    public boolean searchClientConnection(String curUser) {
//        for (ServerThread ct: manyserver) {
//            if (ct.curUser != null && ct.curUser.equals(curUser)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
}
