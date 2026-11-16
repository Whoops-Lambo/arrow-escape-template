package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import defpackage.e80;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.l1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4840l1 implements InterfaceC4858m1 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final IronSource.a c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* JADX INFO: renamed from: com.ironsource.l1$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        public static final a a = new a();
        public static final int b = 1;
        public static final int c = 1;
        public static final int d = 1;

        private a() {
        }
    }

    public /* synthetic */ C4840l1(String str, String str2, IronSource.a aVar, boolean z, boolean z2, boolean z3, int i, e80 e80Var) {
        this(str, str2, aVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }

    @Override // com.ironsource.InterfaceC4858m1
    @NotNull
    public ArrayList<InterfaceC4894o1> a() {
        ArrayList<InterfaceC4894o1> arrayList = new ArrayList<>();
        arrayList.add(new C4876n1.v(this.a));
        arrayList.add(new C4876n1.x(this.b));
        arrayList.add(new C4876n1.a(this.c));
        if (this.d) {
            arrayList.add(new C4876n1.p(1));
        }
        if (this.e) {
            arrayList.add(new C4876n1.e(1));
        }
        if (this.f) {
            arrayList.add(new C4876n1.o(1));
        }
        return arrayList;
    }

    public C4840l1(@NotNull String str, @NotNull String str2, @NotNull IronSource.a aVar, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        aVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }
}
