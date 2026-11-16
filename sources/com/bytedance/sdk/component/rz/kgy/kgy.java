package com.bytedance.sdk.component.rz.kgy;

import android.os.SystemClock;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy {
    long ahm;
    long ct;
    long fi;
    long kgy = SystemClock.elapsedRealtime();
    long noq;
    long rz;
    long uq;
    long yo;

    public long at() {
        return this.fi;
    }

    public long fi() {
        return this.uq;
    }

    public long gf() {
        return this.ct;
    }

    public long kus() {
        return this.ahm;
    }

    public long noq() {
        return this.noq;
    }

    public long ra() {
        return this.yo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RequestHttpTime{requestBuildTs=");
        sb.append(this.kgy);
        sb.append(", asyncCallExecTs=");
        sb.append(this.ahm);
        sb.append(", requestStartExecTs=");
        sb.append(this.rz);
        sb.append(", requestConnectStartTs=");
        sb.append(this.uq);
        sb.append(", requestConnectFinishTs=");
        sb.append(this.ct);
        sb.append(", reqCallServerStartTs=");
        sb.append(this.yo);
        sb.append(", reqCallServerFinishTs=");
        return n30.o(sb, this.fi, '}');
    }

    public long uq() {
        return this.kgy;
    }

    public long yo() {
        return this.rz;
    }

    public void ahm() {
        this.uq = SystemClock.elapsedRealtime();
    }

    public void ct() {
        this.noq = SystemClock.elapsedRealtime();
    }

    public void kgy() {
        this.rz = SystemClock.elapsedRealtime();
    }

    public void nu() {
        this.yo = SystemClock.elapsedRealtime();
    }

    public void rz() {
        this.ct = SystemClock.elapsedRealtime();
    }

    public void twf() {
        this.fi = SystemClock.elapsedRealtime();
    }

    public void vs() {
        this.ahm = SystemClock.elapsedRealtime();
    }
}
