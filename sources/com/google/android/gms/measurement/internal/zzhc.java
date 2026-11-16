package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.bv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhc {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ bv4 e;

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.x().getBoolean(this.a, this.b);
        }
        return this.d;
    }

    public final void b(boolean z) {
        SharedPreferences.Editor editorEdit = this.e.x().edit();
        editorEdit.putBoolean(this.a, z);
        editorEdit.apply();
        this.d = z;
    }

    public zzhc(bv4 bv4Var, String str, boolean z) {
        this.e = bv4Var;
        Preconditions.checkNotEmpty(str);
        this.a = str;
        this.b = z;
    }
}
