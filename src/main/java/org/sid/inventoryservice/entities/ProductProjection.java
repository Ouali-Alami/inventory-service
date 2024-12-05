package org.sid.inventoryservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="fullProduct",types = Product.class)
/*TODO: add restcontrolller ou graphql*/
public interface ProductProjection {
    public Long getId();
    public String getName();
    public String getPrice();
    public int getQuantity();
}
