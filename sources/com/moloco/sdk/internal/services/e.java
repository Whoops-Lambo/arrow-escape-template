package com.moloco.sdk.internal.services;

import android.content.SharedPreferences;
import defpackage.az2;
import defpackage.ba0;
import defpackage.dz;
import defpackage.fy;
import defpackage.q6;
import defpackage.tb5;
import defpackage.xc0;
import defpackage.y80;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public final SharedPreferences a;

    public final Object a(String str, fy fyVar) throws Throwable {
        ba0 ba0Var = xc0.a;
        Object objE = tb5.E(y80.c, new d(this, str, null, 1), fyVar);
        return objE == dz.a ? objE : az2.a;
    }

    public final Object b(String str, String str2, fy fyVar) throws Throwable {
        ba0 ba0Var = xc0.a;
        Object objE = tb5.E(y80.c, new q6(str2, this, str, null, 4), fyVar);
        return objE == dz.a ? objE : az2.a;
    }

    public e(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }
}
