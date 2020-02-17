package dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dos.PoissonDO;

@Transactional(propagation = Propagation.MANDATORY)
public interface IPoisson extends JpaRepository<PoissonDO, Integer> {

}
