package com.moloco.sdk.internal.error.crash.model;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.ep0;
import defpackage.j8;
import defpackage.z92;
import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@z92
public final class l {

    @NotNull
    public static final g.b Companion = new g.b();
    public static final KSerializer[] b = {new j8(i.a, 0)};
    public final List a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes10.dex */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return t.a;
        }
    }

    public l(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            ep0.J(i, 1, k.b);
            throw null;
        }
    }

    public l(List list) {
        this.a = list;
    }
}
