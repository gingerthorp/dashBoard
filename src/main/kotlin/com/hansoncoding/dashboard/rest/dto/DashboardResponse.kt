package com.hansoncoding.dashboard.rest.dto

import java.time.LocalDateTime

class DashboardResponse(

        val id: Long = 0,

        val title: String,

        val content: String,

        val createdDate: LocalDateTime,

        val updatedDate: LocalDateTime
) {

}

class PostParams(
        val title: String,

        val content: String,

){

}