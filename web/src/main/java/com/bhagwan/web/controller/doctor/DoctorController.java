package com.bhagwan.web.controller.doctor;

import com.bhagwan.domain.doctor.Doctor;
import com.bhagwan.service.doctor.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    private DoctorServices doctorServices;

    @GetMapping("/doctors")
    public List<Doctor> getDoctors(){
        return doctorServices.getDoctors();
    }
}
