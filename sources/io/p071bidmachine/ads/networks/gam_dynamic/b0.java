package io.p071bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.UInt64Value;
import defpackage.l83;
import defpackage.lu0;
import defpackage.o62;
import io.p071bidmachine.AdsFormat;
import io.p071bidmachine.core.a;
import io.p071bidmachine.core.j;
import io.p071bidmachine.protobuf.Waterfall;
import io.p071bidmachine.util.taskmanager.coroutine.b;
import io.p071bidmachine.utils.i;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b0 {
    public static final b w = new b();
    public final Context b;
    public final e c;
    public final AdsFormat d;
    public final io.p071bidmachine.ads.networks.gam_dynamic.versions.b e;
    public final m f;
    public final d g;
    public final i h;
    public final w i;
    public String o;
    public String p;
    public int q;
    public int r;
    public int s;
    public long t;
    public StringValue u;
    public e0 v;
    public final i a = new i("GAMDynamicWaterfallController");
    public final LinkedList j = new LinkedList();
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final AtomicInteger n = new AtomicInteger(0);

    public final void a() {
        this.m.set(false);
        this.v = new e0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.o, this.j, this.q, new a0(this));
        long jPow = (long) (Math.pow(this.r, Math.min(this.n.get(), this.s)) * 1000.0d);
        o62 o62Var = new o62(this, jPow, 2);
        i iVar = this.a;
        a.b(iVar, o62Var);
        if (this.i.a(jPow, this.v)) {
            return;
        }
        a.b(iVar, new y(this, 0));
        a.b(iVar, new y(this, 1));
        this.v = null;
        this.k.set(false);
    }

    public final void b(String str) {
        a.b(this.a, new lu0(28, this, str));
        a();
    }

    public b0(Context context, e eVar, AdsFormat adsFormat, Waterfall.Configuration configuration, io.p071bidmachine.ads.networks.gam_dynamic.versions.b bVar, m mVar, d dVar, i iVar, w wVar) {
        this.b = context.getApplicationContext();
        this.c = eVar;
        this.d = adsFormat;
        this.e = bVar;
        this.f = mVar;
        this.g = dVar;
        this.i = wVar;
        this.h = iVar;
        c(configuration);
    }

    public final void c(Waterfall.Configuration configuration) {
        StringValue refreshUrl;
        UInt32Value cacheSize;
        int value;
        UInt32Value retryBase;
        int value2;
        UInt32Value maxRetryDegree;
        int value3;
        UInt64Value refreshTimeout;
        long value4;
        this.o = configuration.getId();
        LinkedList linkedList = this.j;
        linkedList.clear();
        List<Waterfall.Configuration.AdUnit> adUnitsList = configuration.getAdUnitsList();
        if (adUnitsList != null && !adUnitsList.isEmpty()) {
            linkedList.addAll(adUnitsList);
            Collections.sort(linkedList, new l83(10));
        }
        StringValue serverParams = null;
        if (configuration.hasRefreshUrl()) {
            refreshUrl = configuration.getRefreshUrl();
        } else {
            refreshUrl = null;
        }
        if (refreshUrl != null) {
            String value5 = refreshUrl.getValue();
            if (!TextUtils.isEmpty(value5) && j.i(value5)) {
                this.p = refreshUrl.getValue();
            }
        }
        if (configuration.hasCacheSize()) {
            cacheSize = configuration.getCacheSize();
        } else {
            cacheSize = null;
        }
        if (cacheSize != null) {
            value = cacheSize.getValue();
        } else {
            value = 1;
        }
        this.q = value;
        if (configuration.hasRetryBase()) {
            retryBase = configuration.getRetryBase();
        } else {
            retryBase = null;
        }
        if (retryBase != null) {
            value2 = retryBase.getValue();
        } else {
            value2 = 2;
        }
        this.r = value2;
        if (configuration.hasMaxRetryDegree()) {
            maxRetryDegree = configuration.getMaxRetryDegree();
        } else {
            maxRetryDegree = null;
        }
        if (maxRetryDegree != null) {
            value3 = maxRetryDegree.getValue();
        } else {
            value3 = 5;
        }
        this.s = value3;
        if (configuration.hasRefreshTimeout()) {
            refreshTimeout = configuration.getRefreshTimeout();
        } else {
            refreshTimeout = null;
        }
        if (refreshTimeout != null) {
            value4 = refreshTimeout.getValue();
        } else {
            value4 = 10000;
        }
        this.t = value4;
        if (configuration.hasServerParams()) {
            serverParams = configuration.getServerParams();
        }
        this.u = serverParams;
    }
}
