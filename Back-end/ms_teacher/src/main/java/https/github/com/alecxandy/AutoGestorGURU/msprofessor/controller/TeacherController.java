package https.github.com.alecxandy.AutoGestorGURU.msprofessor.controller;

import https.github.com.alecxandy.AutoGestorGURU.msprofessor.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

}
