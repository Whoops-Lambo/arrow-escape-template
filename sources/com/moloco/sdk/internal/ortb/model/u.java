package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.ep0;
import defpackage.z92;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@z92
public final class u {

    @NotNull
    public static final c.b Companion = new c.b();
    public final boolean a;
    public final boolean b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return a1.a;
        }
    }

    public u(String str, boolean z, boolean z2, int i) {
        if (1 != (i & 1)) {
            ep0.J(i, 1, t.b);
            throw null;
        }
        this.a = z;
        if ((i & 2) == 0) {
            this.b = true;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public u() {
        this.a = false;
        this.b = true;
        this.c = null;
    }
}
