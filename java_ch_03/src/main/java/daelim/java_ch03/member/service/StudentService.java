package daelim.java_ch03.member.service;

import daelim.java_ch03.member.Student;
import daelim.java_ch03.member.dao.StudentDao;
import java.util.Map;

public class StudentService {

    private StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void register(Student student) {
        if(!exist(student.getsNum())) {
            studentDao.insert(student);
        } else {
            System.out.println("The student has already registered.");
        }
    }

    public boolean exist(String sNum) {
        Student student = studentDao.select(sNum);
        return student != null;
    }

    public Student select(String sNum) {
        if(exist(sNum)) {
            return studentDao.select(sNum);
        } else {
            System.out.println("Student information is available");
        }
        return null;
    }

    public Map<String, Student> allSelect() {
        return studentDao.getStudentDB();
    }

    public void modify(Student student) {
        if(exist(student.getsNum())) {
            studentDao.update(student);
        } else {
            System.out.println("Student information is available");
        }
    }

    public void delete(String sNum) {
        if(exist(sNum)) {
            studentDao.delete(sNum);
        } else {
            System.out.println("Student information is available");
        }
    }
}
