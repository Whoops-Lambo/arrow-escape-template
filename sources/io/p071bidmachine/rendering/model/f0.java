package io.p071bidmachine.rendering.model;

import io.p071bidmachine.util.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum f0 implements g {
    /* JADX INFO: Fake field, exist only in values array */
    Linear("linear"),
    Radial("radial"),
    /* JADX INFO: Fake field, exist only in values array */
    Bilinear("bilinear");

    public final String a;

    @Override // io.p071bidmachine.util.g
    public final String getKey() {
        return this.a;
    }

    f0(String str) {
        this.a = str;
    }
}
