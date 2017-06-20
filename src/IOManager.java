import java.io.*;

/**
 * Created by kyle on 2017. 6. 19..
 * My Class
 */
public class IOManager {
    private OutputStream fw;
    private InputStream fr;
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
        fw = new FileOutputStream(filename);
    }

    void write(String str) throws IOException {
        fw.write(str.getBytes());
    }

    void closeWrite() throws IOException {
        fw.close();
    }

    void openRead() throws IOException {
        fr = new FileInputStream(filename);
    }

    String read() throws IOException {
        String temp;
        int i;
        while ((i = fr.read()) != -1) {
            sb.append((char) i);
        }
        temp = sb.toString();
        sb.delete(0, sb.length());
        return temp;
    }

    void closeRead() throws IOException {
        fr.close();
    }
}
