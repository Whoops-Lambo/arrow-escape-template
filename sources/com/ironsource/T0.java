package com.ironsource;

import androidx.annotation.WorkerThread;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class T0 extends C4911p0 {

    @NotNull
    private final C4911p0 f;

    @NotNull
    private final Q0 g;

    @Nullable
    private InterfaceC4966s2 h;

    @NotNull
    public final Q0 h() {
        return this.g;
    }

    @Nullable
    public final InterfaceC4966s2 i() {
        return this.h;
    }

    @NotNull
    public final Q8.a l() {
        return Pb.w.a().i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(@NotNull C4911p0 c4911p0, @NotNull AbstractC5054x0 abstractC5054x0, @NotNull E0.b bVar) {
        super(c4911p0, bVar);
        c4911p0.getClass();
        abstractC5054x0.getClass();
        bVar.getClass();
        this.f = c4911p0;
        Q0 q0A = If.a(abstractC5054x0, abstractC5054x0.e().c());
        q0A.getClass();
        this.g = q0A;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> a(@NotNull B b) {
        b.getClass();
        return com.ironsource.mediationsdk.c.c().a(b.v(), b.i(), b.j().b().b());
    }

    @NotNull
    public final String e(@NotNull String str) {
        str.getClass();
        String strC = com.ironsource.mediationsdk.d.b().c(str);
        strC.getClass();
        return strC;
    }

    @Nullable
    public final String j() {
        return com.ironsource.mediationsdk.p.g().f();
    }

    @Nullable
    public final C4796ia k() {
        return If.a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(@NotNull T0 t0, @NotNull E0.b bVar) {
        super(t0, bVar);
        t0.getClass();
        bVar.getClass();
        this.f = t0.f;
        this.g = t0.g;
        this.h = t0.h;
    }

    public final void a(@WorkerThread @NotNull com.ironsource.environment.thread.a aVar) {
        aVar.getClass();
        Jf.a.b(aVar);
    }

    public final void a(@Nullable InterfaceC4966s2 interfaceC4966s2) {
        this.h = interfaceC4966s2;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.a aVar, @NotNull UUID uuid) {
        networkSettings.getClass();
        aVar.getClass();
        uuid.getClass();
        return com.ironsource.mediationsdk.c.c().a(networkSettings, aVar, uuid);
    }

    @NotNull
    public final String a(long j, @NotNull String str) {
        str.getClass();
        String strA = IronSourceUtils.a(j, str);
        strA.getClass();
        return strA;
    }
}
