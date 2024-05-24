package org.sid.safarent.service.facade.voitureService;


import org.sid.safarent.bean.voitureBean.AgenceLocation;

import java.util.List;

public interface AgenceLocationService {


    int save(AgenceLocation agenceLocation);

    AgenceLocation findByiceAgLoc(Long iceAgLoc);

    List<AgenceLocation> findAll();



    int update(AgenceLocation agenceLocation);

    int deleteByIceAgLoc(Long iceAgLoc);

    AgenceLocation findByUsername(String username);


}
