package my.finance.domain;

/**
 * 국내외 시장시주
 */
public class Market {
    private String kospi;           // 코스피지수
    private String kosdaq;          // 코스닥지수
    private String dow;             // 다우지수
    private String nasdaq;          // 나스닥지수
    private String standardPoor;    // S&P500지수
    private String nikkei;          // 니케이지수
    private String shanghai;        // 상해종합지수
    private String hangseng;        // 항셍지수
    private String english;         // 영국
    private String france;          // 프랑스
    private String germany;         // 독일

    public String getKospi() {
        return kospi;
    }

    public void setKospi(String kospi) {
        this.kospi = kospi;
    }

    public String getKosdaq() {
        return kosdaq;
    }

    public void setKosdaq(String kosdaq) {
        this.kosdaq = kosdaq;
    }

    public String getDow() {
        return dow;
    }

    public void setDow(String dow) {
        this.dow = dow;
    }

    public String getNasdaq() {
        return nasdaq;
    }

    public void setNasdaq(String nasdaq) {
        this.nasdaq = nasdaq;
    }

    public String getStandardPoor() {
        return standardPoor;
    }

    public void setStandardPoor(String standardPoor) {
        this.standardPoor = standardPoor;
    }

    public String getNikkei() {
        return nikkei;
    }

    public void setNikkei(String nikkei) {
        this.nikkei = nikkei;
    }

    public String getShanghai() {
        return shanghai;
    }

    public void setShanghai(String shanghai) {
        this.shanghai = shanghai;
    }

    public String getHangseng() {
        return hangseng;
    }

    public void setHangseng(String hangseng) {
        this.hangseng = hangseng;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getFrance() {
        return france;
    }

    public void setFrance(String france) {
        this.france = france;
    }

    public String getGermany() {
        return germany;
    }

    public void setGermany(String germany) {
        this.germany = germany;
    }
}
