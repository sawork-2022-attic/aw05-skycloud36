package com.micropos.carts.mapper;


import com.micropos.carts.dto.CartDto;
import com.micropos.carts.model.Cart;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper
public interface CartMapper {
    Collection<CartDto> toCartsDto(Collection<Cart> products);

    Collection<Cart> toCarts(Collection<CartDto> products);

    Cart toCart(CartDto productDto);

    CartDto toCartDto(Cart cart);
}
