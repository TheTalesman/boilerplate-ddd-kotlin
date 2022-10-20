package com.br.dddboilerplate.domain.interfaces

import com.br.dddboilerplate.domain.Invoice

interface InvoiceRepositoryInterface {

    public fun save(invoice: Invoice): Invoice
}
