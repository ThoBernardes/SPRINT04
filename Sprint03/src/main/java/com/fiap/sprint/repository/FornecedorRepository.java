package com.fiap.sprint.repository;

import com.fiap.sprint.model.Fornecedor;
import com.fiap.sprint.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}

