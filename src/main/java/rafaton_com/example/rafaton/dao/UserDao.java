package rafaton_com.example.rafaton.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import rafaton_com.example.rafaton.domain.User;

import java.util.List;

public interface UserDao extends PagingAndSortingRepository<User, Long>{

    List<User> findById(@Param("id") Long id);
    List<User> findByPasswordAndEmail(@Param("password") String password, @Param("email") String email);

}
