package org.sid.safarent.service.facade.communService;


import org.sid.safarent.bean.communBean.Location;

import java.util.List;

public interface LocationService {
    int save(Location location);
    List<Location> findAll();

    Location findByRef(String ref);

    int deleteByRef(String ref);

    int update(Location voiture);
}
