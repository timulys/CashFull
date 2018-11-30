package my.finance.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * 재무재포
 */
@Entity
public class Finance {
    @OneToMany
    private List<Results> annualResultsList;        // 연간 실적
    @OneToMany
    private List<Results> quarterResultsList;       // 분기별 실적

    public Finance() {
        this.annualResultsList = new ArrayList<>();
        this.quarterResultsList = new ArrayList<>();
    }

    public List<Results> getAnnualResultsList() {
        return annualResultsList;
    }

    public void addAnnualResultsList(Results results) {
        this.annualResultsList.add(results);
    }

    public List<Results> getQuarterResultsList() {
        return quarterResultsList;
    }

    public void addQuarterResultsList(Results results) {
        this.quarterResultsList.add(results);
    }
}
