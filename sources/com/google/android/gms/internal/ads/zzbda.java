package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import defpackage.wx3;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbda {
    public static final String[] e = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public long a;
    public long b;
    public long c;
    public boolean d;

    public static zzbda a(Context context, Executor executor) {
        String[] strArr = e;
        zzbda zzbdaVar = new zzbda();
        zzbdaVar.a = 0L;
        zzbdaVar.b = 0L;
        zzbdaVar.c = -1L;
        zzbdaVar.d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new wx3(zzbdaVar, 0));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return zzbdaVar;
    }
}
