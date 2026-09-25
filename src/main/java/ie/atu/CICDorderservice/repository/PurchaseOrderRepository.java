package ie.atu.CICDorderservice.repository;

import ie.atu.CICDorderservice.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder,Long> {
}
