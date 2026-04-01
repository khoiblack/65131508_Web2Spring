package thiGK.ntu65131508caitrandangkhoi_fitcms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thiGK.ntu65131508caitrandangkhoi_fitcms.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}