package com.hansoncoding.dashboard.rest

import com.hansoncoding.dashboard.rest.dto.DashboardResponse
import com.hansoncoding.dashboard.rest.dto.PostParams
import com.hansoncoding.dashboard.service.DashboardService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/dashboard/v1")
class DashboardController(
        private val dashboardService: DashboardService
) {
    @GetMapping("/post/{id}")
    fun posts(
            @PathVariable id: Long
    ): DashboardResponse {
        return dashboardService.getPost(id)
    }

    @PostMapping("/post")
    fun post_create(
        @RequestParam("title") title: String,
        @RequestParam("content") content: String,
        @RequestBody PostParam : PostParams

    ) : String{
        dashboardService.postPost(PostParam.title, PostParam.content)
        return "create Post!"
    }

}