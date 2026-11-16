package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    public final t0 a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && s71.b(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        t0 t0Var = this.a;
        if (t0Var == null) {
            return 0;
        }
        return t0Var.hashCode();
    }

    public final String toString() {
        return "MraidAdData(dec=" + this.a + ')';
    }

    public g(t0 t0Var) {
        this.a = t0Var;
    }
}
