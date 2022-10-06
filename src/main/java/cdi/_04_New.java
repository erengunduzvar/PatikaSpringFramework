package cdi;

import com.erengunduzvar.StudentDto;
import jdk.jfr.Name;
import lombok.Getter;
import lombok.Value;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtuto")
@ApplicationScoped

public class _04_New  {

    //üretilen
    @Produces
    public String uretilenData(@New StudentDto studentDto)
    {
        studentDto = StudentDto.builder().studentId(0L).studentName("student Adi")
                .build();

        return studentDto.getStudentName();
    }
    @Getter
    @Inject
    private String tuketilenData;

}
