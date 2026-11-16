package com.inmobi.media;

import defpackage.s71;

/* JADX INFO: renamed from: com.inmobi.media.yi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4550yi extends Ai {
    public final int a;
    public final String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4550yi)) {
            return false;
        }
        C4550yi c4550yi = (C4550yi) obj;
        return this.a == c4550yi.a && s71.b(this.b, c4550yi.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Failure(statusCode=" + this.a + ", message=" + this.b + ")";
    }

    public C4550yi(String str, int i) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
