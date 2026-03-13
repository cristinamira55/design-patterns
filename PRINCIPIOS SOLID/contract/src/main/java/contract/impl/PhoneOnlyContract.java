package contract.impl;

import contract.PhoneContract;

public class PhoneOnlyContract implements PhoneContract {

    @Override
    public void unlimitedCalls() {
        System.out.println("Unlimited calls activated.");
    }


    @Override
    public void threeWayCall() {
        System.out.println("Three-way call activated.");
    }

    @Override
    public void conferenceCall() {
        System.out.println("Conference call activated.");
    }
}
