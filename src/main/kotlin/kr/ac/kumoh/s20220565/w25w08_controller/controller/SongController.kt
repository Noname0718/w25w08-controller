package kr.ac.kumoh.s20220565.w25w08_controller.controller

import kr.ac.kumoh.s20220565.w25w08_controller.service.SongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController (
    private val service: SongService
){
    @GetMapping("/songs")
    fun getSongLIst() = service.getAllSongs()
}