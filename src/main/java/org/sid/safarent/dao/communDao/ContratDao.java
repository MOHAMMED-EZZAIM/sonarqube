package org.sid.safarent.dao.communDao;

import org.sid.safarent.bean.communBean.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratDao extends JpaRepository<Contrat ,Long > {
    Contrat findByNumContrat(int numContrat);
    int deleteByNumContrat(int numContrat);
    Contrat findByLocationRef(String ref);
}
