package com.facebook.appevents;

import com.facebook.internal.v0;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements Serializable {
    public final String a;
    public final String b;

    private final Object writeReplace() throws ObjectStreamException {
        return new a(this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return v0.a(bVar.b, this.b) && bVar.a.equals(this.a);
    }

    public final int hashCode() {
        String str = this.b;
        return this.a.hashCode() ^ (str != null ? str.hashCode() : 0);
    }

    public b(String str, String str2) {
        this.a = str2;
        this.b = v0.G(str) ? null : str;
    }
}
