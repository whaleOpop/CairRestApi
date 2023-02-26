package com.cair.api.service.impl;

import com.cair.api.dto.TeacherDto;
import com.cair.api.entity.Teacher;
import com.cair.api.repository.TeacherRepository;
import com.cair.api.service.CairService;
import org.springframework.stereotype.Service;

@Service
public class CairServiceImpl implements CairService {
    private TeacherRepository teacherRepository;

    public CairServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher createTeacher(TeacherDto teacherDto) {
        Teacher teacher = mapTeacher(teacherDto);
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher updateTeacher(TeacherDto teacherDto) {
        Teacher teacher = mapTeacher(teacherDto);
        teacher.setId(teacherDto.getId());
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher getByIdTeacher(Long teacherId) {
        return teacherRepository.findById(teacherId).get();
    }

    @Override
    public void deleteTeacherById(Long teacherId) {
        teacherRepository.deleteById(teacherId);
    }

    private Teacher mapTeacher(TeacherDto dto) {
        Teacher teacher = new Teacher();
        teacher.setFio(dto.getFio());
        teacher.setEmail(dto.getEmail());
        teacher.setLogin(dto.getLogin());
        teacher.setPassword(dto.getPassword());
        teacher.setGithub(dto.getGithub());
        teacher.setPhoto(dto.getPhoto());

        return teacher;
    }
}
