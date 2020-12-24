package ClientGUI;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Receive implements Runnable {
    // ������
    private ObjectInputStream ois = null;

    public Receive(Socket client) {
        try {
            ois = new ObjectInputStream(client.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ��������
    public String receive() throws ClassNotFoundException {
        String msg = "";
        try {
            msg = (String) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (receive() == "YES") {
                    // ������
                    System.out.println("YES");
                    break;
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                if (receive() == "NO") {
                    // ������
                    System.out.println("NO");
                    break;
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            
        }
        
    }
}

