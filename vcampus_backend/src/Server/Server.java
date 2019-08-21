package Server;
import java.net.ServerSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Server {
    public static void main(String[] args) {
        ServerSocket server=null;
        try {
            server=new ServerSocket(10001);

        }catch (IOException e){

        }
    }
}
