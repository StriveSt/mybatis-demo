package mapper;

import entity.Student;

import java.util.List;

public interface StudentMapper {
    // 查询学生
    List<Student> getStudent();
}
