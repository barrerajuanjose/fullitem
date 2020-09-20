package com.jj.probing.fullitem.domains;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PaymentOptions {
    private List<PaymentMethod> paymentMethods;

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public static class PaymentMethod {
        private String id;
        private String name;
        private Issuer issuer;
        private List<String> labels;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Issuer getIssuer() {
            return issuer;
        }

        public void setIssuer(Issuer issuer) {
            this.issuer = issuer;
        }

        public List<String> getLabels() {
            return labels;
        }

        public void setLabels(List<String> labels) {
            this.labels = labels;
        }
    }

    private static class Issuer {
        private String id;
        private String name;
        @JsonAlias("default")
        private boolean _default;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean is_default() {
            return _default;
        }

        public void set_default(boolean _default) {
            this._default = _default;
        }
    }
}
