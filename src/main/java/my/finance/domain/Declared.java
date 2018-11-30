package my.finance.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * 종목 공시
 */
@Entity
public class Declared {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int uid;        // 종목공시 ID
    @Column
    private String title;   // 종목공시 제목
    @Column
    private String author;  // 종목공시 저자
    @Column
    private Date pubDate;   // 종목공시 일자

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }
}
