package com.patika.Credit.dao.credit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CreditRepository extends JpaRepository<Credit, Long> {
    @Query("select c from credit c where c.user.TRIdNumber = ?1 order by c.createdDate desc")
    Optional<Credit> findLastApplicationByTRIdNumber(String id);
}
