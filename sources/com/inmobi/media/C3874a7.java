package com.inmobi.media;

import defpackage.jc1;

/* JADX INFO: renamed from: com.inmobi.media.a7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C3874a7 extends AbstractC3958d7 {
    public final short a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3874a7) && this.a == ((C3874a7) obj).a;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return jc1.k(this.a, "Failure(errorCode=", ")");
    }

    public C3874a7(short s) {
        this.a = s;
    }
}
