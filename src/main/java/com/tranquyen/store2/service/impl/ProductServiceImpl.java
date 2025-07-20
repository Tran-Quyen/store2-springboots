package com.tranquyen.store2.service.impl;

import com.tranquyen.store2.dto.request.ProductRequestDTO;
import com.tranquyen.store2.repository.ProductRepository;
import com.tranquyen.store2.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService
{
//  private final ProductRepository productRepository;
  @Override
  public long saveProduct(ProductRequestDTO request)
  {
    return 0;
  }

  @Override
  public void updateProduct(long productId, ProductRequestDTO request)
  {

  }

  @Override
  public void deleteProduct(long productId)
  {

  }
}
