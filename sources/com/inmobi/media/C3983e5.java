package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.ContextData;
import defpackage.cg0;
import defpackage.qb3;
import defpackage.tb5;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.e5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3983e5 {
    public final ContextData a;
    public final long b;
    public final String c = "e5";
    public final C4206m5 d = new C4206m5();
    public long e = -1;
    public final AtomicBoolean f = new AtomicBoolean();
    public final AtomicBoolean g = new AtomicBoolean();

    public static final void a(C3983e5 c3983e5) {
        C4178l5 c4178l5 = C4178l5.a;
        C4206m5 c4206m5 = c3983e5.d;
        c4206m5.getClass();
        synchronized (c4178l5) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long expiryTime = jCurrentTimeMillis - ((long) (C4178l5.c().getContextualData().getExpiryTime() * 1000));
            C4178l5.a(expiryTime, C4178l5.c().getContextualData().getMaxAdRecords() - 1);
            String string = AbstractC4234n5.a(c4206m5, C4178l5.c().getContextualData().getSkipFields()).toString();
            string.getClass();
            C4511x6 c4511x6 = new C4511x6(AbstractC4538y6.b(string, C4178l5.e), jCurrentTimeMillis);
            C4178l5.c.add(c4511x6);
            Object objClone = C4178l5.c.clone();
            objClone.getClass();
            C4178l5.d = (LinkedList) objClone;
            tb5.y(cg0.a, new C4122j5(c4511x6, expiryTime, null));
        }
    }

    public final void c() {
        ContextData contextData;
        String advertisedContent;
        if (this.g.get() || (contextData = this.a) == null || (advertisedContent = contextData.getAdvertisedContent()) == null) {
            return;
        }
        C4206m5 c4206m5 = this.d;
        c4206m5.getClass();
        c4206m5.a = advertisedContent;
        this.c.getClass();
    }

    public final void d() {
        ContextData contextData;
        Long bidderId;
        if (this.g.get() || (contextData = this.a) == null || (bidderId = contextData.getBidderId()) == null) {
            return;
        }
        this.d.b = bidderId.longValue();
        this.c.getClass();
    }

    public final void e() {
        ContextData contextData;
        if (this.g.get() || (contextData = this.a) == null) {
            return;
        }
        this.d.f = contextData.getCasAdTypeId();
        this.c.getClass();
    }

    public final void f() {
        if (this.g.get()) {
            return;
        }
        this.d.g = 1;
        this.c.getClass();
    }

    public final void g() {
        if (this.g.get()) {
            return;
        }
        this.d.i = 1;
        this.c.getClass();
    }

    public final void h() {
        if (this.g.get()) {
            return;
        }
        this.d.h = 1;
        this.c.getClass();
    }

    public final void i() {
        if (this.g.get()) {
            return;
        }
        this.d.e = this.b;
        this.c.getClass();
    }

    public C3983e5(ContextData contextData, long j) {
        this.a = contextData;
        this.b = j;
    }

    public final void b() {
        if (!C4178l5.e()) {
            this.c.getClass();
            return;
        }
        if (!this.f.get()) {
            this.c.getClass();
            return;
        }
        a((int) (System.currentTimeMillis() - this.e));
        boolean andSet = this.g.getAndSet(true);
        String str = this.c;
        if (andSet) {
            str.getClass();
            return;
        }
        str.getClass();
        AbstractC4221mk.h.submit(new qb3(this, 17));
    }

    public final void a(long j) {
        if (this.g.get()) {
            return;
        }
        this.d.c = j;
        this.c.getClass();
    }

    public final void a(int i) {
        if (this.g.get()) {
            return;
        }
        this.d.d = i;
        this.c.getClass();
    }

    public final void a() {
        this.c.getClass();
        ContextData contextData = this.a;
        if (contextData != null) {
            C4178l5.a.a(contextData.getEnabled());
        }
        if (C4178l5.e() && !this.f.getAndSet(true)) {
            this.e = System.currentTimeMillis();
            c();
            d();
            i();
            e();
            a(this.e / 1000);
        }
    }
}
