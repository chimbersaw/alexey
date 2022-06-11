package ru.chimchima.alexey.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.chimchima.alexey.service.PiratService

@RestController
class PiratController(
    private val piratService: PiratService
) {
    @GetMapping("/kal1.mp3")
    fun pirat() = piratService.getPirat()

    @GetMapping("/kal2.mp3")
    fun pirat2() = piratService.getPirat2()
}
