package my.finance.service;

import org.jsoup.nodes.Document;

public interface CrollingService {
    Document getDocument(String url);
}
