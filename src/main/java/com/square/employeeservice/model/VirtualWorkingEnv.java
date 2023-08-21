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
    @SequenceGenerator(
            name = "virtual-working-env-seq",
            sequenceName = "virtual-working-env-seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "virtual-working-env-seq"
    )
    private Integer idvirtualWorkingEnv;
    @Column(name = "avc", nullable = false)
    private boolean avc;

    @Column(name = "local_citrix_laptop", nullable = false)
    private boolean localCitrixLaptop;

    @Column(name = "local_citrix_pc", nullable = false)
    private boolean localCitrixPc;

    @Column(name = "vpn_call_center", nullable = false)
    private boolean vpnCallCenter;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "modified_by")
    private String modifiedBy;
    @OneToOne
    @JoinColumn(name = "employeeIdemployee")
    private Employee employee;
}
