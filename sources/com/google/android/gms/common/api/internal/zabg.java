package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
final class zabg implements Runnable {
    final /* synthetic */ Bundle zaa;
    final /* synthetic */ zabk zab;

    public zabg(zabk zabkVar, Bundle bundle) {
        this.zaa = bundle;
        Objects.requireNonNull(zabkVar);
        this.zab = zabkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zat(this.zaa);
    }
}
