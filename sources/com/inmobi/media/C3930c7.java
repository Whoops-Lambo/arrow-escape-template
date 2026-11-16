package com.inmobi.media;

import defpackage.s71;

/* JADX INFO: renamed from: com.inmobi.media.c7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C3930c7 extends AbstractC3958d7 {
    public final C4501wn a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3930c7) && s71.b(this.a, ((C3930c7) obj).a);
    }

    public final int hashCode() {
        C4501wn c4501wn = this.a;
        if (c4501wn == null) {
            return 0;
        }
        return c4501wn.hashCode();
    }

    public final String toString() {
        return "UnAvailable(vastBeaconData=" + this.a + ")";
    }

    public C3930c7() {
        this.a = null;
    }

    public C3930c7(C4501wn c4501wn) {
        this.a = c4501wn;
    }
}
