package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import defpackage.dr0;
import defpackage.e80;
import defpackage.eu;
import defpackage.gg0;
import defpackage.wr0;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5054x0 {

    @NotNull
    public static final a s = new a(null);
    public static final int t = -1;

    @NotNull
    private final C4750g0 a;
    private final boolean b;

    @Nullable
    private final String c;

    @NotNull
    private final List<NetworkSettings> d;

    @NotNull
    private final C4992ta e;

    @NotNull
    private final A2 f;
    private int g;
    private final int h;
    private boolean i;
    private final int j;
    private final int k;

    @NotNull
    private final M0 l;
    private final long m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private boolean q;

    @Nullable
    private Eb r;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC5054x0(@NotNull C4750g0 c4750g0, boolean z, @Nullable String str, @NotNull List<? extends NetworkSettings> list, @NotNull C4992ta c4992ta, @NotNull A2 a2, int i, int i2, boolean z2, int i3, int i4, @NotNull M0 m0, long j, boolean z3, boolean z4, boolean z5, boolean z6) {
        c4750g0.getClass();
        list.getClass();
        c4992ta.getClass();
        a2.getClass();
        m0.getClass();
        this.a = c4750g0;
        this.b = z;
        this.c = str;
        this.d = list;
        this.e = c4992ta;
        this.f = a2;
        this.g = i;
        this.h = i2;
        this.i = z2;
        this.j = i3;
        this.k = i4;
        this.l = m0;
        this.m = j;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
    }

    @NotNull
    public abstract JSONObject b(@NotNull NetworkSettings networkSettings);

    @NotNull
    public abstract String c();

    @NotNull
    public abstract String k();

    /* JADX INFO: renamed from: com.ironsource.x0$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(@NotNull C4750g0 c4750g0, @Nullable C4597ab c4597ab, @NotNull wr0 wr0Var, @NotNull zr0 zr0Var) {
            S3 s3C;
            List<Ec> listD;
            Ue ueD;
            c4750g0.getClass();
            wr0Var.getClass();
            zr0Var.getClass();
            if (c4597ab != null && (ueD = c4597ab.d()) != null) {
                s3C = ueD.c();
            } else {
                s3C = null;
            }
            Object objInvoke = wr0Var.invoke(s3C);
            if (objInvoke != null) {
                if (c4597ab == null || (listD = c4597ab.d(c4750g0.e(), c4750g0.c())) == null) {
                    listD = gg0.a;
                }
                String strF = IronSourceUtils.f();
                ArrayList arrayList = new ArrayList(eu.f(listD, 10));
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Ec) it.next()).f());
                }
                C4992ta c4992taB = C4992ta.b();
                c4992taB.getClass();
                return (AdUnitData) zr0Var.invoke(new C5036w0(strF, arrayList, c4992taB), objInvoke);
            }
            dr0.f(c4750g0.a(), " configurations", "Error getting ");
            return null;
        }

        private a() {
        }
    }

    @NotNull
    public C4750g0 b() {
        return this.a;
    }

    public final boolean d() {
        return this.i;
    }

    @NotNull
    public final A2 e() {
        return this.f;
    }

    public final long f() {
        return this.m;
    }

    public final int g() {
        return this.j;
    }

    public final int h() {
        return this.h;
    }

    @Nullable
    public final Eb i() {
        return this.r;
    }

    @NotNull
    public final M0 j() {
        return this.l;
    }

    public final int l() {
        return this.g;
    }

    @NotNull
    public final List<NetworkSettings> n() {
        return this.d;
    }

    public final boolean o() {
        return this.n;
    }

    @NotNull
    public final C4992ta p() {
        return this.e;
    }

    public final boolean q() {
        return this.p;
    }

    public final boolean r() {
        return this.q;
    }

    @Nullable
    public final String s() {
        return this.c;
    }

    public final boolean t() {
        return this.o;
    }

    public final boolean u() {
        return this.f.g() > 0;
    }

    public boolean v() {
        return this.b;
    }

    @Nullable
    public final NetworkSettings a(@NotNull String str) {
        Object next;
        str.getClass();
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(str)) {
                return (NetworkSettings) next;
            }
        }
        next = null;
        return (NetworkSettings) next;
    }

    @NotNull
    public final String m() {
        String strC;
        C4870md c4870mdF = b().f();
        if (c4870mdF != null && (strC = c4870mdF.c()) != null) {
            return strC;
        }
        return "";
    }

    @NotNull
    public final String w() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.x, Integer.valueOf(this.g), com.ironsource.mediationsdk.d.y, Boolean.valueOf(this.i), com.ironsource.mediationsdk.d.z, Boolean.valueOf(this.q));
        Eb eb = this.r;
        if (eb != null) {
            return ((Object) str) + ", loadGrace: " + eb.b();
        }
        return str;
    }

    public final void b(boolean z) {
        this.q = z;
    }

    public /* synthetic */ AbstractC5054x0(C4750g0 c4750g0, boolean z, String str, List list, C4992ta c4992ta, A2 a2, int i, int i2, boolean z2, int i3, int i4, M0 m0, long j, boolean z3, boolean z4, boolean z5, boolean z6, int i5, e80 e80Var) {
        this(c4750g0, z, str, list, c4992ta, a2, i, i2, z2, i3, i4, m0, j, z3, z4, z5, (i5 & 65536) != 0 ? false : z6);
    }

    public final void a(boolean z) {
        this.i = z;
    }

    public final int a() {
        return this.k;
    }

    public final void a(@Nullable Eb eb) {
        this.r = eb;
    }

    public final void a(int i) {
        this.g = i;
    }

    @NotNull
    public AdData a(@NotNull NetworkSettings networkSettings) {
        networkSettings.getClass();
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(networkSettings), b().a(), this.c);
        adDataCreateAdDataForNetworkAdapter.getClass();
        return adDataCreateAdDataForNetworkAdapter;
    }
}
