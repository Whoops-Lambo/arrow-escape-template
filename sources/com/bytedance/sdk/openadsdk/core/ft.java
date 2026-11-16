package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ft {
    public static ConcurrentHashMap<Integer, ft> kgy = new ConcurrentHashMap<>();
    private int ct;
    private String noq;
    private int uq;
    private String ahm = "";
    private String rz = "";

    public static void ahm(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        if (ioyVar == null || TextUtils.isEmpty(ioyVar.bcr())) {
            return;
        }
        int iWs = ioyVar.ws();
        Integer numValueOf = Integer.valueOf(iWs);
        if (iWs == 0) {
            return;
        }
        if (kgy == null) {
            kgy = new ConcurrentHashMap<>();
        }
        ft ftVar = kgy.containsKey(numValueOf) ? kgy.get(numValueOf) : null;
        if (ftVar == null) {
            ftVar = new ft();
        }
        String strWh = ioyVar.wh();
        if (TextUtils.isEmpty(strWh) || !strWh.equals(ftVar.kgy())) {
            ftVar.noq();
            ftVar.kgy(ioyVar);
            kgy.put(numValueOf, ftVar);
        }
    }

    private void noq() {
        this.ahm = "";
        this.rz = "";
        this.uq = 0;
        this.ct = 0;
    }

    public static void rz(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        ft ftVar;
        if (ioyVar == null) {
            return;
        }
        int iWs = ioyVar.ws();
        Integer numValueOf = Integer.valueOf(iWs);
        if (iWs == 0) {
            return;
        }
        if (kgy == null) {
            kgy = new ConcurrentHashMap<>();
        }
        if (!kgy.containsKey(numValueOf) || (ftVar = kgy.get(numValueOf)) == null) {
            return;
        }
        ftVar.kgy(1);
    }

    public int ct() {
        return this.ct;
    }

    public void kgy(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        if (ioyVar != null) {
            String strWh = ioyVar.wh();
            if (!TextUtils.isEmpty(strWh)) {
                this.noq = strWh;
            }
            String strWn = ioyVar.wn();
            if (TextUtils.isEmpty(strWn) && ioyVar.ug()) {
                strWn = ioyVar.gjn().gf();
            }
            if (!TextUtils.isEmpty(strWn)) {
                String[] strArrSplit = strWn.split("/");
                if (strArrSplit.length >= 3) {
                    this.ahm = strArrSplit[2];
                }
            }
            if (ioyVar.yv() == null || TextUtils.isEmpty(ioyVar.yv().rz())) {
                return;
            }
            this.rz = ioyVar.yv().rz();
        }
    }

    public int uq() {
        return this.uq;
    }

    public static void rz(int i) {
        ft ftVar;
        if (i == 0) {
            return;
        }
        if (kgy == null) {
            kgy = new ConcurrentHashMap<>();
        }
        if (!kgy.containsKey(Integer.valueOf(i)) || (ftVar = kgy.get(Integer.valueOf(i))) == null) {
            return;
        }
        ftVar.ahm(1);
    }

    public String rz() {
        return this.rz;
    }

    public void kgy(int i) {
        this.uq = i;
    }

    public String kgy() {
        return this.noq;
    }

    public void ahm(int i) {
        this.ct = i;
    }

    public String ahm() {
        return this.ahm;
    }
}
