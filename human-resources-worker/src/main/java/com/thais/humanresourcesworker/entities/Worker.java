package com.thais.humanresourcesworker.entities;

import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Worker implements Serializable {

    private Long id;
    private String name;
    private Double dailyIncome;

}
