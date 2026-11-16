package com.moloco.sdk.internal.services;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.ep0;
import defpackage.fy;
import defpackage.i9;
import defpackage.wz2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements y {
    public final Context a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, fy fyVar) {
        z zVar;
        if (fyVar instanceof z) {
            zVar = (z) fyVar;
            int i = zVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                zVar.t = i - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, fyVar);
            }
        } else {
            zVar = new z(this, fyVar);
        }
        Object objN = zVar.r;
        int i2 = zVar.t;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(objN);
            i9 i9Var = new i9(this, dyVar, 10);
            zVar.t = 1;
            objN = ep0.N(j, i9Var, zVar);
            dz dzVar = dz.a;
            if (objN == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objN);
        }
        Boolean bool = (Boolean) objN;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    public final boolean b() {
        NetworkCapabilities networkCapabilities;
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
    }

    public a0(Context context) {
        context.getClass();
        this.a = context;
    }
}
