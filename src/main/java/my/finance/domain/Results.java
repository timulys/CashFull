package my.finance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 실적 내용
 */
@Entity
public class Results {
    @Column
    private String name;            // 실적 이름(ex : 2018/12)
    @Column
    private String sales;           // 매출액
    @Column
    private String profit;          // 영업이익
    @Column
    private String netIncome;       // 당기순이익
    @Column
    private String debtRatio;       // 부채비율
    @Column
    private String quickRatio;      // 당좌비율
    @Column
    private String reserveRatio;    // 유보율
    @Column
    private String dividend;        // 배당금
    @Column
    private String marketdiv;       // 시가 배당률
    @Column
    private String divTendency;     // 배당성향
    @Column
    private String inventory;       // 재고자산
    @Column
    private String receivableAcc;   // 매출채권

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(String netIncome) {
        this.netIncome = netIncome;
    }

    public String getDebtRatio() {
        return debtRatio;
    }

    public void setDebtRatio(String debtRatio) {
        this.debtRatio = debtRatio;
    }

    public String getQuickRatio() {
        return quickRatio;
    }

    public void setQuickRatio(String quickRatio) {
        this.quickRatio = quickRatio;
    }

    public String getReserveRatio() {
        return reserveRatio;
    }

    public void setReserveRatio(String reserveRatio) {
        this.reserveRatio = reserveRatio;
    }

    public String getDividend() {
        return dividend;
    }

    public void setDividend(String dividend) {
        this.dividend = dividend;
    }

    public String getMarketdiv() {
        return marketdiv;
    }

    public void setMarketdiv(String marketdiv) {
        this.marketdiv = marketdiv;
    }

    public String getDivTendency() {
        return divTendency;
    }

    public void setDivTendency(String divTendency) {
        this.divTendency = divTendency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getReceivableAcc() {
        return receivableAcc;
    }

    public void setReceivableAcc(String receivableAcc) {
        this.receivableAcc = receivableAcc;
    }
}
