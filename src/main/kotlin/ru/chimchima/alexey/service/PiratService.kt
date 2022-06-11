package ru.chimchima.alexey.service

import org.springframework.core.io.InputStreamResource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.io.File
import java.io.FileInputStream

@Service
class PiratService {
    fun getPirat(): ResponseEntity<InputStreamResource> {
        val resource = InputStreamResource(FileInputStream("pirat.mp3"))

        return ResponseEntity.ok()
            .contentLength(File("pirat.mp3").length())
            .contentType(MediaType.APPLICATION_OCTET_STREAM)
            .body(resource)
    }
}
