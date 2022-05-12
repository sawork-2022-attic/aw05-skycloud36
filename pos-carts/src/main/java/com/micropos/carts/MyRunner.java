package com.micropos.carts;

import com.micropos.carts.model.Cart;
import com.micropos.carts.repository.CartRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private CartRepository userRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        logger.info("initializing users");

        Cart u1 = new Cart(1, "Tony");
        userRepository.save(u1);

        Cart u2 = new Cart(2,"Aily");
        userRepository.save(u2);

        Cart u3 = new Cart(3,"Bob");
        userRepository.save(u3);
    }
}
