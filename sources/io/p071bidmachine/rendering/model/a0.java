package io.p071bidmachine.rendering.model;

import com.singular.sdk.internal.Constants;
import io.p071bidmachine.util.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum a0 implements g {
    /* JADX INFO: Fake field, exist only in values array */
    Normal(Constants.NORMAL, 0),
    /* JADX INFO: Fake field, exist only in values array */
    Bold("bold", 1),
    /* JADX INFO: Fake field, exist only in values array */
    Italic("italic", 2),
    /* JADX INFO: Fake field, exist only in values array */
    BoldItalic("bold_italic", 3);

    public final String a;
    public final int b;

    @Override // io.p071bidmachine.util.g
    public final String getKey() {
        return this.a;
    }

    a0(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
