package contract.impl;

import contract.InternetContract;

public class PhoneInternetContract implements InternetContract {


    @Override
    public void internetAccess() {
        System.out.println("Internet access activated.");
    }

    @Override
    public void downloadLimit() {
        System.out.println("Download limit set.");
    }

    @Override
    public void uploadLimit() {
        System.out.println("Upload limit set.");
    }

}
