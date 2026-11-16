package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4888nd {
    private boolean a;
    private boolean b;
    private boolean c;
    private EnumC4959rd d;
    private int e;
    private int f;

    /* JADX INFO: renamed from: com.ironsource.nd$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        private boolean a = true;
        private boolean b = false;
        private boolean c = false;
        private EnumC4959rd d = null;
        private int e = 0;
        private int f = 0;

        public C4888nd a() {
            return new C4888nd(this.a, this.b, this.c, this.d, this.e, this.f, 0);
        }

        public a a(boolean z, EnumC4959rd enumC4959rd, int i) {
            this.b = z;
            if (enumC4959rd == null) {
                enumC4959rd = EnumC4959rd.PER_DAY;
            }
            this.d = enumC4959rd;
            this.e = i;
            return this;
        }

        public a a(boolean z, int i) {
            this.c = z;
            this.f = i;
            return this;
        }

        public a a(boolean z) {
            this.a = z;
            return this;
        }
    }

    public EnumC4959rd a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.a;
    }

    public boolean f() {
        return this.c;
    }

    private C4888nd(boolean z, boolean z2, boolean z3, EnumC4959rd enumC4959rd, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = enumC4959rd;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ C4888nd(boolean z, boolean z2, boolean z3, EnumC4959rd enumC4959rd, int i, int i2, int i3) {
        this(z, z2, z3, enumC4959rd, i, i2);
    }
}
