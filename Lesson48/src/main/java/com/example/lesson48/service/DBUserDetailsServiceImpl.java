package com.example.lesson48.service;

import com.example.lesson48.domain.Person;
import com.example.lesson48.dto.PersonDto;
import com.example.lesson48.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor

@Service
public class DBUserDetailsServiceImpl implements UserDetailsService {
    private final PasswordEncoder passwordEncoder;
    private final PersonRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      return repository.findByLogin(username).orElse(null);
    }

    public void save (PersonDto dto){
        String userName = dto.getUserName();
        String password = dto.getPassword();

        Person person = new Person();
        person.setLogin(userName);
        person.setPassword(passwordEncoder.encode(password));
        person.setPerm("ROLE_USER");

        repository.save(person);
    }
}
