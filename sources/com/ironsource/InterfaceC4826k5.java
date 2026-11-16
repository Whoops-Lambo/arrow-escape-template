package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import defpackage.j52;
import defpackage.k52;
import defpackage.wr0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.k5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4826k5<T> extends Vc {
    void b(@NotNull D8 d8);

    @NotNull
    String c();

    @NotNull
    InterfaceC4684c6 d();

    @NotNull
    wr0 i();

    @NotNull
    D8 k();

    @NotNull
    C7 l();

    default boolean j() {
        return k().exists();
    }

    default void m() {
        l().a(this);
        if (k().exists()) {
            IronSourceStorageUtils.deleteFile(k());
        }
        try {
            l().a(k(), d().value(), 5, 5);
        } catch (Exception e) {
            C4950r4.d().a(e);
            i().invoke(new k52(new j52(e)));
        }
    }
}
