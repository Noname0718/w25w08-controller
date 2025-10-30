package kr.ac.kumoh.s20220565.w25w08_controller.repository

import kr.ac.kumoh.s20220565.w25w08_controller.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    private val songs = listOf(
        Song(1,"Blue Valentine", "NMIXX"),
        Song(2, "Golden","HUNTR/X"),
        Song(3, "타임캡슐","다비치"),
    )
    fun findAll() = songs
}