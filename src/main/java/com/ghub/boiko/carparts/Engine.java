package com.ghub.boiko.carparts;

import java.math.BigDecimal;

public class Engine {

    private BigDecimal engineСapacity;

    public BigDecimal getEngineСapacity() {
        return engineСapacity;
    }

    public void setEngineСapacity(BigDecimal engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    public void initialEngineСapacity(){engineСapacity = BigDecimal.valueOf(2.4);}

}
