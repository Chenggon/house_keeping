package com.cg.house_keeping.dao;

import com.cg.house_keeping.model.po.OrderLocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderLocationRepository extends JpaRepository<OrderLocationEntity,Long> {
    @Query(value = "select a.*,(6371*acos(cos(radians(a.lat))*cos(radians(?1))*cos(radians(?2)-radians(a.lng))+sin(radians(a.lat))*sin(radians(?1)))) as distance from t_location_order a having distance<?3 order by distance limit ?4,?5", nativeQuery = true)
    List<OrderLocationEntity> queryNeary(double lng, double lat, Integer kilmeters, Integer offset, Integer limit);

}
