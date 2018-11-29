package my.finance.domain;

public class Person {
    private String name;        // 이름
    private String stockCnt;    // 총 보유 주식 수
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
