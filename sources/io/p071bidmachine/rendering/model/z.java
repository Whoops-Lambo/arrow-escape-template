package io.p071bidmachine.rendering.model;

import io.p071bidmachine.util.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum z implements g {
    Parallel("parallel"),
    Sequence("sequence");

    public final String a;

    @Override // io.p071bidmachine.util.g
    public final String getKey() {
        return this.a;
    }

    z(String str) {
        this.a = str;
    }
}
