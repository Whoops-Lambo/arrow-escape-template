package com.ironsource;

import defpackage.e80;
import defpackage.pv1;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4821k0 {

    /* JADX INFO: renamed from: com.ironsource.k0$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements InterfaceC4821k0 {

        @NotNull
        public static final C1369a c = new C1369a(null);

        @Nullable
        private final String a;
        private final boolean b;

        /* JADX INFO: renamed from: com.ironsource.k0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class C1369a {
            @NotNull
            public final a a(@Nullable String str) {
                return new a(str);
            }

            public /* synthetic */ C1369a(e80 e80Var) {
                this();
            }

            private C1369a() {
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s71.b(this.a, ((a) obj).a);
        }

        public /* synthetic */ a(String str, int i, e80 e80Var) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            return aVar.a(str);
        }

        @Nullable
        public final String b() {
            return this.a;
        }

        @Nullable
        public final String c() {
            return this.a;
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("NotReady(reason=", this.a, ")");
        }

        public a(@Nullable String str) {
            this.a = str;
        }

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final a a(@Nullable String str) {
            return new a(str);
        }

        @Override // com.ironsource.InterfaceC4821k0
        public boolean a() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.k0$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b implements InterfaceC4821k0 {

        @NotNull
        public static final b a = new b();
        private static final boolean b = true;

        @Override // com.ironsource.InterfaceC4821k0
        public boolean a() {
            return b;
        }

        private b() {
        }
    }

    boolean a();
}
