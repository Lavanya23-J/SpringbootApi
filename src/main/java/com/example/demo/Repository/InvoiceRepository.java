package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.Entity.InvoiceData;
@Repository

public interface InvoiceRepository extends JpaRepository<InvoiceData, Long>  {

}
