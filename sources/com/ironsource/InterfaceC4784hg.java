package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.hg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4784hg {
    void a(@NotNull Runnable runnable);

    void a(@NotNull Runnable runnable, long j);

    static /* synthetic */ void a(InterfaceC4784hg interfaceC4784hg, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            defpackage.d.u("Super calls with default arguments not supported in this target, function: postReleaseTask");
            return;
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        interfaceC4784hg.a(runnable, j);
    }
}
