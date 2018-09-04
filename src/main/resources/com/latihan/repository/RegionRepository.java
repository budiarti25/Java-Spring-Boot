/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.repository;

import com.latihan.entities.Regions;
import java.util.List;

/**
 *
 * @author Ignatius
 */
public interface RegionRepository {
    void save(Regions region);
    void update(Regions region);
    void delete(Regions region);
    Regions getRegions(String name);
    List<Regions> getRegions();
}
