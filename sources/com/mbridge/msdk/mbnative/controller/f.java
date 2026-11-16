package com.mbridge.msdk.mbnative.controller;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class f {
    private static View a(View view) {
        if (view == null) {
            return null;
        }
        try {
            WeakHashMap weakHashMap = ViewCompat.a;
            view.isAttachedToWindow();
        } catch (Throwable unused) {
        }
        try {
            View rootView = view.getRootView();
            if (rootView == null) {
                return null;
            }
            View viewFindViewById = rootView.findViewById(R.id.content);
            return viewFindViewById != null ? viewFindViewById : rootView;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static View a(Context context) {
        if (context != null && (context instanceof Activity)) {
            return ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        }
        return null;
    }

    public static View a(Context context, View view) {
        View viewA = a(context);
        return viewA != null ? viewA : a(view);
    }
}
