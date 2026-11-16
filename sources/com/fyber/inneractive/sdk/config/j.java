package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class j {
    public final Context a;
    public WeakReference b;

    public final Context a() {
        Context context = (Context) com.fyber.inneractive.sdk.util.v.a(this.b);
        return context != null ? context : this.a;
    }

    public j(Context context, Context context2) {
        i iVar = new i(this);
        this.a = context2;
        if (context instanceof Activity) {
            this.b = new WeakReference(context);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(iVar);
        }
    }
}
