package ru.chimchima.alexey.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.chimchima.alexey.service.PiratService

@RestController
class PiratController(
    private val piratService: PiratService
) {
    @GetMapping("/pirat-all.mp3")
    fun pirat() = piratService.getPirat()
}
