package com.google.android.gms.internal.play_billing;

import defpackage.n44;
import defpackage.s44;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zzcp {
    public static /* synthetic */ boolean a(Unsafe unsafe, n44 n44Var, long j, Object obj, Object obj2) {
        while (!s44.a(unsafe, n44Var, j, obj, obj2)) {
            if (unsafe.getObject(n44Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
