package my.finance.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.finance.dao.ArticleRepository;
import my.finance.domain.Article;
import my.finance.domain.PaperMap;

@Service
public class ArticleCrollingService extends CrollingService {
    @Autowired
    private PaperMap paperMap;
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getArticleList() {
        List<Article> articles = new ArrayList<>();

        Map<String, String> map = paperMap.getUrlMap();
        map.values().parallelStream().forEach(url -> {
        	try {
				Document document = getDocument(url);
				crollingArticle(document);
			} catch (IOException e) {
				e.printStackTrace();
			}
        });
        
        return articles;
    }
    
    private List<Article> crollingArticle(Document doc) {
    	
    	
    	return null;
    }
    
    public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://news.mt.co.kr/newsflash/newsflash.html?sec=invest&pDepth=&page=1&listType=left").get();
		System.out.println(doc);
	}
    

}