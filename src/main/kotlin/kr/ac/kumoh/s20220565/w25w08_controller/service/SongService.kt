package kr.ac.kumoh.s20220565.w25w08_controller.service

import kr.ac.kumoh.s20220565.w25w08_controller.model.Song
import org.springframework.stereotype.Service

@Service
class SongService {
    fun getAllSongs(): List<Song> {
        return listOf(
            Song(1, "BlueValentine","NMIXX")
        )
    }
}