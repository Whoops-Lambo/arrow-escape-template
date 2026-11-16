package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.ironsource.C4664b4;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    private final String a;
    private final String b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (TextUtils.equals(this.a, gVar.a) && TextUtils.equals(this.b, gVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.a);
        sb.append(",value=");
        return nj.q(sb, this.b, C4664b4.j.e);
    }

    public g(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
