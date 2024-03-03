package SocialMedia.service;

import SocialMedia.entity.User;
import SocialMedia.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
   private UserRepository userRepository;

   public UserService(UserRepository userRepository) {
       this.userRepository = userRepository;
   }
   public List<User> getAllUsers() {
       return userRepository.findAll();
   }
   public User getUser(Long id) {return userRepository.getUserId(id);}
   public User createUser(User user) {
       return userRepository.save(user);
   }
   public void deleteUser(Long id) {
       userRepository.deleteById(id);
   }
}
