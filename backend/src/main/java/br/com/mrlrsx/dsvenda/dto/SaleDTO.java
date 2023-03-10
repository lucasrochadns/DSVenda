package br.com.mrlrsx.dsvenda.dto;

import br.com.mrlrsx.dsvenda.entities.Sale;
import br.com.mrlrsx.dsvenda.entities.Seller;

import java.io.Serializable;
import java.time.LocalDate;

public class SaleDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private SellerDTO sellerDTO;

    public SaleDTO(){}

    public SaleDTO(Sale entity){
        this(entity.getId(), entity.getVisited(), entity.getDeals(), entity.getAmount(), entity.getDate(), entity.getSeller());
    }
    public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.sellerDTO = new SellerDTO(seller);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public SellerDTO getSellerDTO() {
        return sellerDTO;
    }

    public void setSellerDTO(SellerDTO sellerDTO) {
        this.sellerDTO = sellerDTO;
    }
}
