package com.moloco.sdk.internal.error.crash.model;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.z92;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@z92
public final class d {

    @NotNull
    public static final com.moloco.sdk.internal.error.crash.model.b.C1513b Companion = new com.moloco.sdk.internal.error.crash.model.b.C1513b();
    public final com.moloco.sdk.internal.error.crash.model.b a;
    public final n b;
    public final r c;
    public final u d;
    public final m0 e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes.dex */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return f.a;
        }
    }

    public /* synthetic */ d(int i, com.moloco.sdk.internal.error.crash.model.b bVar, n nVar, r rVar, u uVar, m0 m0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = nVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = rVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = uVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = m0Var;
        }
    }

    public d(com.moloco.sdk.internal.error.crash.model.b bVar, n nVar, r rVar, u uVar, m0 m0Var) {
        this.a = bVar;
        this.b = nVar;
        this.c = rVar;
        this.d = uVar;
        this.e = m0Var;
    }
}
