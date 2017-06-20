import java.io.*;

/**
 * Created by kyle on 2017. 6. 19..
 * My Class
 */
public class IOManager {
    private BufferedWriter fw;
    private BufferedReader fr;
    private StringBuilder sb;
    private String filename;

//    IOManager(String filename) {
//        this.filename = filename + ".txt";
//        sb = new StringBuilder();
//    }

    void init(String filename){
        this.filename = filename + ".txt";
        sb = new StringBuilder();
    }

    void openWrite() throws IOException {
        fw = new BufferedWriter(new FileWriter(filename));
    }

    void write(String str) throws IOException {
        fw.write(str);
    }

    void closeWrite() throws IOException {
        fw.close();
    }

    void openRead() throws IOException {
        fr = new BufferedReader(new FileReader(filename));
    }

    String read() throws IOException {
        String temp;
        String i;
        while ((i = fr.readLine()) != null) {
            sb.append(i+"\n");
        }
        temp = sb.toString();
        sb.delete(0, sb.length());
        return temp;
    }

    void closeRead() throws IOException {
        fr.close();
    }
}
