package com.onoapps.test.toaster;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by onoapps on 8/11/15.
 */
public class Toaster {

    private static final String STRING = "It works!";

    public static void showToast(Context context){
        if (context!=null){
            Toast.makeText(context,STRING,Toast.LENGTH_LONG).show();
        }
    }
}
