package com.google.android.gms.internal.play_billing;

import defpackage.n44;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zzco {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, n44 n44Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(n44Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(n44Var) != obj && atomicReferenceFieldUpdater.get(n44Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
