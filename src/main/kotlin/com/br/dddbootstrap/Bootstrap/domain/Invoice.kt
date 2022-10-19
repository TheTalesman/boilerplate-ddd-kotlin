package com.br.dddbootstrap.Bootstrap.domain

class Invoice {
    val status : InvoiceStatus = InvoiceStatus.PENDING

}

enum class InvoiceStatus{
    PENDING
}