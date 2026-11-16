package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class w extends y {
    public final int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.a == ((w) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return h50.l(new StringBuilder("Percents(percents="), this.a, ')');
    }

    public w(int i) {
        this.a = i;
    }
}
