package io.p071bidmachine.rendering.model.animation.effect;

import com.ironsource.C5055x1;
import io.p071bidmachine.util.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum a implements g {
    /* JADX INFO: Fake field, exist only in values array */
    Self(C5055x1.o),
    Screen("screen");

    public final String a;

    @Override // io.p071bidmachine.util.g
    public final String getKey() {
        return this.a;
    }

    a(String str) {
        this.a = str;
    }
}
