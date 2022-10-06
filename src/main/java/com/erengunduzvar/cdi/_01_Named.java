package com.erengunduzvar.cdi;

import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//Cdi ==> Bean yapısı

@Named
@ApplicationScoped
public class _01_Named {

    private Long namedId;
    private String namedData = "Merhaba Named !";

}
