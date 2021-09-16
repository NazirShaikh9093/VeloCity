package VeloCity.VeloCity.appuser;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface RenterRepository {
    Optional<AppUser> findByEmail(String email);

}
