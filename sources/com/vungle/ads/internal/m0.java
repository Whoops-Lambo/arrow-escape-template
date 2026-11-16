package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m0 {
    public final Context a;
    public final DisplayMetrics b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && s71.b(this.a, ((m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("DeviceScreenInfo(context=");
        sbA.append(this.a);
        sbA.append(')');
        return sbA.toString();
    }

    public m0(Context context) {
        context.getClass();
        this.a = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.b = displayMetrics;
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
    }
}
