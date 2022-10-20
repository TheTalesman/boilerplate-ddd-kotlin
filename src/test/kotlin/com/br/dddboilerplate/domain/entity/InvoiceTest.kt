package com.br.dddboilerplate.domain.entity

import com.br.dddboilerplate.domain.Invoice
import com.br.dddboilerplate.domain.InvoiceStatus
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class InvoiceTest {

    @Test
    fun `should be able to create an invoice`() {
        val invoice: Invoice = Invoice(InvoiceStatus.PENDING);
        assertTrue(invoice.getStatus().equals(InvoiceStatus.PENDING));
    }

    @Test
    fun `should be able to update an invoice status`() {
        val invoice: Invoice = Invoice(InvoiceStatus.PENDING);
        invoice.authorize();
        assertTrue(invoice.getStatus().equals(InvoiceStatus.AUTHORIZED));
    }


}