package com.bhagwan.dao.doctor;

import com.bhagwan.domain.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
