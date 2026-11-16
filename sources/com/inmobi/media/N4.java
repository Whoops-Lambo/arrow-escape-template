package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class N4 {
    public final String a;
    public final Config b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N4) && s71.b(this.b.getType(), ((N4) obj).b.getType());
    }

    public final int hashCode() {
        return this.b.getType().hashCode();
    }

    public N4(String str, Config config) {
        str.getClass();
        config.getClass();
        this.a = str;
        this.b = config;
    }
}
