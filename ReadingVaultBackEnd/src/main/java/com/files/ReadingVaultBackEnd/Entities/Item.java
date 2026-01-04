package com.files.ReadingVaultBackEnd.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



 @Setter @Getter @NoArgsConstructor @AllArgsConstructor 
 @Entity
 @Table(name="item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="itemId",nullable=false,unique=true)
    private Long itemId;

    @Column(name="itemTitle",nullable=false)
    private String itemTitle;

    @Column(name="itemAuthor",nullable=true)
    private String itemAuthor;

    @Column(name="itemPublicationDate",nullable=true)
    private LocalDateTime itemPublication;

    @Column(name="itemPrice",nullable=true)
    private Double itemprice;

    @Column(name="itemType",nullable=false)
    @Enumerated(EnumType.STRING)
    private Itemtype itemType;

    @Column(name="itemCreatedAt",updatable=false)
private LocalDateTime itemCreatedAt;
}
