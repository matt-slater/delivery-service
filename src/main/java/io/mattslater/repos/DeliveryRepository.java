package io.mattslater.repos;

import io.mattslater.model.Delivery;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dewdmcmann on 6/29/16.
 */
@Repository
public interface DeliveryRepository extends PagingAndSortingRepository<Delivery, Long> {

    List<Delivery> findByDeliveredFalse();
}
