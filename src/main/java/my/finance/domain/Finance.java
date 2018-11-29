package my.finance.domain;

import java.util.ArrayList;
import java.util.List;

public class Finance {
    private List<Results> annualResultsList;
    private List<Results> quarterResultsList;

    public Finance() {
        this.annualResultsList = new ArrayList<>();
        this.quarterResultsList = new ArrayList<>();
    }
}
