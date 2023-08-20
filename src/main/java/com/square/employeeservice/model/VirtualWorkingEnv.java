package com.square.employeeservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="VirtualWorkingEnv")
@AllArgsConstructor
@NoArgsConstructor
public class VirtualWorkingEnv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idvirtualWorkingEnv;
    private Byte avc;
    private Byte localCitrixLaptop;
    private Byte localCitrixPc;
    private Byte vpnCallCenter;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
    @OneToOne
    @JoinColumn(name = "employeeIdemployee")
    private Employee employee;
}
