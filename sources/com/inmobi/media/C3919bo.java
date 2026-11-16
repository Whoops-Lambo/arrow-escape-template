package com.inmobi.media;

import defpackage.pv1;

/* JADX INFO: renamed from: com.inmobi.media.bo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C3919bo extends AbstractC4002eo {
    public final long a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3919bo) && this.a == ((C3919bo) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return pv1.m(this.a, "VideoComplete(duration=", ")");
    }

    public C3919bo(long j) {
        this.a = j;
    }
}
