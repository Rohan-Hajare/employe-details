package com.empDetails.Repository;

import com.empDetails.Entity.empDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface empRepository extends JpaRepository<empDetails,Long> {
}
