package com.latihan.repository;

import com.latihan.entities.Regions;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ignatius
 */
public class RegionRepositoryImplementation implements RegionRepository{
    private SessionFactory sessionFactory;
    
    public RegionRepositoryImplementation(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Regions region) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Regions region) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Regions region) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Regions getRegions(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Regions> getRegions() {
        Session session = sessionFactory.openSession();
        List<Regions> regions;
        try {
            session.beginTransaction();
            regions = session.createCriteria(Regions.class).list();
            session.getTransaction().commit();
            return regions;
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
        return null;
    }
    
}
