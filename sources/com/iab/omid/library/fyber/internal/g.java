package com.iab.omid.library.fyber.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class g {

    @SuppressLint({"StaticFieldLeak"})
    private static g b = new g();
    private Context a;

    public static g b() {
        return b;
    }

    public void a(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
    }

    private g() {
    }

    public Context a() {
        return this.a;
    }
}
