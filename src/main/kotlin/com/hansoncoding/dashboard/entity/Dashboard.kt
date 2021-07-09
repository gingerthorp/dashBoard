package com.hansoncoding.dashboard.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "dashboard")
class Dashboard(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @Column
        val title: String,

        @Column
        val content: String,

        @Column(name = "createdDate")
        val createdDate: LocalDateTime,

        @Column
        val updatedDate: LocalDateTime
        //생성자.
) {
}