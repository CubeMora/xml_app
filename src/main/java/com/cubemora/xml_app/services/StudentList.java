package com.cubemora.xml_app.services;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

import com.cubemora.xml_app.entity.students;

@XmlRootElement
public class StudentList {
    private List<students> studentList;

    @XmlElement(name = "student")
    public List<students> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<students> studentList) {
        this.studentList = studentList;
    }
}
