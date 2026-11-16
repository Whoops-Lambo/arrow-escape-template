package io.p071bidmachine.rendering.model.animation.effect;

import io.p071bidmachine.util.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum b implements g {
    /* JADX INFO: Fake field, exist only in values array */
    Left("left"),
    /* JADX INFO: Fake field, exist only in values array */
    Right("right"),
    /* JADX INFO: Fake field, exist only in values array */
    Up("up"),
    /* JADX INFO: Fake field, exist only in values array */
    Down("down");

    public final String a;

    @Override // io.p071bidmachine.util.g
    public final String getKey() {
        return this.a;
    }

    b(String str) {
        this.a = str;
    }
}
