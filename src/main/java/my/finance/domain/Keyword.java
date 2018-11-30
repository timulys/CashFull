package my.finance.domain;

import javax.persistence.*;

@Entity
public class Keyword {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uid;
    @Column(nullable = false)
    private KeyKind kind;
    private String value;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public KeyKind getKind() {
        return kind;
    }

    public void setKind(KeyKind kind) {
        this.kind = kind;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    enum KeyKind {
        P, N;
    }
}
