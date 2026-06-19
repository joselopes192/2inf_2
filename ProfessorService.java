package com.sistema.ocorrencias.service;

import com.sistema.ocorrencias.model.Professor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {


    private final List<Professor> professores = new ArrayList<>();
    private Long idContador = 1L;


    public Professor salvar(Professor professor) {
        if (professor.getId() == null) {
            professor.setId(idContador++);
        } else {
            // Se já tiver ID, remove o antigo para atualizar
            eliminar(professor.getId());
        }
        professores.add(professor);
        return professor;
    }


    public List<Professor> listarTodos() {
        return professores;
    }


    public Optional<Professor> buscarPorId(Long id) {
        return professores.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }


    public void eliminar(Long id) {
        professores.removeIf(p -> p.getId().equals(id));
    }
}