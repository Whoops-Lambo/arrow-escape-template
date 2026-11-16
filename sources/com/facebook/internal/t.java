package com.facebook.internal;

import defpackage.x53;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class t {
    public static final com.facebook.appevents.n d = new com.facebook.appevents.n(5);
    public static t e;
    public final Object a;
    public Object b;
    public Object c;

    public t a(t tVar, boolean z) {
        if (((t) this.b) != null) {
            com.facebook.appevents.p.e("Validation failed");
            return null;
        }
        if (((t) this.c) != null) {
            com.facebook.appevents.p.e("Validation failed");
            return null;
        }
        if (tVar == null) {
            this.c = this;
            this.b = this;
            tVar = this;
        } else {
            this.b = tVar;
            t tVar2 = (t) tVar.c;
            this.c = tVar2;
            if (tVar2 != null) {
                tVar2.b = this;
            }
            t tVar3 = (t) this.b;
            if (tVar3 != null) {
                tVar3.c = tVar2 != null ? (t) tVar2.b : null;
            }
        }
        return z ? this : tVar;
    }

    public t b(t tVar) {
        if (!(((t) this.b) != null)) {
            com.facebook.appevents.p.e("Validation failed");
            return null;
        }
        if (!(((t) this.c) != null)) {
            com.facebook.appevents.p.e("Validation failed");
            return null;
        }
        if (tVar == this && (tVar = (t) this.b) == this) {
            tVar = null;
        }
        t tVar2 = (t) this.b;
        if (tVar2 != null) {
            tVar2.c = (t) this.c;
        }
        t tVar3 = (t) this.c;
        if (tVar3 != null) {
            tVar3.b = tVar2;
        }
        this.c = null;
        this.b = null;
        return tVar;
    }

    public t(HashMap map, HashMap map2, HashMap map3, String str, String str2, String str3) {
        this.a = map;
        this.b = map2;
        this.c = map3;
    }

    public t(x53 x53Var) {
        this.a = x53Var;
    }
}
