package com.google.codelabs.mdc.java.shrine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/*
   TODO: Implement the Functions of Register Fragment
   The corresponding layout file is register_fragment.xml
 */
public class RegisterFragment extends Fragment {
    private MaterialButton regisButton;
    private MaterialButton cancelButton;
    private TextInputEditText pwdText_1;
    private TextInputLayout pwdLayout_1;
    private TextInputEditText pwdText_2;
    private TextInputLayout pwdLayout_2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.register_layout, container, false);

        initiateUI(view);
        setOnclickEvents();
        return view;
    }

    // new all UI elements
    private void initiateUI(View view){
        regisButton=view.findViewById(R.id.register_button);
        cancelButton=view.findViewById(R.id.cancel_button);
        //TODO: Initiate other UI elements

    }

    //set onClick listeners
    private void setOnclickEvents(){
        //Cancel Button: Go to login interface
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((NavigationHost)getActivity()).navigateTo(new LoginFragment(), false);// Navigate to login_fragment.xml and its .java

            }
        });
        //Register Button
        regisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Implement RegisterButton. Validate the register information, if OK, send it to the server; else notice users by error message.
            }
        });
    }
}
