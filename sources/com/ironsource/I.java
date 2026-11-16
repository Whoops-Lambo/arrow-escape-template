package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    @NotNull
    private C4946r0.a a;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I) && this.a == ((I) obj).a;
    }

    public static /* synthetic */ I a(I i, C4946r0.a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = i.a;
        }
        return i.a(aVar);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdInstancePerformance(performance=" + this.a + ")";
    }

    public I(@NotNull C4946r0.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public final void b(@NotNull C4946r0.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    @NotNull
    public final C4946r0.a b() {
        return this.a;
    }

    @NotNull
    public final I a(@NotNull C4946r0.a aVar) {
        aVar.getClass();
        return new I(aVar);
    }

    @NotNull
    public final C4946r0.a a() {
        return this.a;
    }
}
