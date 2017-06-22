import java.net.*;
import java.io.*;

class Jclient {
    Socket soc;
    BufferedReader fromkeyboard, fromserver;
    PrintWriter toserver;
    InputStreamReader isr;

    public Jclient() {
        String str;
        try {
            // server is listening on this port.
            soc = new Socket("localhost", 1244);

            fromkeyboard = new BufferedReader(new InputStreamReader(System.in));
            fromserver = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            System.out.println("PLEASE ENTER THE MESSAGE TO BE SENT TO THE SERVER");
            str = fromkeyboard.readLine();
            System.out.println(str);
            String ddd;
            ddd = str;
            toserver = new PrintWriter(soc.getOutputStream());

            String strfile;
            int notendcharacter;
            boolean file_validity = false;
            System.out.println("send to server" + str);

            System.out.println("Enter the filename to be received from server");
            strfile = fromkeyboard.readLine();
            toserver.println(strfile);

            File samplefile = new File(strfile);
            //File OutputStream helps to get write the data from the file ....
            FileOutputStream fileOutputStream = new FileOutputStream(samplefile);

            // now ready to get the data from server .... 
            do {
                str = fromserver.readLine();
                notendcharacter = Integer.parseInt(str);

                if (notendcharacter != -1) {
                    file_validity = true;
                } else {
                    System.out.println("Read and Stored all the Data Bytes from the file ..." +
                        "Received File Successfully");
                }
                if (file_validity) {
                    fileOutputStream.write(notendcharacter);
                }
            } while(file_validity);

            fileOutputStream.close();

            toserver.close();
            fromserver.close();
            soc.close();
        } catch(Exception ex) {
            System.out.println("Error in the code : " + ex.toString());
        }
    }

    public static void main(String str[]) {
        Jclient clientobj = new Jclient();
    }
}
