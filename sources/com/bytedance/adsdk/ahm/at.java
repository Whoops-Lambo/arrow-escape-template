package com.bytedance.adsdk.ahm;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class at<V> {
    private final Throwable ahm;
    private final V kgy;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        if (kgy() != null && kgy().equals(atVar.kgy())) {
            return true;
        }
        if (ahm() == null || atVar.ahm() == null) {
            return false;
        }
        return ahm().toString().equals(ahm().toString());
    }

    public Throwable ahm() {
        return this.ahm;
    }

    public V kgy() {
        return this.kgy;
    }

    public at(V v) {
        this.kgy = v;
        this.ahm = null;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{kgy(), ahm()});
    }

    public at(Throwable th) {
        this.ahm = th;
        this.kgy = null;
    }
}
