package com.aloyolaa.customerappbackend.service;

import com.aloyolaa.customerappbackend.config.security.UserDetailsImpl;
import com.aloyolaa.customerappbackend.entity.User;
import com.aloyolaa.customerappbackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    private final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).orElseThrow(() -> {
            logger.info("User with username " + username + " does no exist");
            throw new UsernameNotFoundException("User with username " + username + " does no exist");
        });
        return new UserDetailsImpl(user);
    }
}
