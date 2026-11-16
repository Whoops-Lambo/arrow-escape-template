package com.ironsource.mediationsdk;

import com.ironsource.C4687c9;
import com.ironsource.C4796ia;
import com.ironsource.C5074y2;
import com.ironsource.Db;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class k {
    private HashSet<ImpressionDataListener> a;
    protected com.ironsource.r b;
    protected C4796ia c;
    protected AdInfo d;

    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }

    public void c() {
        this.d = null;
    }

    public void a(C5074y2 c5074y2, String str) {
        HashSet<ImpressionDataListener> hashSet;
        if (c5074y2 == null) {
            IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
            return;
        }
        C4687c9 c4687c9A = c5074y2.a(str);
        if (c4687c9A != null) {
            synchronized (this) {
                hashSet = (HashSet) this.a.clone();
            }
            for (ImpressionDataListener impressionDataListener : hashSet) {
                IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + c4687c9A);
                impressionDataListener.onImpressionSuccess(c4687c9A);
            }
        }
    }

    public k(HashSet<ImpressionDataListener> hashSet, C4796ia c4796ia) {
        new HashSet();
        this.a = hashSet;
        this.b = new com.ironsource.r();
        this.c = c4796ia;
    }

    public void b() {
        synchronized (this) {
            this.a.clear();
        }
    }

    public void a(C4796ia c4796ia) {
        this.c = c4796ia;
    }

    public void a(C4687c9 c4687c9, Db db) {
        if (c4687c9 != null) {
            this.d = new AdInfo(c4687c9, db);
        }
    }

    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.add(impressionDataListener);
        }
    }

    public String a() {
        return "fallback_" + System.currentTimeMillis();
    }

    public void a(JSONObject jSONObject, IronSource.a aVar) {
        this.b.a(aVar, jSONObject != null ? jSONObject.optBoolean(d.f, false) : false);
    }

    public void a(IronSource.a aVar) {
        this.b.a(aVar, false);
    }
}
