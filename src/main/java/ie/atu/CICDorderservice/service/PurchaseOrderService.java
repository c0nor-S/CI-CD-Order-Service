package ie.atu.CICDorderservice.service;

import ie.atu.CICDorderservice.model.PurchaseOrder;
import ie.atu.CICDorderservice.repository.PurchaseOrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PurchaseOrderService {
    private final PurchaseOrderRepository purchaseOrderRepository;

    public PurchaseOrderService(PurchaseOrderRepository purchaseOrderRepository) {
        this.purchaseOrderRepository = purchaseOrderRepository;
    }

    public List<PurchaseOrder> getAll() {
        return purchaseOrderRepository.findAll();
    }

    public PurchaseOrder create(PurchaseOrder order) {
        order.setId(null);
        return purchaseOrderRepository.save(order);
    }
}
