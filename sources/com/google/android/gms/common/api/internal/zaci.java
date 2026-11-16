package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
final class zaci implements Runnable {
    final /* synthetic */ zacl zaa;

    @Override // java.lang.Runnable
    public final void run() {
        this.zaa.zaf().zaa(new ConnectionResult(4));
    }

    public zaci(zacl zaclVar) {
        Objects.requireNonNull(zaclVar);
        this.zaa = zaclVar;
    }
}
