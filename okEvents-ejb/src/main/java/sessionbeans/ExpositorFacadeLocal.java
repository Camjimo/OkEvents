/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Expositor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MacBookPro
 */
@Local
public interface ExpositorFacadeLocal {

    void create(Expositor expositor);

    void edit(Expositor expositor);

    void remove(Expositor expositor);

    Expositor find(Object id);

    List<Expositor> findAll();

    List<Expositor> findRange(int[] range);

    int count();
    
}
