package net.cocoalatte.repository;

import net.cocoalatte.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface AuthorRepository extends JpaRepository<Author, BigInteger> {
}
