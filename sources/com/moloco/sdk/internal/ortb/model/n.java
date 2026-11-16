package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.ep0;
import defpackage.yx2;
import defpackage.z92;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@z92
public final class n {

    @NotNull
    public static final G$b Companion = new G$b();
    public static final KSerializer[] d = {null, e1.Companion.serializer(), o.Companion.serializer()};
    public final int a;
    public final e1 b;
    public final o c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return m0.a;
        }
    }

    public n(int i, yx2 yx2Var, e1 e1Var, o oVar) {
        if (7 != (i & 7)) {
            ep0.J(i, 7, m.b);
            throw null;
        }
        this.a = yx2Var.a;
        this.b = e1Var;
        this.c = oVar;
    }
}
