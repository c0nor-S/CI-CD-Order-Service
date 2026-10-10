package ie.atu.CICDorderservice.service;

import ie.atu.CICDorderservice.client.CatalogClient;
import ie.atu.CICDorderservice.model.PurchaseOrder;
import ie.atu.CICDorderservice.repository.PurchaseOrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PurchaseOrderService {
    private final PurchaseOrderRepository purchaseOrderRepository;
    private final CatalogClient catalogClient;

    public PurchaseOrderService(PurchaseOrderRepository purchaseOrderRepository, CatalogClient catalogClient) {
        this.purchaseOrderRepository = purchaseOrderRepository;
        this.catalogClient = catalogClient;
    }

    public List<PurchaseOrder> getAll() {
        return purchaseOrderRepository.findAll();
    }

    public PurchaseOrder create(PurchaseOrder order) {
        order.setId(null);
        return purchaseOrderRepository.save(order);
    }

    public String testCatalogConnection(Long productID) {
        return catalogClient.getProductById(productID);
    }
}
