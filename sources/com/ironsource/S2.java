package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.sj0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5065xb
public class S2 extends AbstractC4929q0 {

    @NotNull
    private final C4705d9 i;

    @NotNull
    private final WeakReference<V2> j;

    @NotNull
    private final a k;

    @NotNull
    private final T2 l;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class a extends AbstractC4929q0.a implements K2 {
        public a() {
            super();
        }

        @Override // com.ironsource.K2
        public void a(@NotNull I2 i2) {
            i2.getClass();
            IronLog.INTERNAL.verbose(S2.this.a(i2.q()));
            V2 v2 = (V2) S2.this.j.get();
            if (v2 != null) {
                v2.g();
            }
        }

        @Override // com.ironsource.K2
        public void b(@NotNull I2 i2) {
            i2.getClass();
            IronLog.INTERNAL.verbose(S2.this.a(i2.q()));
            V2 v2 = (V2) S2.this.j.get();
            if (v2 != null) {
                v2.j();
            }
        }

        @Override // com.ironsource.K2
        public void c(@NotNull I2 i2) {
            i2.getClass();
            IronLog.INTERNAL.verbose(S2.this.a(i2.q()));
            V2 v2 = (V2) S2.this.j.get();
            if (v2 != null) {
                v2.h();
            }
        }

        @Override // com.ironsource.AbstractC4929q0.a, com.ironsource.E
        public void b(@NotNull A a) {
            a.getClass();
            super.b(a);
            LevelPlayAdInfo levelPlayAdInfoE = a.e();
            S2.this.i.a(levelPlayAdInfoE);
            InterfaceC5090z0 interfaceC5090z0I = S2.this.i();
            if (interfaceC5090z0I != null) {
                interfaceC5090z0I.a(levelPlayAdInfoE);
            }
        }
    }

    @Override // com.ironsource.AbstractC4929q0
    @NotNull
    public C4964s0 b() {
        return new Z2(this.l.b(), a(l()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(@NotNull C4911p0 c4911p0, @NotNull T2 t2, @NotNull V2 v2, @NotNull C4705d9 c4705d9) {
        String str;
        String str2;
        int iB;
        super(c4911p0, t2, v2);
        c4911p0.getClass();
        t2.getClass();
        v2.getClass();
        c4705d9.getClass();
        this.i = c4705d9;
        this.j = new WeakReference<>(v2);
        this.k = new a();
        this.l = t2;
        C4870md c4870mdG = g();
        IronLog.INTERNAL.verbose("placement = " + c4870mdG);
        if (c4870mdG != null && !TextUtils.isEmpty(c4870mdG.c())) {
            str2 = null;
            iB = 510;
        } else {
            if (c4870mdG == null) {
                str = "placement is null";
            } else {
                str = "placement name is empty";
            }
            str2 = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{str}, 1));
            iB = A0.b(t2.b().a());
        }
        if (str2 != null) {
            IronLog.API.error(a(str2));
            a(iB, str2);
        }
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        if (iSBannerSize.isSmart()) {
            if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
                return com.ironsource.mediationsdk.j.a();
            }
            return ISBannerSize.BANNER;
        }
        return iSBannerSize;
    }

    private final ISBannerSize l() {
        return f().a(this.l.b().i());
    }

    public final void a(@Nullable Bg bg, @NotNull InterfaceC5090z0 interfaceC5090z0) {
        interfaceC5090z0.getClass();
        if (bg != null) {
            a(new M2(bg), interfaceC5090z0);
        }
    }

    @Override // com.ironsource.AbstractC4929q0
    @NotNull
    public D a() {
        return new sj0(this, 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A a(S2 s2, B b, H h) {
        b.getClass();
        h.getClass();
        return new I2(new T0(s2.f(), E0.b.PROVIDER), b, h, s2.k);
    }
}
