package com.lighthouseshavedice.home.repositories;

import com.lighthouseshavedice.home.models.StoreLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<StoreLocation, Long> {


}
