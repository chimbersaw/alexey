package ru.chimchima.alexey.service

import org.springframework.stereotype.Service
import java.io.File
import javax.servlet.http.HttpServletResponse

@Service
class PiratService {
    fun getPirat(response: HttpServletResponse) {
        val kal = File("pirat.mp3").inputStream()
        response.contentType = "mp3"
        kal.copyTo(response.outputStream)
    }
}
