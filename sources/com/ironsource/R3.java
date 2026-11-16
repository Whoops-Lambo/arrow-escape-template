package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class R3 {
    private boolean a = true;
    private IronSourceError b = null;

    public void a(IronSourceError ironSourceError) {
        this.a = false;
        this.b = ironSourceError;
    }

    public void c() {
        this.a = true;
        this.b = null;
    }

    public boolean b() {
        return this.a;
    }

    public String toString() {
        boolean zB = b();
        boolean z = this.a;
        if (zB) {
            return h50.j("valid:", z);
        }
        return "valid:" + z + ", IronSourceError:" + this.b;
    }

    public IronSourceError a() {
        return this.b;
    }
}
