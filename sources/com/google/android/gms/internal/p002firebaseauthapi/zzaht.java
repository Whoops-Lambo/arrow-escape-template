package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.zzc;
import defpackage.sq3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaht {
    public final String a;
    public String b;
    public final boolean c;
    public String d;
    public String e;
    public zzaij f;
    public final String g;
    public final long h;
    public final long i;
    public boolean j;
    public zzc k;
    public final List l;
    public zzah m;

    public zzaht(String str, String str2, boolean z, String str3, String str4, zzaij zzaijVar, String str5, long j, long j2, ArrayList arrayList, i iVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        List list = zzaijVar.a;
        zzaij zzaijVar2 = new zzaij();
        if (list != null) {
            zzaijVar2.a.addAll(list);
        }
        this.f = zzaijVar2;
        this.g = str5;
        this.h = j;
        this.i = j2;
        this.j = false;
        this.k = null;
        this.l = arrayList;
        this.m = iVar;
    }

    public zzaht() {
        this.f = new zzaij();
        sq3 sq3Var = zzah.b;
        this.m = i.e;
    }
}
