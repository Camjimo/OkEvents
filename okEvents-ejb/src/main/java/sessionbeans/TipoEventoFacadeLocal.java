/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.TipoEvento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MacBookPro
 */
@Local
public interface TipoEventoFacadeLocal {

    void create(TipoEvento tipoEvento);

    void edit(TipoEvento tipoEvento);

    void remove(TipoEvento tipoEvento);

    TipoEvento find(Object id);

    List<TipoEvento> findAll();

    List<TipoEvento> findRange(int[] range);

    int count();
    
}
