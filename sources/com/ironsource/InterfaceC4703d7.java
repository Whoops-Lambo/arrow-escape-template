package com.ironsource;

import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.d7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4703d7 {

    /* JADX INFO: renamed from: com.ironsource.d7$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements InterfaceC4703d7 {

        @NotNull
        private final InterfaceC4593a7 a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s71.b(this.a, ((a) obj).a);
        }

        public static /* synthetic */ a a(a aVar, InterfaceC4593a7 interfaceC4593a7, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC4593a7 = aVar.a;
            }
            return aVar.a(interfaceC4593a7);
        }

        @NotNull
        public final InterfaceC4593a7 b() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(failure=" + this.a + ")";
        }

        public a(@NotNull InterfaceC4593a7 interfaceC4593a7) {
            interfaceC4593a7.getClass();
            this.a = interfaceC4593a7;
        }

        @NotNull
        public final a a(@NotNull InterfaceC4593a7 interfaceC4593a7) {
            interfaceC4593a7.getClass();
            return new a(interfaceC4593a7);
        }

        @NotNull
        public final InterfaceC4593a7 a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4703d7
        public void a(@NotNull InterfaceC4721e7 interfaceC4721e7) {
            interfaceC4721e7.getClass();
            interfaceC4721e7.a(this.a);
        }
    }

    default void a(@NotNull InterfaceC4721e7 interfaceC4721e7) {
        interfaceC4721e7.getClass();
    }
}
