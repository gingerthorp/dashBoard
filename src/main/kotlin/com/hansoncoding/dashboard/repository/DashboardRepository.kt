package com.hansoncoding.dashboard.repository

import com.hansoncoding.dashboard.entity.Dashboard
import org.springframework.data.jpa.repository.JpaRepository

interface DashboardRepository : JpaRepository<Dashboard, Long> {

}