package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import defpackage.dt1;
import defpackage.qh1;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC4828k7, InterfaceC4828k7.a {

    @NotNull
    private final Map<IronSource.a, AtomicBoolean> a = qh1.Y(new dt1(IronSource.a.REWARDED_VIDEO, new AtomicBoolean(false)), new dt1(IronSource.a.INTERSTITIAL, new AtomicBoolean(false)), new dt1(IronSource.a.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC4828k7
    public boolean a(@NotNull IronSource.a aVar) {
        aVar.getClass();
        AtomicBoolean atomicBoolean = this.a.get(aVar);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4828k7.a
    public void a(@NotNull IronSource.a aVar, boolean z) {
        aVar.getClass();
        AtomicBoolean atomicBoolean = this.a.get(aVar);
        if (atomicBoolean != null) {
            atomicBoolean.set(z);
        }
    }
}
