package io.p071bidmachine.util.download;

import defpackage.s71;
import defpackage.uf0;
import defpackage.xe0;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public final long a;
    public final File b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return xe0.d(this.a, bVar.a) && s71.b(this.b, bVar.b);
    }

    public final int hashCode() {
        uf0 uf0Var = xe0.b;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DownloadData(executionTime=" + ((Object) xe0.k(this.a)) + ", output=" + this.b + ')';
    }

    public b(long j, File file) {
        this.a = j;
        this.b = file;
    }
}
