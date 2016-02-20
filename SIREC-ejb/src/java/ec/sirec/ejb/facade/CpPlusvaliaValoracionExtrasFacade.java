/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.sirec.ejb.facade;

import ec.sirec.ejb.entidades.CpPlusvaliaValoracionExtras;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dguano
 */
@Stateless
public class CpPlusvaliaValoracionExtrasFacade extends AbstractFacade<CpPlusvaliaValoracionExtras> {
    @PersistenceContext(unitName = "SIREC-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CpPlusvaliaValoracionExtrasFacade() {
        super(CpPlusvaliaValoracionExtras.class);
    }
    
}
