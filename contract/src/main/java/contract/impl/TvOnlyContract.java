package main.java.contract.impl;

import contract.TvContract;

public class TvOnlyContract implements TvContract{

    
    @Override
    public void onDemandTv() {
        throw new UnsupportedOperationException("On demand TV is not available in this contract.");
    }

    @Override
    public void footballTv() {
        throw new UnsupportedOperationException("Football TV is not available in this contract.");
    }

    @Override
    public void moviesTv() {
        throw new UnsupportedOperationException("Movies TV is not available in this contract.");
    }

}
