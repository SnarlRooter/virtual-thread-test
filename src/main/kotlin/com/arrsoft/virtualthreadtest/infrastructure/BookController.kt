package com.arrsoft.virtualthreadtest.infrastructure

import com.arrsoft.virtualthreadtest.domain.Book
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class BookController {

    @GetMapping("/book")
    fun getAllBooks(): Book {
        return Book(
            id = UUID.randomUUID(),
            name = "TDD starter",
            description = "TDD book",
        )
    }
}
