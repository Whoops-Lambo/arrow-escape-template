package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.a7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4593a7 {

    /* JADX INFO: renamed from: com.ironsource.a7$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements InterfaceC4593a7 {

        @NotNull
        private final EnumC4685c7 a;

        @Override // com.ironsource.InterfaceC4593a7
        @NotNull
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.InterfaceC4593a7
        @NotNull
        public EnumC4685c7 b() {
            return this.a;
        }

        @NotNull
        public final EnumC4685c7 c() {
            return this.a;
        }

        public a(@NotNull EnumC4685c7 enumC4685c7) {
            enumC4685c7.getClass();
            this.a = enumC4685c7;
        }
    }

    @NotNull
    String a();

    @NotNull
    EnumC4685c7 b();
}
