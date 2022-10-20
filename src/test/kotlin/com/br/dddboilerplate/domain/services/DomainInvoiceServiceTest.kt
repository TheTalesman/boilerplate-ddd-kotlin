package com.br.dddboilerplate.domain.services

import com.br.dddboilerplate.domain.Invoice
import com.br.dddboilerplate.domain.InvoiceStatus
import com.br.dddboilerplate.domain.interfaces.InvoiceRepositoryInterface
import com.br.dddboilerplate.domain.interfaces.InvoiceServiceInterface

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.mock.mockito.SpyBean

internal class DomainInvoiceServiceTest{

    @SpyBean
    val invoiceRepository : InvoiceRepositoryInterface = Mockito.mock(InvoiceRepositoryInterface::class.java);

    @SpyBean
    val invoiceService : InvoiceServiceInterface = Mockito.mock(InvoiceServiceInterface::class.java);

    @Autowired
    val domainInvoiceService: DomainInvoiceService = DomainInvoiceService(invoiceService, invoiceRepository);


    @Test
    fun `should be able to update an invoice status`() {
        val invoice: Invoice = Invoice(InvoiceStatus.PENDING)
        doReturn(invoice).`when`(invoiceService).authorize(invoice)
        doReturn(invoice).`when`(invoiceRepository).save(invoice)
        domainInvoiceService.authorize(invoice)
        invoice.getStatus();
        assertTrue(invoice.getStatus().equals(InvoiceStatus.AUTHORIZED));
        verify(invoiceRepository, times(1)).save(invoice)
    }
}