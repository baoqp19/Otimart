package com.Optimart.responses.Product;

import com.Optimart.models.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {
    private UUID id;
    private String name;
    private String slug;
    private String image;
    private Long price;
    private int countInStock;
    private String description;
    private int discount;
    private Date discountStartDate;
    private Date discountEndDate;
    private int sold;
    private int totalLikes;
    private int status;
    private int views;
//    private List<String> userList;
    private Set<UUID> userLikedList;
    private Set<UUID> userViewedList;
    private ProductType productType;
    private City city;
    private List<Review> reviewList;
    private List<Comment> commentList;
}
