

/**
 * Created by kyle on 2017. 6. 19..
 */
public class Paser {
    private String address;
    private String filename;

    Paser(String domainName) {
        init(domainName);
    }

    private void init(String domainName) {
        switch (domainName) {
            case "Naver":
                address = "http://news.naver.com/";
                filename = "DB/Naver/Naver";
                break;
            case "Chosun":
                address = "http://www.chosun.com";
                filename = "DB/Chosun/Chosun";
                break;
            case "Donga":
                address = "http://www.donga.com";
                filename = "DB/Donga/Donga";
                break;
            case "Joongang":
                address = "http://joongang.joins.com";
                filename = "DB/Joongang/Joongang";
                break;
            case "Mail":
                address = "http://www.mk.co.kr";
                filename = "DB/Mail/Mail";
                break;
            case "NewYorkTimes":
                address = "https://www.nytimes.com";
                filename = "DB/Newyork/Newyork";
                break;
        }
        Crawler crawler = new Crawler(address, filename);
        crawler.start();
        crawler.extractChosun();
    }
}

