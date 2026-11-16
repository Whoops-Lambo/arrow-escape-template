package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.j2;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.du;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class l {
    public final k a;
    public final com.vungle.ads.internal.model.b b;
    public final com.vungle.ads.internal.util.s c;
    public final int d;
    public final AtomicBoolean e;
    public final AtomicInteger f;
    public final List g;
    public j2 h;

    public final int b() {
        return this.f.get();
    }

    public final com.vungle.ads.internal.util.s c() {
        return this.c;
    }

    public final List d() {
        List list = this.g;
        list.getClass();
        return du.z0(list);
    }

    public final boolean e() {
        return this.e.get();
    }

    public final void f() {
        j2 j2Var = new j2(Sdk.SDKMetric.SDKMetricType.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.h = j2Var;
        j2Var.e();
    }

    public final void g() throws Throwable {
        j2 j2Var = this.h;
        if (j2Var != null) {
            j2Var.d();
            AnalyticsClient.INSTANCE.a(j2Var, this.c, this.b.b);
        }
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("DownloadRequest{priority=");
        sbA.append(this.a);
        sbA.append(", url='");
        sbA.append(this.b.b);
        sbA.append("', path='");
        sbA.append(this.b.c);
        sbA.append("', cancelled=");
        sbA.append(this.e);
        sbA.append(", retryAttempt=");
        sbA.append(this.f.get());
        sbA.append(", maxRetries=");
        sbA.append(this.d);
        sbA.append(", logEntry=");
        sbA.append(this.c);
        sbA.append('}');
        return sbA.toString();
    }

    public l(k kVar, com.vungle.ads.internal.model.b bVar, com.vungle.ads.internal.util.s sVar, int i) {
        kVar.getClass();
        bVar.getClass();
        this.a = kVar;
        this.b = bVar;
        this.c = sVar;
        this.d = i;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicInteger(0);
        this.g = Collections.synchronizedList(new ArrayList());
    }

    public final void a(String str) {
        str.getClass();
        this.g.add(str);
    }

    public final com.vungle.ads.internal.model.b a() {
        return this.b;
    }

    public /* synthetic */ l(k kVar, com.vungle.ads.internal.model.b bVar) {
        this(kVar, bVar, null, 3);
    }
}
