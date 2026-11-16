package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4843l4 {

    /* JADX INFO: renamed from: com.ironsource.l4$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements InterfaceC4843l4 {
        private final boolean a;

        @Override // com.ironsource.InterfaceC4843l4
        public void a() {
            A8.a(C4853le.x, new C5026v8().a(G5.y, Boolean.valueOf(this.a)).a());
        }

        public a(boolean z) {
            this.a = z;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l4$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b implements InterfaceC4843l4 {
        private final boolean a;
        private final long b;

        @NotNull
        private final InterfaceC4986t4 c;

        @Override // com.ironsource.InterfaceC4843l4
        public void a() {
            C5026v8 c5026v8A = new C5026v8().a(G5.y, Boolean.valueOf(this.a));
            if (this.b > 0) {
                c5026v8A.a(G5.B, Long.valueOf(this.c.a() - this.b));
            }
            A8.a(C4853le.w, c5026v8A.a());
        }

        @NotNull
        public final InterfaceC4986t4 b() {
            return this.c;
        }

        public b(boolean z, long j, @NotNull InterfaceC4986t4 interfaceC4986t4) {
            interfaceC4986t4.getClass();
            this.a = z;
            this.b = j;
            this.c = interfaceC4986t4;
        }
    }

    void a();
}
