package io.github.cadastroFuncionarios.repository;

import io.github.cadastroFuncionarios.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
