package edu.berkeley.eecs.emission.cordova.jwtauth;

import android.content.Intent;
import java.net.URL;

/**
 * Created by shankari on 8/19/17.
 *
 * Interface that defines the methods that all auth handlers must define.
 */

public interface AuthTokenCreator {
    // Method to sign in via the UI
    public AuthPendingResult uiSignIn();

    // Method to retrieve signed-in user information
    // Result is only guaranteed to have requested information filled in
    public AuthPendingResult getUserEmail();
    public AuthPendingResult getServerToken();

    // Callback to get the signin information, if provided through activity result
    public void onActivityResult(int requestCode, int resultCode, Intent data);
}
