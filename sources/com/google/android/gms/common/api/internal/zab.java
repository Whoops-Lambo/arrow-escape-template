package com.google.android.gms.common.api.internal;

import androidx.annotation.VisibleForTesting;
import defpackage.e32;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zab extends ActivityLifecycleObserver {
    private final WeakReference zaa;

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        zaa zaaVar = (zaa) this.zaa.get();
        if (zaaVar != null) {
            zaaVar.zab(runnable);
            return this;
        }
        e32.i("The target activity has already been GC'd");
        return null;
    }

    @VisibleForTesting
    public zab(zaa zaaVar) {
        this.zaa = new WeakReference(zaaVar);
    }
}
