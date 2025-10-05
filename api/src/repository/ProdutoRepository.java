package atividadeds.api.repository;

import com.exemplo.minhaapp.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
