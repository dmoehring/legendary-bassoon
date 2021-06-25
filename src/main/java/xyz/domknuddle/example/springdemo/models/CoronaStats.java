package xyz.domknuddle.example.springdemo.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "CoronaStats")
@IdClass(CoronaStatsPk.class)
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CoronaStats implements Serializable{

    @Id
    private String ort;
    @Id
    private Date datum;
    private Integer infizierte;
    private Integer genesen;
    private Integer aktiv;
    private Integer tode;
    private Integer todeAlternativ;
    private Double inzidenzzahl;


}

