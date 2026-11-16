package com.ironsource;

import com.ironsource.AbstractC4914p3;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.e80;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Zg<Smash extends AbstractC4914p3<?>> {

    @NotNull
    public static final a g = new a(null);
    private final int a;
    private final boolean b;

    @NotNull
    private final List<Smash> c;

    @NotNull
    private final List<Smash> d;

    @NotNull
    private final List<Smash> e;

    @NotNull
    private final List<Smash> f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.Zg$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public /* synthetic */ class C0361a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Qg.values().length];
                try {
                    iArr[Qg.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Qg.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        @NotNull
        public final <Smash extends AbstractC4914p3<?>> Zg<Smash> a(@NotNull Qg qg, int i, boolean z, @NotNull List<? extends Smash> list) {
            qg.getClass();
            list.getClass();
            int i2 = C0361a.a[qg.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return new C5021v3(i, z, list, false, 8, null);
                }
                io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                return null;
            }
            return new M4(i, z, list);
        }

        private a() {
        }
    }

    public abstract void c(@NotNull Smash smash);

    private final int b() {
        Integer num;
        List<Smash> list = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC4914p3) obj).y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(a((AbstractC4914p3) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(a((AbstractC4914p3) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    @NotNull
    public final List<Smash> c() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Zg(int i, boolean z, @NotNull List<? extends Smash> list) {
        list.getClass();
        this.a = i;
        this.b = z;
        this.c = list;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    private final int a(Smash smash) {
        return smash.i().l();
    }

    public final void d(@NotNull Smash smash) {
        smash.getClass();
        if (smash.x()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - smash " + smash.k() + " is failed to load");
            return;
        }
        if (smash.y()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is already loaded");
            this.e.add(smash);
            return;
        }
        if (smash.z()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " still loading");
            this.f.add(smash);
            return;
        }
        if (smash.A().get()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " marked as loading candidate");
            this.f.add(smash);
            return;
        }
        if (this.b && b(smash)) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is not better than already loaded smashes");
            return;
        }
        c(smash);
    }

    public boolean e() {
        if (d() >= this.a) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<Smash> a() {
        return this.f;
    }

    private final boolean b(Smash smash) {
        return b() < a(smash);
    }

    public final int d() {
        return this.f.size() + this.e.size() + this.d.size();
    }
}
