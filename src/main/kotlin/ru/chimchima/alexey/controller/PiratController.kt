package ru.chimchima.alexey.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.chimchima.alexey.service.PiratService
import javax.servlet.http.HttpServletResponse

@RestController
class PiratController(
    private val piratService: PiratService
) {
    @GetMapping("/kal.mp3")
    fun pirat(response: HttpServletResponse) = piratService.getPirat(response)
}
