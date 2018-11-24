package com.datahack.promos.promosApi.infrastructure.rest.model;

import com.datahack.promos.domain.model.ProductPromo;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class PromoApiRequest {

    private String id;
    private String sellerId;
    private Date timeEnd;
    private Integer quantity;
    private String description;
    private List<ProductPromoApiRequest> productsPromo;
}
