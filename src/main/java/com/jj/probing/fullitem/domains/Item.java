package com.jj.probing.fullitem.domains;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Optional;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Item {
    private String id;
    private String title;
    private String thumbnail;
    private Optional<PaymentOptions> paymentOptions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Optional<PaymentOptions> getPaymentOptions() {
        return paymentOptions;
    }

    public void setPaymentOptions(Optional<PaymentOptions> paymentOptions) {
        this.paymentOptions = paymentOptions;
    }
}
