package io.p071bidmachine.rendering.model;

import android.graphics.Bitmap;
import defpackage.h50;
import defpackage.jc1;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class r0 {
    public final int a;
    public final String b;
    public final String c;
    public final Bitmap d;

    public r0(int i, String str, String str2, Bitmap bitmap) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.a == r0Var.a && this.b.equals(r0Var.b) && this.c.equals(r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n30.c(h50.C(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Action(type=");
        int i = this.a;
        if (i != 1) {
            str = i != 2 ? "null" : "COPY_TO_CLIPBOARD";
        } else {
            str = "REDIRECT";
        }
        sb.append(str);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", data=");
        return jc1.q(sb, this.c, ')');
    }
}
