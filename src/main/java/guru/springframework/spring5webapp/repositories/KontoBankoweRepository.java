package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.KontoBankowe;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KontoBankoweRepository extends PagingAndSortingRepository<KontoBankowe,Long>
{

}
