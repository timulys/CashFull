package my.finance.service;

import my.finance.dao.ArticleRepository;
import my.finance.utils.TimeUtils;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleCrollingService implements CrollingService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Document getDocument(String url) {
        System.out.println("Article Crolling Start : " + TimeUtils.getCurrentDate());



        System.out.println("Article Crolling End : " + TimeUtils.getCurrentDate());
        return null;
    }
}
