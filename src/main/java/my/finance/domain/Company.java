package my.finance.domain;

import java.util.List;

/**
 * 회사 정보
 */
public class Company {
    private int uid;                // 기업 ID
    private String name;            // 기업 이름
    private String code;            // 기업 코드
    private String totPrice;        // 기업 시가총액
    private String totStock;        // 기업 총주식수
    private String per;             // 기업 PER
    private String pbr;             // 기업 PBR
    private String otherPer;        // 같은 카테고리 평균 PER
    private String descp;           // 기업 개요

    private List<Person> personList;   // 주주내용
    private Finance finance;           // 재무재표

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTotPrice() {
        return totPrice;
    }

    public void setTotPrice(String totPrice) {
        this.totPrice = totPrice;
    }

    public String getTotStock() {
        return totStock;
    }

    public void setTotStock(String totStock) {
        this.totStock = totStock;
    }

    public String getPer() {
        return per;
    }

    public void setPer(String per) {
        this.per = per;
    }

    public String getPbr() {
        return pbr;
    }

    public void setPbr(String pbr) {
        this.pbr = pbr;
    }

    public String getOtherPer() {
        return otherPer;
    }

    public void setOtherPer(String otherPer) {
        this.otherPer = otherPer;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public Finance getFinance() {
        return finance;
    }

    public void setFinance(Finance finance) {
        this.finance = finance;
    }
}
