package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.bv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhg {
    public final String a;
    public boolean b;
    public String c;
    public final /* synthetic */ bv4 d;

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.x().getString(this.a, null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.d.x().edit();
        editorEdit.putString(this.a, str);
        editorEdit.apply();
        this.c = str;
    }

    public zzhg(bv4 bv4Var, String str) {
        this.d = bv4Var;
        Preconditions.checkNotEmpty(str);
        this.a = str;
    }
}
