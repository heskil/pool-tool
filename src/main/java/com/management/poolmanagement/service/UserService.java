package com.management.poolmanagement.service;

import com.management.poolmanagement.model.User;
import com.management.poolmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveAndPrintUser() {
        User newUser1 = new User("danielAdmin@gmx.net", "dan", "1234");
        User newUser2 = new User("karenFearful@gmx.net", "kar", "5678");

        userRepository.save(newUser1);
        userRepository.save(newUser2);

        // List all customers
        Iterable<User> iterator = userRepository.findAll();
        iterator.forEach(System.out::println);

        // Count number of customer
        long count = userRepository.count();
        System.out.println("Number of customers: " + count);
    }
}

