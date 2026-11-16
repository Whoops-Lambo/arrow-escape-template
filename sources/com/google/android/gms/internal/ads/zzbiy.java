package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import defpackage.ry3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbiy {
    public final Context a;

    public final boolean a() {
        ry3 ry3Var = ry3.b;
        Context context = this.a;
        return ((Boolean) zzcb.zza(context, ry3Var)).booleanValue() && Wrappers.packageManager(context).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean b(Intent intent) {
        Preconditions.checkNotNull(intent, "Intent can not be null");
        return !this.a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public zzbiy(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null");
        this.a = context;
    }
}
