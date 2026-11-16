package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.C4664b4;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzats {
    public final String a;
    public final String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzats.class == obj.getClass()) {
            zzats zzatsVar = (zzats) obj;
            if (TextUtils.equals(this.a, zzatsVar.a) && TextUtils.equals(this.b, zzatsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        q63.y(sb, "Header[name=", str, ",value=", str2);
        sb.append(C4664b4.j.e);
        return sb.toString();
    }

    public zzats(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
