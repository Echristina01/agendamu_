package com.example.agendamu.utilities;

import com.example.agendamu.model.UserModel;
import com.google.firebase.auth.FirebaseAuth;

public class LoginHelper {
    private static UserModel currentUser;

    public static UserModel getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(UserModel currentUser) {
        LoginHelper.currentUser = currentUser;
    }

    public static void logout(){
        FirebaseAuth.getInstance().signOut();
        ActivityHelper.getMainActivity().finishAndRemoveTask();
    }
}
