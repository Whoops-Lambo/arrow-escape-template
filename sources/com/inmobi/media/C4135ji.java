package com.inmobi.media;

import defpackage.s71;

/* JADX INFO: renamed from: com.inmobi.media.ji, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4135ji {
    public final String a;
    public final boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4135ji)) {
            return false;
        }
        C4135ji c4135ji = (C4135ji) obj;
        return s71.b(this.a, c4135ji.a) && this.b == c4135ji.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "PublisherAccountSnapshot(persistedAccountId=" + this.a + ", accountIdResetEnabled=" + this.b + ")";
    }

    public C4135ji(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
