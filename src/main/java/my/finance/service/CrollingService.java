package my.finance.service;

import my.finance.utils.TimeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class CrollingService {
    public Document getDocument(String url) throws IOException {
        System.out.println("Article Crolling Start : " + TimeUtils.getCurrentDate());
        Document doc = Jsoup.connect(url).get();
        System.out.println("Article Crolling End : " + TimeUtils.getCurrentDate());
        return doc;
    }
}
