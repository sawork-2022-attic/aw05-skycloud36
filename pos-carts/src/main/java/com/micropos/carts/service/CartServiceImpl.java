package com.micropos.carts.service;

import com.micropos.carts.model.Cart;
import com.micropos.carts.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    public CartServiceImpl(@Autowired CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public List<Cart> carts() {
        Iterable<Cart> it = cartRepository.findAll();

        List<Cart> carts = new ArrayList<Cart>();
        it.forEach(e -> carts.add(e));

        return carts;
    }

    @Override
    public Cart getCart(int id) {
        return cartRepository.findById(id).get();
    }

}
