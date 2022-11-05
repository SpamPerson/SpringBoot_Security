package com.study.security1.repository;

import com.study.security1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//  CRUD 함수를 JpaRepository가 들고 있음
// @Repository 어노테이션이 없어도 됨. 이유는 JpaRepository 를 상속 했기 때문에
public interface UserRepository extends JpaRepository<User, Integer> {

    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
    // 4.2. Query Methods
    // select * from user where username = ?(String username);
    public User findByUsername(String username); // Jpa Query Methods
}
