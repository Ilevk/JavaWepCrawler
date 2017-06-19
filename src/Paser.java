

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
                address = "https://www.naver.com";
                filename = "Naver";
            case "Chosun":
                address = "http://www.chosun.com";
                filename = "Chosun";
            case "Donga":
                address = "http://www.donga.com";
                filename = "Donga";
            case "Joongang":
                address = "http://joongang.joins.com";
                filename = "Joongang";
            case "Mail":
                address = "http://www.mk.co.kr";
                filename = "Mail";
            case "NewYorkTimes":
                address = "https://www.nytimes.com";
                filename = "Newyork";
        }
        Crawler crawler = new Crawler(address, filename);
        crawler.start();
    }
}

