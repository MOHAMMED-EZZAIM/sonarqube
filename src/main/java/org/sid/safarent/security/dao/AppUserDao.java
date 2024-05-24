package org.sid.safarent.security.dao;

import org.sid.safarent.security.bean.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserDao extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
