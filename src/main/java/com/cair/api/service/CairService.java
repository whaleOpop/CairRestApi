package com.cair.api.service;

import com.cair.api.dto.TeacherDto;
import com.cair.api.entity.Teacher;
import jakarta.validation.Valid;


public interface CairService {
    Teacher createTeacher( TeacherDto teacherDto);

    Teacher updateTeacher(TeacherDto teacherDto);

    Teacher getByIdTeacher(Long teacherId);

    void deleteTeacherById(Long teacherId);

    Teacher getByLoginTeacher(String teacherLogin);
}
