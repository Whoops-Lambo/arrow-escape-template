package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import defpackage.s71;

/* JADX INFO: renamed from: com.inmobi.media.vn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4474vn {
    public final int a;
    public final Config b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4474vn)) {
            return false;
        }
        C4474vn c4474vn = (C4474vn) obj;
        return this.a == c4474vn.a && s71.b(this.b, c4474vn.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ValidatedConfigResponseModel(configResponseCode=" + this.a + ", config=" + this.b + ")";
    }

    public C4474vn(int i, Config config) {
        config.getClass();
        this.a = i;
        this.b = config;
    }
}
