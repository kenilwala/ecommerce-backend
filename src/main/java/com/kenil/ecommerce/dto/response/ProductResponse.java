package com.kenil.ecommerce.dto.response;

import java.math.BigDecimal;

public record ProductResponse(

        Long id,
        String name,
        String description,
        BigDecimal price,
        Integer stock,
        String imageUrl,
        Boolean active
) {
}