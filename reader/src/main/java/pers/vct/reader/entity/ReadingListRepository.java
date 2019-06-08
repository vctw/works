package pers.vct.reader.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingListRepository extends JpaRepository<Book, Long>{
	List<Book> findByreader(String reader);

}
