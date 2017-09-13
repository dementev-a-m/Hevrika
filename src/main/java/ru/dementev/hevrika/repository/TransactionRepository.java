package ru.dementev.hevrika.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dementev.hevrika.entity.Transaction;

/**
 * Created by adementev on 13.09.2017.
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
