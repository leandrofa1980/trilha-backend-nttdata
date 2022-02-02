package br.com.control.finances.infrastructure.repository;

import br.com.control.finances.domain.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntryRepository extends JpaRepository<Entry, Long> {
    List<Entry> findByPaid(boolean paid);

}