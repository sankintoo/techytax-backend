package org.techytax.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class CostMatch {

    @Id
    @GeneratedValue
    protected Long id = 0L;

    @NotNull
    private String user;
    private String matchString;

    @ManyToOne
    private CostType costType;

    private int costCharacter;

    @Enumerated(EnumType.ORDINAL)
    private VatType vatType;

    private int percentage;
    private int fixedAmount;

}
