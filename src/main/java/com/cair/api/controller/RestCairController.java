package com.cair.api.controller;

import com.cair.api.dto.TeacherDto;
import com.cair.api.entity.Teacher;
import com.cair.api.service.CairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cair")
public class RestCairController {

    private CairService cairService;

    @Autowired
    public RestCairController(CairService cairService) {
        this.cairService = cairService;
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Teacher> createTeacher(@RequestBody TeacherDto teacherDto) {
        Teacher teacher = cairService.createTeacher(teacherDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(teacher);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Teacher> updateTeacher(@RequestBody TeacherDto teacherDto) {
        Teacher teacher =cairService.updateTeacher(teacherDto);
        return ResponseEntity.ok(teacher);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Teacher> getByIdTeacher(@PathVariable("id") Long teacherId) {
        Teacher teacher = cairService.getByIdTeacher(teacherId);
        return ResponseEntity.ok(teacher);
    }
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public void deleteTeacherById(@PathVariable("id") Long teacherId) {
        cairService.deleteTeacherById(teacherId);
    }
}
