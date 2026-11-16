package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class X7 implements X1 {
    @Override // com.ironsource.X1
    public void a(@NotNull InterfaceC4939qa interfaceC4939qa) {
        interfaceC4939qa.getClass();
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.ironsource.lifecycle.b.d().a(interfaceC4939qa);
    }

    @Override // com.ironsource.X1
    public void b(@NotNull InterfaceC4939qa interfaceC4939qa) {
        interfaceC4939qa.getClass();
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.ironsource.lifecycle.b.d().b(interfaceC4939qa);
    }
}
