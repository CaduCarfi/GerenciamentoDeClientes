package GerenciamentoDeClientes.ex6.Service;

import GerenciamentoDeClientes.ex6.Model.ClienteModel;
import GerenciamentoDeClientes.ex6.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> findAll() {
        return  clienteRepository.findAll();
    }

    public Optional<ClienteModel> findById(Long id) {
        return clienteRepository.findById(id);
    }

    public ClienteModel salvar(ClienteModel clienteModel) {
        return clienteRepository.save(clienteModel);
    }

    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}
