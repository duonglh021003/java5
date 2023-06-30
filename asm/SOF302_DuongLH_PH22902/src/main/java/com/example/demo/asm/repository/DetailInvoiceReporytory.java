package com.example.demo.asm.repository;

import com.example.demo.asm.entity.DetailedInvoice;
import com.example.demo.asm.entity.IdDetailedInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailInvoiceReporytory extends JpaRepository<DetailedInvoice, IdDetailedInvoice> {
//    @Query(value = "SELECT SUM(quantity *unit_price) as sales_this_month\n" +
//            "FROM detailed_invoice a \n" +
//            "INNER JOIN invoice b ON a.id_invoice = b.id \n" +
//            "WHERE YEAR(:date_created) = YEAR(GETDATE()) AND MONTH(:date_created) = MONTH(GETDATE())", nativeQuery = true)
//    Double getSalesToday();
        @Query(value = "SELECT detail\n" +
                "FROM\n" +
                "product_details detail", nativeQuery = true)
    Integer getDiem();
}
