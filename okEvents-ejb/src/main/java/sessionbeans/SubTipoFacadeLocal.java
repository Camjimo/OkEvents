/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.SubTipo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MacBookPro
 */
@Local
public interface SubTipoFacadeLocal {

    void create(SubTipo subTipo);

    void edit(SubTipo subTipo);

    void remove(SubTipo subTipo);

    SubTipo find(Object id);

    List<SubTipo> findAll();

    List<SubTipo> findRange(int[] range);

    int count();
    
}
