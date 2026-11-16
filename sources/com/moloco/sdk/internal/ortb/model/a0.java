package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.z92;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@z92
public final class a0 {

    @NotNull
    public static final f.b Companion = new f.b();
    public final d a;
    public final String b;
    public final k1 c;
    public final h d;
    public final i1 e;

    public /* synthetic */ a0(int i, d dVar, String str, k1 k1Var, h hVar, i1 i1Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = dVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = k1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = hVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = i1Var;
        }
    }
}
