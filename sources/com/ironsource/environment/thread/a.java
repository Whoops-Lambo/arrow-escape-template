package com.ironsource.environment.thread;

import com.ironsource.C4950r4;
import com.ironsource.If;
import defpackage.az2;
import defpackage.e80;
import defpackage.ks0;
import defpackage.sr0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements Runnable {

    @NotNull
    public static final C1363a a = new C1363a(null);

    public abstract void a() throws Exception;

    /* JADX INFO: renamed from: com.ironsource.environment.thread.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C1363a {

        /* JADX INFO: renamed from: com.ironsource.environment.thread.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class C1364a extends a {
            final /* synthetic */ sr0 b;

            public C1364a(sr0 sr0Var) {
                this.b = sr0Var;
            }

            @Override // com.ironsource.environment.thread.a
            public void a() {
                this.b.invoke();
            }
        }

        /* JADX INFO: renamed from: com.ironsource.environment.thread.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public /* synthetic */ class b extends ks0 implements sr0 {
            public b(Object obj) {
                super(0, obj, Runnable.class, "run", "run()V", 0);
            }

            public final void a() {
                ((Runnable) this.receiver).run();
            }

            @Override // defpackage.sr0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return az2.a;
            }
        }

        public /* synthetic */ C1363a(e80 e80Var) {
            this();
        }

        @NotNull
        public final a a(@NotNull Runnable runnable) {
            a aVar;
            runnable.getClass();
            if (runnable instanceof a) {
                aVar = (a) runnable;
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return a.a.a(new b(runnable));
            }
            return aVar;
        }

        private C1363a() {
        }

        @NotNull
        public final a a(@NotNull sr0 sr0Var) {
            sr0Var.getClass();
            return new C1364a(sr0Var);
        }
    }

    public void a(@NotNull Throwable th) {
        th.getClass();
        If.a(th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            C4950r4.d().a(th);
            try {
                a(th);
            } catch (Throwable th2) {
                C4950r4.d().a(th2);
            }
        }
    }
}
