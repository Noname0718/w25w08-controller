package kr.ac.kumoh.s20220565.w25w08_controller.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController {
    val title = listOf(
        "BlueValentine",
        "Golden",
        "타임캡슐"
    )

    @GetMapping("/songs")
    fun getSongLIst() = title
}