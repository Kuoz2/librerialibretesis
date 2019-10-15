package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Voucher
import org.springframework.data.jpa.repository.JpaRepository

interface VoucherRepository:JpaRepository<Voucher,Long> {
}
