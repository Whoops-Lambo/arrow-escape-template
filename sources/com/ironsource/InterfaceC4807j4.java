package com.ironsource;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.j4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC4807j4 {

    @NotNull
    public static final c a = c.a;

    /* JADX INFO: renamed from: com.ironsource.j4$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements InterfaceC4807j4 {

        @NotNull
        private final Z6 b;

        @NotNull
        private final InterfaceC4801ig c;

        @NotNull
        private final AtomicBoolean d;

        /* JADX INFO: renamed from: com.ironsource.j4$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class C1367a implements InterfaceC4801ig.a {
            final /* synthetic */ d a;
            final /* synthetic */ a b;

            public C1367a(d dVar, a aVar) {
                this.a = dVar;
                this.b = aVar;
            }

            @Override // com.ironsource.InterfaceC4801ig.a
            public void a() {
                this.a.a(new InterfaceC4703d7.a(new InterfaceC4593a7.a(this.b.b.b())));
                this.b.d.set(false);
            }
        }

        @Override // com.ironsource.InterfaceC4807j4
        public synchronized void a(@NotNull d dVar) {
            dVar.getClass();
            if (this.d.compareAndSet(false, true)) {
                this.c.a(new C1367a(dVar, this));
            }
        }

        public a(@NotNull Z6 z6, @NotNull InterfaceC4801ig interfaceC4801ig) {
            z6.getClass();
            interfaceC4801ig.getClass();
            this.b = z6;
            this.c = interfaceC4801ig;
            this.d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC4807j4
        public synchronized void a() {
            this.c.cancel();
            this.d.set(false);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j4$d */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface d {
        void a(@NotNull InterfaceC4703d7 interfaceC4703d7);
    }

    void a();

    void a(@NotNull d dVar);

    /* JADX INFO: renamed from: com.ironsource.j4$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b implements InterfaceC4807j4 {

        @NotNull
        public static final b b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC4807j4
        public void a(@NotNull d dVar) {
            dVar.getClass();
        }

        @Override // com.ironsource.InterfaceC4807j4
        public void a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j4$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }

        @NotNull
        public final InterfaceC4807j4 a(@NotNull C4667b7 c4667b7) {
            c4667b7.getClass();
            if (c4667b7.b()) {
                Y6 y6 = new Y6(c4667b7);
                InterfaceC4801ig.b bVar = new InterfaceC4801ig.b();
                bVar.b(y6.a());
                bVar.a(y6.a());
                return new a(y6, new InterfaceC4801ig.d().a(bVar));
            }
            return b.b;
        }

        @NotNull
        public final InterfaceC4807j4 a() {
            return b.b;
        }
    }

    @NotNull
    static InterfaceC4807j4 a(@NotNull C4667b7 c4667b7) {
        return a.a(c4667b7);
    }
}
