package com.cg.house_keeping.model.po;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_location_order")
@Data
public class OrderLocationEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_no")
    private Long orderNo;

    @Column(name = "lng")
    private Double lng;

    @Column(name = "lat")
    private Double lat;
}
