import java.net.*;
import java.io.*;

class Jserver {
    ServerSocket ss;
    Socket clientsocket;
    BufferedReader fromclient;
    InputStreamReader isr;
    PrintWriter toclient;

    public Jserver() {
        String str = new String("hello");
        try {
            // Create ServerSocket object.
            ss = new ServerSocket(1244);
            System.out.println("Server Started...");
            while(true) {
                System.out.println("Waiting for the request...");

                // accept the client request.
                clientsocket = ss.accept();

                System.out.println("Got a client");
                System.out.println("Client Address " + clientsocket.getInetAddress().toString());
                isr = new InputStreamReader(clientsocket.getInputStream());
                fromclient = new BufferedReader(isr);
                toclient = new PrintWriter(clientsocket.getOutputStream());

                String strfile;
                String stringdata;
                boolean file_still_present = false;

                strfile = fromclient.readLine();

                System.out.println(strfile);
                //toclient.println("File name received at Server is  " + strfile);

                File samplefile = new File(strfile);
                FileInputStream fileinputstream = new FileInputStream(samplefile);
                // now ready to send data from server ..... 
                int notendcharacter;
                do {
                    notendcharacter = fileinputstream.read();
                    stringdata = String.valueOf(notendcharacter);
                    toclient.println(stringdata);

                    if (notendcharacter != -1) {
                        file_still_present = true;
                    } else {
                        file_still_present = false;
                    }
                } while(file_still_present); 

                fileinputstream.close();    
                System.out.println("File has been send successfully .. message print from server");

                if (str.equals("bye")) {
                  break;
                }

                fromclient.close();
                toclient.close();
                clientsocket.close();
            }
        } catch(Exception ex) {
            System.out.println("Error in the code : " + ex.toString());
        }
    }

    public static void main(String arg[]) {
        Jserver serverobj = new Jserver();
    }
}
