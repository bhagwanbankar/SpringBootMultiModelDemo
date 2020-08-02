package com.bhagwan.service.doctor;

import com.bhagwan.dao.doctor.DoctorRepository;
import com.bhagwan.domain.doctor.Doctor;
import org.apache.tomcat.util.http.fileupload.util.Streams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorServices {
    @Autowired
    private DoctorRepository doctorRepository;

    @PostConstruct
    public void initDoctor(){

        List<Doctor> doctors = doctorRepository.saveAll(Stream.of(new Doctor(101, "John", "Artho"),
                new Doctor(102, "Joe2", "Cardio"))
                .collect(Collectors.toList()));

    }

    public List<Doctor> getDoctors(){
        return  doctorRepository.findAll();
    }
}
