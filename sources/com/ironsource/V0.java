package com.ironsource;

import defpackage.pv1;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface V0 {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements V0 {

        @NotNull
        private final String a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s71.b(this.a, ((a) obj).a);
        }

        public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            return aVar.a(str);
        }

        @NotNull
        public final String b() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("Invalid(reason=", this.a, ")");
        }

        public a(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final a a(@NotNull String str) {
            str.getClass();
            return new a(str);
        }

        @NotNull
        public final String a() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b implements V0 {

        @NotNull
        public static final b a = new b();

        private b() {
        }
    }
}
