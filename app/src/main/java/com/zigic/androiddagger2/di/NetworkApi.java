package com.zigic.androiddagger2.di;

import javax.inject.Inject;

import dagger.Provides;

/**
 * Created by zigic on 29/08/17.
 */

public class NetworkApi {
    @Inject
    public NetworkApi() {

    }

    public boolean validateUser(String username, String password) {
        if (username == null || username.length() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
