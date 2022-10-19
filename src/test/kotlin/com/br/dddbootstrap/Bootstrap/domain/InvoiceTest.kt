package com.br.dddbootstrap.Bootstrap.domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.SpringApplication
import org.springframework.mock.env.MockEnvironment

class InvoiceTest{
    val invoice:Invoice = Invoice();

    @Test
    fun `should be able to create an invoice`() {
        assertTrue(invoice.status.equals(InvoiceStatus.PENDING));
    }
}