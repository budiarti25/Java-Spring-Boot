package com.latihan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.latihan.repository.RegionRepository;
import com.latihan.repository.RegionRepositoryImplementation;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Ignatius
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    private static final RegionRepository REGION_REPOSITORY;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            REGION_REPOSITORY = new RegionRepositoryImplementation(sessionFactory);
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static RegionRepository getREGION_REPOSITORY() {
        return REGION_REPOSITORY;
    }
    
}
