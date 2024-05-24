package org.sid.safarent.dao.communDao;


import org.sid.safarent.bean.communBean.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationDao extends JpaRepository<Location,Long > {
    Location findByRef(String ref);
    Location findByIdLocation(Long id);

    int deleteByRef(String ref);
}
