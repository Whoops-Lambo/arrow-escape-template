package com.ironsource;

import defpackage.n30;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Dc implements Jd {

    @NotNull
    private final String a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "IronSource";

        private a() {
        }
    }

    @Override // com.ironsource.Jd
    @NotNull
    public String value() {
        if (this.a.length() == 0) {
            return "";
        }
        return (s71.b(this.a, "0") || s71.b(this.a, "IronSource")) ? "IronSource" : n30.y("IronSource_", this.a);
    }

    public Dc(@NotNull String str) {
        str.getClass();
        this.a = str;
    }
}
