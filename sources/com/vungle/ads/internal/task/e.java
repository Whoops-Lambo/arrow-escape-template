package com.vungle.ads.internal.task;

import android.os.Bundle;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements Cloneable {
    public final String a;
    public boolean b;
    public long c;
    public Bundle d;
    public int e;

    public final e h() {
        this.e = 0;
        return this;
    }

    public final long b() {
        return this.c;
    }

    public final Bundle c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final int e() {
        return this.e;
    }

    public final boolean f() {
        return this.b;
    }

    public final void g() {
        this.c = 0L;
    }

    public e(String str) {
        str.getClass();
        this.a = str;
        this.d = new Bundle();
        this.e = 2;
    }

    public final e a() {
        try {
            Object objClone = super.clone();
            objClone.getClass();
            return (e) objClone;
        } catch (CloneNotSupportedException e) {
            boolean z = u.a;
            t.a("JobInfo", "Cannot copy JobInfo " + this, e);
            return null;
        }
    }

    public final Object clone() {
        return super.clone();
    }

    public final e a(Bundle bundle) {
        bundle.getClass();
        this.d = bundle;
        return this;
    }

    public final e a(boolean z) {
        this.b = z;
        return this;
    }
}
