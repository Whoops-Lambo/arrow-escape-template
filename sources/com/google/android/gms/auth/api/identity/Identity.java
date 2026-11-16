package com.google.android.gms.auth.api.identity;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p000authapi.zbaq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Identity {
    public static zbaq a(Context context) {
        return new zbaq((Context) Preconditions.checkNotNull(context), new zbv());
    }

    private Identity() {
    }
}
