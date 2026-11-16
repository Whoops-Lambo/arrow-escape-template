package com.moloco.sdk.internal.error.crash.model;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.z92;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@z92
public final class i0 {

    @NotNull
    public static final t.b Companion = new t.b();
    public final String a;

    public /* synthetic */ i0(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "{{auto}}";
        } else {
            this.a = str;
        }
    }

    public i0() {
        this.a = "{{auto}}";
    }
}
