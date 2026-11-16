package com.bytedance.sdk.component.yo.kgy.uq.kgy;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class kgy implements com.bytedance.sdk.component.yo.kgy.uq.kgy {
    private ahm ahm;
    private int at;
    private byte ct;
    private long fi;
    private String gf;
    protected JSONObject kgy;
    private long noq;
    private String nu;
    private byte ra;
    private int rz;
    private byte uq;
    private long yo;

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public synchronized JSONObject noq() {
        ahm ahmVar;
        try {
            if (this.kgy == null && (ahmVar = this.ahm) != null) {
                this.kgy = ahmVar.kgy(nu());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.kgy;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public byte ahm() {
        return this.ra;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public byte ct() {
        return this.ct;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public long fi() {
        return this.yo;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public int gf() {
        return this.at;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public ahm kgy() {
        return this.ahm;
    }

    public String nu() {
        return this.nu;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public int ra() {
        return this.rz;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public String rz() {
        return this.gf;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public byte uq() {
        return this.uq;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public long yo() {
        return this.noq;
    }

    public kgy(String str, JSONObject jSONObject) {
        this.gf = str;
        this.kgy = jSONObject;
    }

    public void ahm(byte b) {
        this.uq = b;
    }

    public void kgy(byte b) {
        this.ra = b;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public void rz(long j) {
        this.fi = j;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public void ahm(long j) {
        this.yo = j;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public void kgy(long j) {
        this.noq = j;
    }

    public void rz(byte b) {
        this.ct = b;
    }

    public void ahm(int i) {
        this.at = i;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy
    public void kgy(int i) {
        this.rz = i;
    }

    public kgy(String str, ahm ahmVar) {
        this.gf = str;
        this.ahm = ahmVar;
    }

    private kgy() {
    }
}
