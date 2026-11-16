package com.unity3d.mediation;

import com.ironsource.C4978se;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class LevelPlayInitError {
    private final int a;

    @NotNull
    private final String b;

    public final int getErrorCode() {
        return this.a;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "LevelPlayError(errorCode=" + this.a + ", errorMessage='" + this.b + "')";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(@NotNull C4978se c4978se) {
        this(c4978se.c(), c4978se.d());
        c4978se.getClass();
    }

    public LevelPlayInitError(int i, @NotNull String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
