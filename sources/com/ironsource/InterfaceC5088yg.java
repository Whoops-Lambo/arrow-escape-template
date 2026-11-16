package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.sr0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.yg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC5088yg {
    void a() throws C5032ve;

    default void a(boolean z, @NotNull sr0 sr0Var) {
        sr0Var.getClass();
        if (z) {
        } else {
            throw new C5032ve((IronSourceError) sr0Var.invoke());
        }
    }
}
