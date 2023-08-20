package com.square.employeeservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="Office365")
@AllArgsConstructor
@NoArgsConstructor
public class Office365 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idoffice365;
    private Byte e1;
    private Byte e3;
    private Byte f3;
    private Byte powerAutomate;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
    private Integer employeeIdemployee;

}
