package com.square.employeeservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="TypeOfDevice")
@AllArgsConstructor
@NoArgsConstructor
public class TypeOfDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtypeOfDevice;
    private Byte personalComputer;
    private Byte laptopAndDataFacility;
    private Byte thinClient;
    private Byte phoneExtension;
    private Byte deskPhone;
    private Byte mobilePhone;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
    @OneToOne
    @JoinColumn(name = "employeeIdemployee")
    private Employee employee;

}
