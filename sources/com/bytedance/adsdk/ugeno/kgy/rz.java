package com.bytedance.adsdk.ugeno.kgy;

import defpackage.nj;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class rz {
    private long ahm;
    private long ct;
    private String fi;
    private int gf = 1;
    private Map<String, TreeMap<Float, String>> kgy;
    private kgy noq;
    private JSONObject ra;
    private int rz;
    private String uq;
    private String yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public String ahm;
        public String kgy;
    }

    public Map<String, TreeMap<Float, String>> ahm() {
        return this.kgy;
    }

    public String ct() {
        return this.uq;
    }

    public String fi() {
        return this.yo;
    }

    public String gf() {
        return this.fi;
    }

    public JSONObject kgy() {
        return this.ra;
    }

    public long noq() {
        return this.ct;
    }

    public int ra() {
        return this.gf;
    }

    public long rz() {
        return this.ahm;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AnimationModel{mKeyFramesMap=");
        sb.append(this.kgy);
        sb.append(", mDuration=");
        sb.append(this.ahm);
        sb.append(", mPlayCount=");
        sb.append(this.rz);
        sb.append(", mPlayDirection=");
        sb.append(this.uq);
        sb.append(", mDelay=");
        sb.append(this.ct);
        sb.append(", mName=");
        sb.append(this.fi);
        sb.append(", mPlayState=");
        sb.append(this.gf);
        sb.append(", mTransformOrigin='");
        sb.append(this.noq);
        sb.append("', mTimingFunction='");
        return nj.q(sb, this.yo, "'}");
    }

    public int uq() {
        return this.rz;
    }

    public kgy yo() {
        return this.noq;
    }

    public void ahm(long j) {
        this.ct = j;
    }

    public void kgy(JSONObject jSONObject) {
        this.ra = jSONObject;
    }

    public void rz(String str) {
        this.fi = str;
    }

    public void ahm(String str) {
        this.yo = str;
    }

    public void kgy(Map<String, TreeMap<Float, String>> map) {
        this.kgy = map;
    }

    public void ahm(int i) {
        this.gf = i;
    }

    public void kgy(long j) {
        this.ahm = j;
    }

    public void kgy(int i) {
        this.rz = i;
    }

    public void kgy(String str) {
        this.uq = str;
    }

    public void kgy(kgy kgyVar) {
        this.noq = kgyVar;
    }
}
