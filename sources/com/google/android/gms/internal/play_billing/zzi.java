package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zzi {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zzo zzoVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(zzoVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(zzoVar) != obj && atomicReferenceFieldUpdater.get(zzoVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
