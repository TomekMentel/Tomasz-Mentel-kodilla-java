package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemsDao itemsDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Widelec");
        Product product2 = new Product("Lyzka");

        Item item1 = new Item(new BigDecimal(12), 30, new BigDecimal(360));
        Item item2 = new Item(new BigDecimal(15), 25, new BigDecimal(375));
        Item item3 = new Item(new BigDecimal(30), 20, new BigDecimal(300));
        Item item4 = new Item(new BigDecimal(18), 15, new BigDecimal(270));

        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product2);
        item4.setProduct(product2);

        Invoice invoice = new Invoice("1/1/2010");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);
        int id = invoice.getId();
        int id1 = product1.getId();
        int id2 = product2.getId();

        //Then
        Assert.assertEquals(4, invoice.getItems().size());
        Assert.assertEquals("Widelec", product1.getName());
        Assert.assertEquals("Lyzka", product2.getName());

        //CleanUp
        invoiceDao.deleteById(id);
        productDao.deleteById(id1);
        productDao.deleteById(id2);
    }
}
