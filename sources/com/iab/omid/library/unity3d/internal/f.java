package com.iab.omid.library.unity3d.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    @SuppressLint({"StaticFieldLeak"})
    private static f b = new f();
    private Context a;

    public static f b() {
        return b;
    }

    public void a(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
    }

    private f() {
    }

    public Context a() {
        return this.a;
    }
}
