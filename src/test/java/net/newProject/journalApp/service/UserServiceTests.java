package net.newProject.journalApp.service;

import net.newProject.journalApp.entity.User;
import net.newProject.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Disabled
    @Test
    public void testFindByUserName(){
        assertNull(userRepository.findByUserName("ram"));
//        assertTrue(5 > 3);
    }

    @Disabled
    @Test
    public void testIfUserJournalEntry(){
        User user = userRepository.findByUserName("ram");
        assertTrue(!user.getJournalEntries().isEmpty());
    }


 @ParameterizedTest
 @ArgumentsSource(UserArgumentsProvider.class)
 public void testSaveNewUser(User user){
        assertTrue(userService.saveNewUser(user));
 }


    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "3,3,6",
            "4,2,8"
    })
    public void test(int a , int b, int expected){
        assertEquals(expected, a+b, "failed for "+ a + " , "+b);
    }



}
