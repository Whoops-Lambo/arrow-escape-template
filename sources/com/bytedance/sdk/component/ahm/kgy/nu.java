package com.bytedance.sdk.component.ahm.kgy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class nu implements Cloneable {
    public long ahm;
    public TimeUnit ct;
    public final com.bytedance.sdk.component.fi.kgy.ahm fi;
    public List<fi> kgy;
    public long noq;
    public TimeUnit rz;
    public long uq;
    public TimeUnit yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class kgy {
        com.bytedance.sdk.component.fi.kgy.ahm ahm;
        public long ct;
        public TimeUnit fi;
        public final List<fi> kgy;
        public TimeUnit noq;
        public long rz;
        public TimeUnit uq;
        public long yo;

        public kgy ahm(long j, TimeUnit timeUnit) {
            this.ct = j;
            this.noq = timeUnit;
            return this;
        }

        public kgy kgy(fi fiVar) {
            this.kgy.add(fiVar);
            return this;
        }

        public kgy rz(long j, TimeUnit timeUnit) {
            this.yo = j;
            this.fi = timeUnit;
            return this;
        }

        public kgy(nu nuVar) {
            this.kgy = new ArrayList();
            this.rz = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.uq = timeUnit;
            this.ct = 10000L;
            this.noq = timeUnit;
            this.yo = 10000L;
            this.fi = timeUnit;
            this.rz = nuVar.ahm;
            this.uq = nuVar.rz;
            this.ct = nuVar.uq;
            this.noq = nuVar.ct;
            this.yo = nuVar.noq;
            this.fi = nuVar.yo;
        }

        public kgy kgy(long j, TimeUnit timeUnit) {
            this.rz = j;
            this.uq = timeUnit;
            return this;
        }

        public kgy kgy(com.bytedance.sdk.component.fi.kgy.ahm ahmVar) {
            this.ahm = ahmVar;
            return this;
        }

        public nu kgy() {
            return com.bytedance.sdk.component.ahm.kgy.kgy.kgy.kgy(this);
        }

        public kgy(String str) {
            this.kgy = new ArrayList();
            this.rz = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.uq = timeUnit;
            this.ct = 10000L;
            this.noq = timeUnit;
            this.yo = 10000L;
            this.fi = timeUnit;
        }

        public kgy() {
            this.kgy = new ArrayList();
            this.rz = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.uq = timeUnit;
            this.ct = 10000L;
            this.noq = timeUnit;
            this.yo = 10000L;
            this.fi = timeUnit;
        }
    }

    public abstract uq ahm();

    public abstract ahm kgy(at atVar);

    public com.bytedance.sdk.component.fi.kgy.ahm kgy() {
        return this.fi;
    }

    public kgy rz() {
        return new kgy(this);
    }

    public nu(kgy kgyVar) {
        this.ahm = kgyVar.rz;
        this.uq = kgyVar.ct;
        this.noq = kgyVar.yo;
        List<fi> list = kgyVar.kgy;
        this.rz = kgyVar.uq;
        this.ct = kgyVar.noq;
        this.yo = kgyVar.fi;
        this.kgy = list;
        this.fi = kgyVar.ahm;
    }
}
