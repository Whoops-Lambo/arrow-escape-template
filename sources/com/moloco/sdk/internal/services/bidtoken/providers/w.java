package com.moloco.sdk.internal.services.bidtoken.providers;

import defpackage.jc1;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class w {
    public final String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && s71.b(this.a, ((w) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return jc1.q(new StringBuilder("TestConfigSignal(configJson="), this.a, ')');
    }

    public w(String str) {
        this.a = str;
    }
}
