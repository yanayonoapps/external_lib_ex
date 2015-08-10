package com.onoapps.jar.externallibex;

import android.content.Context;
import android.widget.Toast;


/*
 Copyright (c) 2015, OnO-Apps LTD <yanay@onoapps.com>
 Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted, provided that the above copyright
 notice and this permission notice appear in all copies.
 THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL
 IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
 INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE
 OR PERFORMANCE OF THIS SOFTWARE.
*/

/**
 * Created by Yanay Zimran on 8/10/15.
 * This util class is an sdk capable only of showing a toast with it's class name.
 */
public class ExternalUtils {

    private static final String TOAST_TEXT = ExternalUtils.class.getSimpleName();

    public static void showToast(Context context){
        Toast.makeText(context,"Using "+TOAST_TEXT +" sdk.",Toast.LENGTH_LONG).show();
    }

    public static void showToast(Context context,String text){
        Toast.makeText(context,text,Toast.LENGTH_LONG).show();
    }

    public static int fact(int num){
        return ((num == 1) ? 1:num*fact(num-1));
    }

}
