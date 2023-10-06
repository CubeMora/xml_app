package com.cubemora.xml_app.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.cubemora.xml_app.studentRepository;
import com.cubemora.xml_app.entity.students;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.List;

@Service
public class XmlService {
    private final studentRepository repository;

    public XmlService(studentRepository repository) {
        this.repository = repository;
    }

    public void exportDataToXml() {

        List<students> data = repository.findAll();

        System.out.println("Registros: " + data);

        try {
            
            StudentList studentList = new StudentList();
            studentList.setStudentList(data);

            JAXBContext context = JAXBContext.newInstance(StudentList.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            File file = new File("data.xml"); 
            marshaller.marshal(studentList, file);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Scheduled(fixedRate = 30000)
    public void scheduledExport() {
        exportDataToXml();
    }
}
