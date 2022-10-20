package com.br.dddboilerplate.domain.services

import com.br.dddboilerplate.domain.Invoice
import com.br.dddboilerplate.domain.InvoiceStatus
import com.br.dddboilerplate.domain.interfaces.InvoiceRepositoryInterface
import com.br.dddboilerplate.domain.interfaces.InvoiceServiceInterface

class DomainInvoiceService(private val invoiceService: InvoiceServiceInterface, private val invoiceRepository: InvoiceRepositoryInterface) {

    fun authorize(invoice: Invoice){
        val isInvoiceAuthorized = invoiceService.authorize(invoice).getStatus() == InvoiceStatus.AUTHORIZED
        if (!isInvoiceAuthorized) {
            invoice.authorize();
            this.invoiceRepository.save(invoice);
        }

    }

}