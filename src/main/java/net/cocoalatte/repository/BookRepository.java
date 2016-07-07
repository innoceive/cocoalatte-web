package net.cocoalatte.repository;

import net.cocoalatte.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface BookRepository extends JpaRepository<Book, BigInteger> {
}
