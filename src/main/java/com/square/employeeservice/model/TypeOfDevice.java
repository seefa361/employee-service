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
    @SequenceGenerator(
            name = "type-of-device-seq",
            sequenceName = "type-of-device-seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "type-of-device-seq"
    )
    private Integer idtypeOfDevice;
    @Column(name = "personal_computer", nullable = false)
    private boolean personalComputer;

    @Column(name = "laptop_and_data_facility", nullable = false)
    private boolean laptopAndDataFacility;

    @Column(name = "thin_client", nullable = false)
    private boolean thinClient;

    @Column(name = "phone_extension", nullable = false)
    private boolean phoneExtension;

    @Column(name = "desk_phone", nullable = false)
    private boolean deskPhone;

    @Column(name = "mobile_phone", nullable = false)
    private boolean mobilePhone;

    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "created_by", nullable = false)
    private String createdBy;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "modified_by")
    private String modifiedBy;
    @OneToOne
    @JoinColumn(name = "employeeIdemployee")
    private Employee employee;

}
