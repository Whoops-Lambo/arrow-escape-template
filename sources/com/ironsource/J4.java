package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class J4 implements Te<String> {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @Override // com.ironsource.Te
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String strB = Q9.b(this.b, this.a);
        if (strB != null && strB.length() != 0) {
            return strB;
        }
        defpackage.d.r("Decryption failed");
        return null;
    }

    public J4(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }
}
