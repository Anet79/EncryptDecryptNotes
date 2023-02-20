package com.anet.encryptdecrypnotes.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;

import com.anet.encryptdecrypnotes.activities.MainActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static void goToHomeAndFinish(@NonNull Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
        ((Activity) context).finish();
    }

    public static String convertMilliInStringDate(long milli) {
        Date date = new Date(milli);
        @SuppressLint("SimpleDateFormat")
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }
}
