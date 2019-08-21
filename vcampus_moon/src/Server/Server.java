package Server;
import java.io.IOException;
import java.io.Serializable;
import java.net.BindException;
import java.net.ServerSocket;


public class Server {
    private ServerSocket serverSocket;
    private ServerThread serverThread;
    private boolean isStart = false;


    public static void main(String[] args) {
        try {
            new Server().startServer(30, 10001);
        } catch (BindException e) {
            e.printStackTrace();
        }
    }

    public boolean IsStarted() {
        return isStart;
    }

    public ServerSocket getServerSocket(){
        return this.serverSocket;
    }

    public void startServer(int max, int port) throws java.net.BindException {
        try {
            serverSocket = new ServerSocket(port);
            serverThread = new ServerThread(this, max);
            serverThread.start();
            isStart = true;
        } catch (BindException e) {
            isStart = false;
            throw new BindException("端口号已被占用，请换一个！");
        } catch (Exception e1) {
            e1.printStackTrace();
            isStart = false;
            throw new BindException("启动服务器异常！");
        }
    }
}
