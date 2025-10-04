package com.firaol.interactive_cashregister.backend.security;

import com.firaol.interactive_cashregister.backend.models.User;
import com.firaol.interactive_cashregister.backend.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService  {

    private final UserRepository userRepository;

    public CustomUserDetailsService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username).
                orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getUserName())
                .password(user.getPassword()) // hashed password
                .roles(user.getRole().toString()) // ADMIN or CASHIER
                .build();
    }
}
