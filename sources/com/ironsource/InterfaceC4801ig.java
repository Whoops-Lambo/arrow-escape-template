package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.ig, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4801ig {

    /* JADX INFO: renamed from: com.ironsource.ig$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        void a();
    }

    /* JADX INFO: renamed from: com.ironsource.ig$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {
        private long a;
        private long b;

        public final long a() {
            return this.b;
        }

        public final long b() {
            return this.a;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final void b(long j) {
            this.a = j;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ig$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface c {
        @NotNull
        InterfaceC4801ig a(@NotNull b bVar);
    }

    /* JADX INFO: renamed from: com.ironsource.ig$e */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class e implements InterfaceC4801ig {

        @NotNull
        private final C4837kg a;

        /* JADX INFO: renamed from: com.ironsource.ig$e$a */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class a implements C4837kg.a {
            final /* synthetic */ a a;

            public a(a aVar) {
                this.a = aVar;
            }

            @Override // com.ironsource.C4837kg.a
            public void a() {
                this.a.a();
            }
        }

        @Override // com.ironsource.InterfaceC4801ig
        public void cancel() {
            this.a.e();
        }

        public e(@NotNull C4837kg c4837kg) {
            c4837kg.getClass();
            this.a = c4837kg;
        }

        @Override // com.ironsource.InterfaceC4801ig
        public void a(@NotNull a aVar) {
            aVar.getClass();
            this.a.a((C4837kg.a) new a(aVar));
        }
    }

    void a(@NotNull a aVar);

    void cancel();

    /* JADX INFO: renamed from: com.ironsource.ig$d */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class d implements c {
        @Override // com.ironsource.InterfaceC4801ig.c
        @NotNull
        public InterfaceC4801ig a(@NotNull b bVar) {
            bVar.getClass();
            return new e(new C4837kg(bVar.b()));
        }
    }
}
