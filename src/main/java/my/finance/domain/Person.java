package my.finance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 주주정보
 */
@Entity
public class Person {
    @Column
    private String name;        // 이름
    @Column
    private String stockCnt;    // 총 보유 주식 수
    @Column
    private String stockRate;   // 총 보유 주식 비율

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
