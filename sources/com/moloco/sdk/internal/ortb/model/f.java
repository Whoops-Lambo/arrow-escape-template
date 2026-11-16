package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import defpackage.ep0;
import defpackage.yx2;
import defpackage.z92;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@z92
public final class f {

    @NotNull
    public static final C$b Companion = new C$b();
    public static final KSerializer[] e = {null, e1.Companion.serializer(), o.Companion.serializer(), null};
    public final int a;
    public final e1 b;
    public final o c;
    public final long d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes5.dex */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return z.a;
        }
    }

    public f(int i, yx2 yx2Var, e1 e1Var, o oVar, Color color) {
        if (15 != (i & 15)) {
            ep0.J(i, 15, e.b);
            throw null;
        }
        this.a = yx2Var.a;
        this.b = e1Var;
        this.c = oVar;
        this.d = color.a;
    }

    public f(long j) {
        e1 e1Var = e1.c;
        o oVar = o.d;
        this.a = 0;
        this.b = e1Var;
        this.c = oVar;
        this.d = j;
    }
}
