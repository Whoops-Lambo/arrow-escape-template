package com.bytedance.kgy;

import com.bytedance.kgy.kgy.ct;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class kgy<D> {
    private final String ahm;
    private D ct;
    private final long kgy = System.currentTimeMillis();
    private int noq;
    private InterfaceC0201kgy<D> rz;
    private int uq;

    /* JADX INFO: renamed from: com.bytedance.kgy.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0201kgy<T> {
        T kgy();
    }

    public abstract byte[] uq();

    public abstract int yo();

    public int ahm() {
        return this.uq;
    }

    public int ct() {
        return this.noq;
    }

    public long kgy() {
        return this.kgy;
    }

    public String noq() {
        return this.ahm;
    }

    public D rz() {
        InterfaceC0201kgy<D> interfaceC0201kgy;
        if (this.ct == null && (interfaceC0201kgy = this.rz) != null) {
            this.ct = interfaceC0201kgy.kgy();
        }
        return this.ct;
    }

    public String toString() {
        if (!ct.kgy) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder("AppEvent{, createTime=");
        sb.append(this.kgy);
        sb.append(", id=");
        sb.append(this.ahm);
        sb.append(", uploadRetryCount=");
        return h50.l(sb, this.noq, '}');
    }

    public kgy(String str, InterfaceC0201kgy<D> interfaceC0201kgy) {
        this.ahm = str;
        this.rz = interfaceC0201kgy;
    }

    public void ahm(int i) {
        this.noq = i;
    }

    public void kgy(int i) {
        this.uq = i;
    }

    public kgy(String str, D d) {
        this.ahm = str;
        this.ct = d;
    }
}
