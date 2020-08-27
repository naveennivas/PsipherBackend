package com.psipher.application.actions;

import com.psipher.application.model.PasswordPawnedOutput;

public interface PasswordPawnedOperations {
    /**
     * It checks whether the password has been pawned for the user.
     * @param pass the input password of the user
     * @return pawned or not
     */
    PasswordPawnedOutput pawnedchecker(String pass);
}
