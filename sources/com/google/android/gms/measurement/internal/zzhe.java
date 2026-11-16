package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.bv4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhe {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ bv4 e;

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.x().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.e.x().edit();
        editorEdit.putLong(this.a, j);
        editorEdit.apply();
        this.d = j;
    }

    public zzhe(bv4 bv4Var, String str, long j) {
        Objects.requireNonNull(bv4Var);
        this.e = bv4Var;
        Preconditions.checkNotEmpty(str);
        this.a = str;
        this.b = j;
    }
}
