package com.moloco.sdk.internal.error.crash.model;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.z92;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@z92
public final class u {

    @NotNull
    public static final l.b Companion = new l.b();
    public final String a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes10.dex */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return j0.a;
        }
    }

    public /* synthetic */ u(int i, String str, String str2) {
        this.a = (i & 1) == 0 ? "ART" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public u(String str) {
        this.a = "ART";
        this.b = str;
    }
}
