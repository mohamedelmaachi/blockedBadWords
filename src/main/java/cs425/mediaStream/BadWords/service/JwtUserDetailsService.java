package cs425.mediaStream.BadWords.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import cs425.mediaStream.BadWords.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cs425.mediaStream.BadWords.domain.Role;
import cs425.mediaStream.BadWords.domain.User;
import cs425.mediaStream.BadWords.repository.DirtyWordRepository;
import cs425.mediaStream.BadWords.util.JwtUserDetails;

@Service
@Transactional
public class JwtUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email);
		List<SimpleGrantedAuthority> authorities = new ArrayList();
		for (Role role : user.getRoles()) {
			 authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
		}
		return new JwtUserDetails(user.getId(),user.getEmail(), user.getPassword(), authorities);
	}
}
