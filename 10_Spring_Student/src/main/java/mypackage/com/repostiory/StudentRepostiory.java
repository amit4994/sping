package mypackage.com.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mypackage.com.model.Student;

@Repository
public interface StudentRepostiory extends JpaRepository<Student, Long> {

}
