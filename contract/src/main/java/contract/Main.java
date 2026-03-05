package contract;

import contract.impl.PhoneInternetContract;
import contract.impl.PhoneOnlyContract;
import contract.impl.TvOnlyContract;

public class Main {
    public static void main(String[] args) {
        PhoneContract phoneOnlyContract = new PhoneOnlyContract();
        phoneOnlyContract.unlimitedCalls();
        phoneOnlyContract.conferenceCall();
        phoneOnlyContract.threeWayCall();
       
        PhoneInternetContract phoneInternetContract = new PhoneInternetContract();
        phoneInternetContract.downloadLimit();
        phoneInternetContract.internetAccess();
        phoneInternetContract.uploadLimit();

        TvOnlyContract tvOnlyContract = new TvOnlyContract();
        tvOnlyContract.onDemandTv();
        tvOnlyContract.footballTv();
        tvOnlyContract.moviesTv();

    }
}