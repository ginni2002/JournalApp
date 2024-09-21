package net.newProject.journalApp.service;


import net.newProject.journalApp.entity.User;
import net.newProject.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;

import static org.mockito.Mockito.when;


public class UserDetailsServiceImplTest {

    @InjectMocks
    private UserDetailsServiceImple userDetailsServiceImple;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Disabled
    @Test
    void loadUserByUsernameTest(){
        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("Ram").password("inririri").roles(new ArrayList<>()).build());
        UserDetails user  = userDetailsServiceImple.loadUserByUsername("ram");
        Assertions.assertNotNull(user);
    }

}
