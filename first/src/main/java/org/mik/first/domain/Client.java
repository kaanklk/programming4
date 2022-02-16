package org.mik.first.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class Client {
    private String name;
    private String address;
    private String country;

    public Client(String name, String address, String country) {
        this.name = name;
        this.address = address;
        this.country = country;
    }

    //Lombok @SuperBuilder handles it.
 /*   public static class Builder {

        private Client instance;

        public Builder() {
            this.instance = new Client();
        }

        public Builder name(String name) {
            this.instance.name = name;
            return this;
        }

        public Builder address(String addr) {
            this.instance.address = addr;
            return this;
        }

        public Client build() {
            return instance;
        }
    }*/
}
