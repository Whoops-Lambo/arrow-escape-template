package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.InterfaceC4951r5;
import com.ironsource.Ob;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface o extends InterfaceC4951r5<String> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements o {

        @NotNull
        private final String a;

        @Override // com.ironsource.InterfaceC4951r5
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.a;
        }

        public a(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(@NotNull Ob<String, T> ob) {
            ob.getClass();
            return ob.a(this.a);
        }
    }

    <T> T a(@NotNull Ob<String, T> ob);
}
