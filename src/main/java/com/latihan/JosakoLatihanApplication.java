package com.latihan;

import com.latihan.entities.Regions;
import com.latihan.repository.RegionRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JosakoLatihanApplication {

	public static void main(String[] args) {
//		SpringApplication.run(JosakoLatihanApplication.class, args);
                System.out.println(HibernateUtil.getSessionFactory());
                RegionRepository regionRepository = HibernateUtil.getREGION_REPOSITORY();
                for (Regions region : regionRepository.getRegions()) {
                    System.out.println(region.getRegionId()+" - "+region.getRegionName());
            }
	}
}
