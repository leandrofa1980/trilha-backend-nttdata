package br.com.control.finances.infrastructure.repository;

import br.com.control.finances.domain.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {
    List<Entry> findByPaid(boolean paid);
<<<<<<< HEAD
=======
    List<Entry> findByPaidOrAmountOrDate(boolean paid, BigDecimal amount, String date);
>>>>>>> d935c29d3e1e8631ca6b5646e73ea057524dc1b3
}
