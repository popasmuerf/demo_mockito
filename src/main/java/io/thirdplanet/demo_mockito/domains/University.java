package io.thirdplanet.demo_mockito.domains;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class University {
    @JsonProperty
    String alpha_two_code ;

    @JsonProperty
    String country ;

    @JsonProperty
    String[] domains ;

    @JsonProperty
    String name ;

    @JsonProperty
    String[] web_pages ;

}