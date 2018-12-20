package com.watson.lewis.hello_world

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner


@SpringBootTest(classes = arrayOf(Application::class),
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
internal class ControllerTest {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun `When called should return hello`() {
        val result = testRestTemplate
                .getForEntity("/hello", String::class.java)

        assertNotNull(result)
        assertEquals(result?.statusCode, HttpStatus.OK)
        assertEquals(result?.body, "Hello, World")
    }
}