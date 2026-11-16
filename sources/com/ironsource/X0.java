package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class X0 {
    @NotNull
    public final V0 a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat, @NotNull M8 m8) {
        str.getClass();
        adFormat.getClass();
        m8.getClass();
        if (str.length() == 0) {
            return new V0.a(W0.a);
        }
        if (!m8.c()) {
            return new V0.a(W0.b);
        }
        C4597ab c4597abA = m8.a();
        if (c4597abA != null && c4597abA.a(str, adFormat)) {
            return V0.b.a;
        }
        return new V0.a(W0.c);
    }
}
