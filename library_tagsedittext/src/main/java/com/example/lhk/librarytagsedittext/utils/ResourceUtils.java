package com.example.lhk.librarytagsedittext.utils;

import android.content.Context;
import android.support.annotation.DimenRes;

public final class ResourceUtils {

    private ResourceUtils() throws InstantiationException {
        throw new InstantiationException("This utility class is created for instantiation");
    }

    public static float getDimension(Context context, @DimenRes int resourceId) {
        return context.getResources().getDimension(resourceId);
    }

    public static int getDimensionPixelSize(Context context, @DimenRes int resourceId) {
        return context.getResources().getDimensionPixelSize(resourceId);
    }

}
