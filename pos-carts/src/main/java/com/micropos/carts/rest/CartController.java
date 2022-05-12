package com.micropos.carts.rest;

import com.micropos.carts.api.CartsApi;
import com.micropos.carts.dto.CartDto;
import com.micropos.carts.mapper.CartMapper;
import com.micropos.carts.service.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class CartController implements CartsApi {
    private final CartMapper cartMapper;

    private final CartService cartService;

    public CartController(CartMapper cartMapper, CartService cartService) {
        this.cartMapper = cartMapper;
        this.cartService = cartService;
    }

//    @Override
//    public ResponseEntity<CartDto> showCartById(){
//        List<CartDto> cartDtos = new ArrayList<>(cartMapper.toMapDto(this.cartMapper.products()));
//        if (cartDtos.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(products, HttpStatus.OK);
//    }

    @Override
    public ResponseEntity<List<CartDto>> listCarts(){
        List<CartDto> products = new ArrayList<>(cartMapper.toCartsDto(this.cartService.carts()));
        if (products.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
