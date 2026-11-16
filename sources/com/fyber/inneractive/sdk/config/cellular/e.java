package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class e {
    public static d a(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? new c(context) : new g(context);
    }
}
