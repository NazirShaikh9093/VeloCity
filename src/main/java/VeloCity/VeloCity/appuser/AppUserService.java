package VeloCity.VeloCity.appuser;

import VeloCity.VeloCity.Registration.token.ConfirmationToken;
import VeloCity.VeloCity.Registration.token.ConfirmationTokenService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
@Repository
@NoRepositoryBean

public class AppUserService implements UserDetailsService {

    private final static String USER_NOT_FOUND_MSG =
            "User with email %s not found";

    private final RenterRepository renterRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final ConfirmationTokenService confirmationTokenService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return renterRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
    }

    public String signUpUser(AppUser appUser) {
        boolean userExists = renterRepository
                .findByEmail(appUser.getEmail())
                .isPresent();
        if (userExists){
            throw new IllegalStateException("email is already used");
        }

        String encodedPassword = bCryptPasswordEncoder.encode(appUser.getPassword());

        appUser.setPassword(encodedPassword);

        renterRepository.save(appUser);

        String token = UUID.randomUUID().toString();

        ConfirmationToken confirmationToken = new ConfirmationToken(
                token,
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(15),
                appUser

        );
        confirmationTokenService.saveConfirmationToken(
                confirmationToken);

        return token;
    }

    public void enableAppUser(String email) {
        renterRepository.enableAppUser(email);
    }
    }
