package io.swagger.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class MyClass extends MySuperClass {

    public void populate(final String isotonicDrink, final String softDrink,
                         final String isoDrink) {
        this.isotonicDrink = isotonicDrink;
        this.softDrink = softDrink;
        this.isoDrink = isoDrink;
    }

    @XmlElement(name = "beerDrink")
    @JsonProperty("beerDrink")
    private String isotonicDrink;

    @XmlElement(name = "sugarDrink")
    private String softDrink;

    @ApiModelProperty(name = "saltDrink")
    private String isoDrink;

}
