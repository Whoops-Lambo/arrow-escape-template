package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.w0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class v {
    public final o a;

    public v(Context context) {
        this.a = new o(context, (String) null);
    }

    public final void a(Bundle bundle, String str) {
        com.facebook.a0 a0Var = com.facebook.a0.a;
        if (w0.c()) {
            this.a.h(bundle, str);
        }
    }

    public v(Context context, String str) {
        this.a = new o(context, str);
    }
}
