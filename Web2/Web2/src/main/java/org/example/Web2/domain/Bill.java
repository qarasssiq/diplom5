package org.example.Web2.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bills")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "service_id")
    private Service serviceId;

    private boolean isPaid;

    private Double meter;

    private Double amount;

    private Double paidAmount = 0.0;

    private LocalDate date;

    public Bill() {
    }

    public Bill(Service serviceId, Double meter, Double amount, LocalDate date) {
        this.serviceId = serviceId;
        this.meter = meter;
        this.amount = amount;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Double getMeter() {
        return meter;
    }

    public void setMeter(Double meter) {
        this.meter = meter;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
