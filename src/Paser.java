

/**
 * Created by kyle on 2017. 6. 19..
 */
public class Paser {
    private String address;
    private String filename;
    Paser(String domainName){
        init(domainName);
    }

    private void init(String domainName) {

        Crawler crawler = new Crawler(address,filename);
        crawler.start();
    }
}

