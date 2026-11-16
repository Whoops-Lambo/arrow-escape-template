package com.ironsource.mediationsdk.demandOnly;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface p {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a implements p {

        @NotNull
        private final String a;

        @Override // com.ironsource.mediationsdk.demandOnly.p
        @NotNull
        public String value() {
            return this.a;
        }

        public a(@NotNull String str) {
            str.getClass();
            this.a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b extends a {
        public b() {
            super("");
        }
    }

    @NotNull
    String value();
}
