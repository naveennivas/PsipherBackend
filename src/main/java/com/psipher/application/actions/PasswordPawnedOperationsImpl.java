package com.psipher.application.actions;


import com.psipher.application.api.PasswordPawnedChecker;
import com.psipher.application.model.PasswordPawnedOutput;
import org.springframework.stereotype.Component;
import okhttp3.OkHttpClient;
import com.github.nbaars.pwnedpasswords4j.client.PwnedPasswordClient;
import com.github.nbaars.pwnedpasswords4j.client.PwnedPasswordChecker;

/**
 * Implements PasswordPawnedCheckerOperations and provide all functionality mentioned in the interface.
 */
@Component
public class PasswordPawnedOperationsImpl implements PasswordPawnedOperations {

    @Override
    public PasswordPawnedOutput pawnedchecker(String pass) {
        PasswordPawnedOutput passwordpawnedoutput = new PasswordPawnedOutput();
        PwnedPasswordClient client = new PwnedPasswordClient(new OkHttpClient(), "https://api.pwnedpasswords.com/range", "");
        PwnedPasswordChecker checker = new PwnedPasswordChecker(client);
        passwordpawnedoutput.setStatus(checker.check(pass));

        return passwordpawnedoutput;
    }
}

