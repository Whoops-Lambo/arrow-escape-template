package com.moloco.sdk.internal.services;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class g {
    public final Context a;

    public final f a() {
        Context context = this.a;
        com.moloco.sdk.common_adapter_internal.a aVarC = new com.moloco.sdk.internal.error.crash.anr.i(context, 3).c();
        float f = aVarC.c;
        return new f(aVarC.a, f, aVarC.b, aVarC.d, aVarC.f, aVarC.e, context.getResources().getDisplayMetrics().xdpi, context.getResources().getDisplayMetrics().ydpi);
    }

    public g(Context context) {
        this.a = context;
    }
}
