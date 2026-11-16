package com.bytedance.sdk.component.noq.ahm.rz;

import com.bytedance.sdk.component.noq.nu;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class uq<T> implements nu {
    private String ahm;
    private int ct;
    private boolean fi;
    private boolean gf;
    private String kgy;
    private int noq;
    private int nu;
    private com.bytedance.sdk.component.noq.yo ra;
    private T rz;
    private T uq;
    private Map<String, String> yo;

    @Override // com.bytedance.sdk.component.noq.nu
    public T ahm() {
        return this.rz;
    }

    @Override // com.bytedance.sdk.component.noq.nu
    public boolean ct() {
        return this.fi;
    }

    public uq kgy(rz rzVar, T t) {
        this.rz = t;
        this.kgy = rzVar.fi();
        this.ahm = rzVar.kgy();
        this.ct = rzVar.ahm();
        this.noq = rzVar.rz();
        this.gf = rzVar.at();
        this.ra = rzVar.kus();
        this.nu = rzVar.vs();
        return this;
    }

    @Override // com.bytedance.sdk.component.noq.nu
    public boolean noq() {
        return this.gf;
    }

    @Override // com.bytedance.sdk.component.noq.nu
    public T rz() {
        return this.uq;
    }

    @Override // com.bytedance.sdk.component.noq.nu
    public Map<String, String> uq() {
        return this.yo;
    }

    @Override // com.bytedance.sdk.component.noq.nu
    public int yo() {
        return this.nu;
    }

    public uq kgy(rz rzVar, T t, Map<String, String> map, boolean z) {
        this.yo = map;
        this.fi = z;
        return kgy(rzVar, t);
    }

    @Override // com.bytedance.sdk.component.noq.nu
    public String kgy() {
        return this.ahm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.noq.nu
    public void kgy(Object obj) {
        this.uq = this.rz;
        this.rz = obj;
    }
}
