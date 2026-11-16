package com.moloco.sdk.internal.error.crash.model;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.ep0;
import defpackage.z92;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@z92
public final class m0 {

    @NotNull
    public static final v.b Companion = new v.b();
    public final String a;
    public final String b;

    public m0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            ep0.J(i, 3, l0.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public m0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
