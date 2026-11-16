package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zziec {
    public static final zziec d = new zziec("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new zziec("\n", "  ", true);
    }

    public zziec(String str, String str2, boolean z) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.a = str;
                this.b = str2;
                this.c = z;
                return;
            }
            defpackage.d.r("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        defpackage.d.r("Only combinations of \\n and \\r are allowed in newline.");
        throw null;
    }
}
