package my.finance.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 재무재포
 */
@Entity
public class Finance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uid;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_finance_company"))
    private Company company;

    @OneToMany(mappedBy = "finance")
    private List<Results> annualResultsList;        // 연간 실적

    @OneToMany(mappedBy = "finance")
    private List<Results> quarterResultsList;       // 분기별 실적

    public Finance() {
        this.annualResultsList = new ArrayList<>();
        this.quarterResultsList = new ArrayList<>();
    }

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

    public List<Results> getAnnualResultsList() {
        return annualResultsList;
    }

    public void setAnnualResultsList(List<Results> annualResultsList) {
        this.annualResultsList = annualResultsList;
    }

    public List<Results> getQuarterResultsList() {
        return quarterResultsList;
    }

    public void setQuarterResultsList(List<Results> quarterResultsList) {
        this.quarterResultsList = quarterResultsList;
    }

}
