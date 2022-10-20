package com.br.dddboilerplate.domain

data class Invoice(val newStatus: InvoiceStatus) {

    private var status: InvoiceStatus = newStatus

    fun authorize(): Invoice {
        this.status = InvoiceStatus.AUTHORIZED
        return this
    }

    fun getStatus(): InvoiceStatus {
        return this.status
    }

}

enum class InvoiceStatus{
    PENDING,
    AUTHORIZED
}