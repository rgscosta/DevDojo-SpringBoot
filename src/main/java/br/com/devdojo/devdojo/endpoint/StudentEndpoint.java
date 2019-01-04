package br.com.devdojo.devdojo.endpoint;

import br.com.devdojo.devdojo.date.DateUtil;
import br.com.devdojo.devdojo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("student")
public class StudentEndpoint {
    @Autowired
    private DateUtil dateUtil;

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Student> listAll() {
        System.out.println("----teste-------" + dateUtil.formatLocalDateTimeToDatebaseStyle(LocalDateTime.now()));
        return asList(new Student("Deku"), new Student("Rodrigo"));

    }

}
