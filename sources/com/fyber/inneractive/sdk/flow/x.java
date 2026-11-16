package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class x {
    public InneractiveAdRequest a;
    public com.fyber.inneractive.sdk.response.e b;
    public final com.fyber.inneractive.sdk.config.global.r c;
    public final com.fyber.inneractive.sdk.config.x0 d;
    public boolean e = false;
    public boolean f = false;

    public com.fyber.inneractive.sdk.web.v0 a() {
        return null;
    }

    public boolean c() {
        return false;
    }

    public abstract boolean d();

    public abstract void destroy();

    public void e() {
    }

    public abstract boolean isVideoAd();

    public boolean b() {
        com.fyber.inneractive.sdk.config.x0 x0Var = this.d;
        if (x0Var == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config null", IAlog.a(this));
            return false;
        }
        return false;
    }

    public x(com.fyber.inneractive.sdk.config.x0 x0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.d = x0Var;
        this.c = rVar;
    }

    public void a(String str) {
    }

    public boolean a(boolean z, com.fyber.inneractive.sdk.util.g gVar) {
        return false;
    }
}
