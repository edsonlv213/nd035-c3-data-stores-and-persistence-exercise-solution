package com.udacity.jdnd.course3.lesson1.data;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "deliveries")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nationalized
    @Column(name = "name")
    private String name;

    @Column(name = "address_full", length = 500)
    private String addressFull;

    @Column(name = "completed", length = 1, columnDefinition = "CHAR(1) CHECK (completed IN ('Y', 'N'))")
    private Character completed;

    @Column(name = "delivery_date")
    private LocalDate deliveryDate;

    @Column(name = "delivery_time")
    private LocalTime deliveryTime;

    // Construtor padrão
    public Delivery() {}

    // Construtor com parâmetros
    public Delivery(String name, String addressFull, Character completed,
                    LocalDate deliveryDate, LocalTime deliveryTime) {
        this.name = name;
        this.addressFull = addressFull;
        this.completed = completed;
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressFull() {
        return addressFull;
    }

    public void setAddressFull(String addressFull) {
        this.addressFull = addressFull;
    }

    public Character getCompleted() {
        return completed;
    }

    public void setCompleted(Character completed) {
        this.completed = completed;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressFull='" + addressFull + '\'' +
                ", completed=" + completed +
                ", deliveryDate=" + deliveryDate +
                ", deliveryTime=" + deliveryTime +
                '}';
    }
}