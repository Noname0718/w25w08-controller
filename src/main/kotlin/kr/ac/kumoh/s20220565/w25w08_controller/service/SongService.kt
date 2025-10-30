package kr.ac.kumoh.s20220565.w25w08_controller.service

import kr.ac.kumoh.s20220565.w25w08_controller.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService (
    private val repository: SongRepository
){
    fun getAllSongs() = repository.findAll()
}