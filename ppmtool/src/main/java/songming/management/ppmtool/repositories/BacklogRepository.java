package songming.management.ppmtool.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import songming.management.ppmtool.domain.Backlog;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog, Long> {
    Backlog findByProjectIdentifier(String Identifier);

}
