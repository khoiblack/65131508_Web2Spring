package thiGK.ntu65131508caitrandangkhoi_fitcms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import thiGK.ntu65131508caitrandangkhoi_fitcms.models.Student;
import thiGK.ntu65131508caitrandangkhoi_fitcms.repositories.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    // 1. Hiện danh sách
    @GetMapping("/student/all")
    public String listStudents(Model model) {
        model.addAttribute("dsStudent", studentRepository.findAll());
        return "student-list"; 
    }

    // 2. Mở form thêm mới
    @GetMapping("/student/new")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-addnew"; 
    }

    // 3. Lưu vào database
    @PostMapping("/student/save")
    public String saveStudent(Student student) {
        studentRepository.save(student);
        return "redirect:/student/all";
    }

    // 4. Xem chi tiết
    @GetMapping("/student/view/{id}")
    public String viewStudent(@PathVariable("id") String id, Model model) {
        Student foundStudent = studentRepository.findById(id).orElse(null);
        model.addAttribute("student", foundStudent);
        return "student-view"; 
    }

    // 5. Xóa
    @GetMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable("id") String id) {
        studentRepository.deleteById(id);
        return "redirect:/student/all";
    }
}