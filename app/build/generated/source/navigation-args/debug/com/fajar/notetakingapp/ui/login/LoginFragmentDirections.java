package com.fajar.notetakingapp.ui.login;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.fajar.notetakingapp.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToRegisterFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_registerFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_homeFragment);
  }
}
