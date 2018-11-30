package my.finance.service;

import my.finance.dao.ArticleRepository;
import my.finance.domain.Article;
import my.finance.domain.PaperMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleCrollingService extends CrollingService {
    @Autowired
    private PaperMap paperMap;
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getArticleList(String newspaperCode) {
        List<Article> articles = new ArrayList<>();
        /*getDocument(url);*/

        return articles;
    }

}