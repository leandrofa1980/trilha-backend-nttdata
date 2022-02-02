package br.com.control.finances.infrastructure.repository;

import br.com.control.finances.domain.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {
    List<Entry> findByPaid(boolean paid);

}
