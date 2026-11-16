package com.moloco.sdk.internal.error.crash.model;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.ep0;
import defpackage.z92;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@z92
public final class j {

    @NotNull
    public static final f.b Companion = new f.b();
    public final String a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return q.a;
        }
    }

    public j(int i, String str, String str2) {
        if (2 != (i & 2)) {
            ep0.J(i, 2, i.b);
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = "proguard";
        } else {
            this.a = str;
        }
        this.b = str2;
    }

    public j(String str) {
        this.a = "proguard";
        this.b = str;
    }
}
