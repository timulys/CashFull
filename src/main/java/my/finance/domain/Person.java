package my.finance.domain;

import javax.persistence.*;

/**
 * 주주정보
 */
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uid;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_person_company"))
    private Company company;

    private String name;        // 이름
    private String stockCnt;    // 총 보유 주식 수
    private String stockRate;   // 총 보유 주식 비율

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStockCnt() {
        return stockCnt;
    }

    public void setStockCnt(String stockCnt) {
        this.stockCnt = stockCnt;
    }

    public String getStockRate() {
        return stockRate;
    }

    public void setStockRate(String stockRate) {
        this.stockRate = stockRate;
    }
}
