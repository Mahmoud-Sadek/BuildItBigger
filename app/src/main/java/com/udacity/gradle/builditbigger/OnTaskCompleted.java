package com.udacity.gradle.builditbigger;

import android.content.Context;

public interface OnTaskCompleted {
    void onTaskCompleted(String result, Context context);
}