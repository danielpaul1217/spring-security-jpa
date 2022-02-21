package com.springsecurity.springsecurityjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.springsecurity.springsecurityjpa.models.MyUserDetails;
import com.springsecurity.springsecurityjpa.models.User;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user=userRepository.findByUsername(username);
		user.orElseThrow(()->new UsernameNotFoundException("Not found"+username));
		
		return user.map(MyUserDetails::new).get();
	}

}
 