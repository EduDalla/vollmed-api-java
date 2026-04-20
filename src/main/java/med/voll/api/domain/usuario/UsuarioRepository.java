package med.voll.api.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;


public class UsuarioRepository extends JpaRepository<Usuario, Long> {


    UserDetails findAllByLogin(String username);
}
