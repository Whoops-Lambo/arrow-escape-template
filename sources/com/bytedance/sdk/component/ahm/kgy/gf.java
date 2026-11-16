package com.bytedance.sdk.component.ahm.kgy;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gf {
    private String ahm;
    private String kgy;

    public Charset kgy(Charset charset) {
        try {
            String str = this.ahm;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VryMV5X4=", "duspnAKIcNeF", "WOYshxC5fQ==", 28);
            return charset;
        }
    }

    private gf(String str) {
        this.kgy = str;
    }

    public String kgy() {
        return this.kgy;
    }

    public static gf kgy(String str) {
        return new gf(str);
    }
}
