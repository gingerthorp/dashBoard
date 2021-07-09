package com.hansoncoding.dashboard.service

import com.hansoncoding.dashboard.entity.Dashboard
import com.hansoncoding.dashboard.repository.DashboardRepository
import com.hansoncoding.dashboard.rest.dto.DashboardResponse
import javassist.NotFoundException
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class DashboardService(
        private val repository: DashboardRepository
) {
    //    cmd + B : 따라가기
    fun getPost(id: Long): DashboardResponse {
        val post = repository.findById(id).orElseThrow { throw NotFoundException("not found!") }

//        아래 주석 코드
//        val post2 = Dashboard(
//                // ... 변수 입력..
//                //id =
//                title = "asdf",
//                content = "asdf",
//                createdDate = LocalDateTime.now(),
//                updatedDate = LocalDateTime.now()
//
//        )
//
//        repository.save(post2)
        //        opt + cmd + L : 정렬


        return DashboardResponse(
                id = post.id,
                title = "A${post.title}",
                content = post.content,
                createdDate = post.createdDate,
                updatedDate = post.updatedDate
        )
    }

    fun postPost(title: String, content: String){

        val post = Dashboard(
                title = title,
                content = content,
                createdDate = LocalDateTime.now(),
                updatedDate = LocalDateTime.now()
        )

        repository.save(post)



    }
}