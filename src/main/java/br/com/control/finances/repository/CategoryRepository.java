package br.com.control.finances.repository;

import br.com.control.finances.entities.Category;
import br.com.control.finances.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
