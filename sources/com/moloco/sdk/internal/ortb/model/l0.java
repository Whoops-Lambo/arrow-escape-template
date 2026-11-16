package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.s71;
import defpackage.z92;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@z92
public final class l0 {

    @NotNull
    public static final m.b Companion = new m.b();
    public final String a;
    public final j0 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return s71.b(this.a, l0Var.a) && s71.b(this.b, l0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        j0 j0Var = this.b;
        return iHashCode + (j0Var != null ? j0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CreativeRenderingCheckEvent(eventLink=" + this.a + ", config=" + this.b + ')';
    }

    public /* synthetic */ l0(int i, String str, j0 j0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = j0Var;
        }
    }
}
