package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.UserForm;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface UserFormRepository extends JpaRepository<UserForm, Long> {

}
