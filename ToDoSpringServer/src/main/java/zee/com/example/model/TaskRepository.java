package zee.com.example.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zulup on 1/19/2018.
 */
@Repository
public interface TaskRepository extends JpaRepository<Tasks,Integer>
{
     Tasks findByUid(int uid);
}
