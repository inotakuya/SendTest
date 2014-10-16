package jp.com.inotaku.repository;
import jp.com.inotaku.domain.Book;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Book.class)
public interface BookRipository {
}
