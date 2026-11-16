package com.ironsource;

import com.ironsource.AbstractC4914p3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class M4<Smash extends AbstractC4914p3<?>> extends Zg<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4(int i, boolean z, @NotNull List<? extends Smash> list) {
        super(i, z, list);
        list.getClass();
    }

    @Override // com.ironsource.Zg
    public void c(@NotNull Smash smash) {
        smash.getClass();
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
