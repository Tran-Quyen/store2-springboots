package com.tranquyen.store2.service;

import com.tranquyen.store2.dto.request.ProductRequestDTO;

public interface ProductService
{
   long saveProduct(ProductRequestDTO request);

   void updateProduct(long productId, ProductRequestDTO request);

   void deleteProduct(long productId);

}
