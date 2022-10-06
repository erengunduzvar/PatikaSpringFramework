package com.erengunduzvar;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//Data Transfer Object
public class StudentDto {
    private Long studentId;
    private String studentName;
    private String studentSurname;

}
