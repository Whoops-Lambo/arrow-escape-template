package io.p071bidmachine.util.download;

import defpackage.s71;
import defpackage.ya0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public final String a;
    public final ya0 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s71.b(this.a, cVar.a) && this.b.equals(cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DownloadTask(url=" + this.a + ", deferred=" + this.b + ')';
    }

    public c(String str, ya0 ya0Var) {
        str.getClass();
        this.a = str;
        this.b = ya0Var;
    }
}
