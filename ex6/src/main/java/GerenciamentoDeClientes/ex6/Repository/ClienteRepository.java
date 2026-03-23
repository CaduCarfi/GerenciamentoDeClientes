package GerenciamentoDeClientes.ex6.Repository;

import GerenciamentoDeClientes.ex6.Model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
