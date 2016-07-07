package net.cocoalatte.repository;

import net.cocoalatte.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface PublisherRepository extends JpaRepository<Publisher, BigInteger> {
}
