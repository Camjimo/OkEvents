/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Expositor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MacBookPro
 */
@Stateless
public class ExpositorFacade extends AbstractFacade<Expositor> implements ExpositorFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_okEvents-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ExpositorFacade() {
        super(Expositor.class);
    }
    
}
