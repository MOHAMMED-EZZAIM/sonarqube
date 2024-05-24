package org.sid.safarent.security.dao;

import org.sid.safarent.security.bean.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleDao extends JpaRepository<AppRole, Long> {
    AppRole findByRoleName(String roleName);
}
