package my.finance.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * 신문사 기사
 */
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uid;            // 신문사 기사 ID
    @Column(nullable = false)
    private String title;       // 신문사 기사 제목
    private String summary;     // 신문사 기사 요약
    private String author;      // 신문사
    private String href;        // 신문사 기사 링크
    private Date pubDate;       // 신문시 기사 일자

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }
}
