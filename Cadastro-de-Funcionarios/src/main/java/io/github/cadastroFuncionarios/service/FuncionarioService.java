package io.github.cadastroFuncionarios.service;

import io.github.cadastroFuncionarios.model.Funcionario;
import io.github.cadastroFuncionarios.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> listarTodos() {
        return repository.findAll();
    }

    public Funcionario salvar(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    public Optional<Funcionario> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Funcionario atualizar(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
