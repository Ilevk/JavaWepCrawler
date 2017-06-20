import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by kyle on 2017. 6. 19..
 * OpenSource Class http://blog.naver.com/ndb796/220990407718
 */
public class Crawler {
    private static String Address;
    private static URL Url;
    private static BufferedReader br;
    private static HttpURLConnection con;
    private static String protocol = "GET";
    private static IOManager io;

    Crawler(String Address, String filename) {
        this.Address = Address;
        io = new IOManager(filename);
        try {
            init(Address);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void init(String Address) throws IOException {
        try {
            Url = new URL(Address);
            con = (HttpURLConnection) Url.openConnection();
            con.setRequestMethod(protocol);
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            br = new BufferedReader(new InputStreamReader(con.getInputStream(), "Euc-kr"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            String temp;
            String input = "";
            io.openWrite();
            while ((temp = br.readLine()) != null) {
                io.write(temp);
                System.out.println(temp);
            }
            io.closeWrite();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void extractChosun(){
        StringBuilder sb = new StringBuilder();
        String article;
        
    }
}
