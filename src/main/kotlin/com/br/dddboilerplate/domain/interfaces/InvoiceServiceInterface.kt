package com.br.dddboilerplate.domain.interfaces

import com.br.dddboilerplate.domain.Invoice

interface InvoiceServiceInterface {

    public fun authorize(invoice: Invoice): Invoice;
}
