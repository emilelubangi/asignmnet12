package com.cput.lakey.repositories.members;

import com.cput.lakey.domain.members.Gold;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoldRepository extends JpaRepository<Gold, Integer> {
}
