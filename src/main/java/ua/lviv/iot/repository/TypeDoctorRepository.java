package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.TypeDoctor;
@Repository
public interface TypeDoctorRepository extends JpaRepository<TypeDoctor,Integer> {

}
