package ru.chimchima.alexey.service

import org.springframework.core.io.InputStreamResource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.io.File

@Service
class PiratService {
    fun getPirat(): ResponseEntity<InputStreamResource> {
        val file = File("pirat/all.mp3")
        val resource = InputStreamResource(file.inputStream())

        return ResponseEntity.ok()
            .contentLength(file.length())
            .contentType(MediaType.APPLICATION_OCTET_STREAM)
            .body(resource)
    }

    fun getPirat2(): ResponseEntity<InputStreamResource> {
        val file = File("pirat/all2.mp3")
        val resource = InputStreamResource(file.inputStream())

        return ResponseEntity.ok()
            .contentLength(file.length())
            .contentType(MediaType.APPLICATION_OCTET_STREAM)
            .body(resource)
    }
}
