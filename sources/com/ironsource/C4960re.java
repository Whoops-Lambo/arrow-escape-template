package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.re, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4960re implements M8, M8.a {

    @Nullable
    private C4943qe a;
    private boolean b;

    @Override // com.ironsource.M8.a
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.M8
    @Nullable
    public C4597ab a() {
        C4943qe c4943qe = this.a;
        if (c4943qe != null) {
            return new C4597ab(c4943qe);
        }
        return null;
    }

    @Override // com.ironsource.M8
    @Nullable
    public T9 b() {
        C4943qe c4943qe = this.a;
        if (c4943qe != null) {
            return new T9(c4943qe);
        }
        return null;
    }

    @Override // com.ironsource.M8
    public boolean c() {
        return this.b;
    }

    @Override // com.ironsource.M8.a
    public void a(@NotNull C4943qe c4943qe) {
        c4943qe.getClass();
        this.a = c4943qe;
    }
}
