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
    @SequenceGenerator(
            name = "office365-seq",
            sequenceName = "office365-seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "office365-seq"
    )
    private Integer idoffice365;
    @Column(name = "e1", nullable = false)
    private boolean e1;

    @Column(name = "e3", nullable = false)
    private boolean e3;

    @Column(name = "f3", nullable = false)
    private boolean f3;

    @Column(name = "power_automate", nullable = false)
    private boolean powerAutomate;

    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "modified_by", nullable = false)
    private String modifiedBy;
    @OneToOne
    @JoinColumn(name = "employeeIdemployee")
    private Employee employee;

}
