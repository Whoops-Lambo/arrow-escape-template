package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzjs {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final zzdb d;
    public final boolean e;
    public final Long f;
    public final Long g;
    public final String h;

    public zzjs(Context context, zzdb zzdbVar, Long l, Long l2) {
        this.e = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.a = applicationContext;
        this.f = l;
        this.g = l2;
        if (zzdbVar != null) {
            this.d = zzdbVar;
            this.e = zzdbVar.c;
            this.c = zzdbVar.b;
            this.h = zzdbVar.e;
            Bundle bundle = zzdbVar.d;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
