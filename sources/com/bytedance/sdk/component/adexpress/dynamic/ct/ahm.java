package com.bytedance.sdk.component.adexpress.dynamic.ct;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.ahm.twf;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import defpackage.q63;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ahm {
    private double ct;
    private String fi;
    private twf gf;
    private int noq;
    private double yo;
    public Map<String, rz> kgy = new HashMap();
    public Map<String, rz> ahm = new HashMap();
    public Map<String, rz> rz = new HashMap();
    private double uq = Math.random();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ct.ahm$ahm, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0203ahm {
        int ahm;
        float ct;
        float kgy;
        int rz;
        double uq;

        public static JSONObject kgy(C0203ahm c0203ahm) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c0203ahm.kgy);
                jSONObject.put("letterSpacing", c0203ahm.ahm);
                jSONObject.put("lineHeight", c0203ahm.uq);
                jSONObject.put("maxWidth", c0203ahm.ct);
                jSONObject.put("fontWeight", c0203ahm.rz);
                return jSONObject;
            } catch (JSONException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "eOEghRaobPWVRtJPyDevJk/ZJJEXtFrTmUbS", "T+EHhgyy", 793);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class rz {
        float ahm;
        float kgy;

        public String toString() {
            StringBuilder sb = new StringBuilder("UnitSize{width=");
            sb.append(this.kgy);
            sb.append(", height=");
            return h50.k(sb, this.ahm, '}');
        }

        public rz(float f, float f2) {
            this.kgy = f;
            this.ahm = f2;
        }

        public rz() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy implements Cloneable {
        boolean ahm;
        float kgy;
        float rz;

        public Object clone() {
            try {
                return (kgy) super.clone();
            } catch (CloneNotSupportedException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "eOEghRaobPWVRtJPyDesLUPHI5MM", "WOIimwY=", 810);
                return null;
            }
        }
    }

    private rz ct(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar, float f, float f2) {
        String str = fiVar.rz() + "_" + f + "_" + f2;
        if (this.rz.containsKey(str)) {
            return this.rz.get(str);
        }
        rz rzVarNoq = noq(fiVar, f, f2);
        this.rz.put(str, rzVarNoq);
        return rzVarNoq;
    }

    private rz noq(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar, float f, float f2) {
        new rz();
        com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt = fiVar.ra().ct();
        fiVar.ra().rz();
        noqVarCt.dpp();
        float fUm = noqVarCt.um();
        int iPxt = noqVarCt.pxt();
        double dCc = noqVarCt.cc();
        int iPft = noqVarCt.pft();
        boolean zDta = noqVarCt.dta();
        boolean zXrn = noqVarCt.xrn();
        int iTp = noqVarCt.tp();
        C0203ahm c0203ahm = new C0203ahm();
        c0203ahm.kgy = fUm;
        c0203ahm.ahm = iPxt;
        c0203ahm.rz = iPft;
        c0203ahm.uq = dCc;
        c0203ahm.ct = f;
        return kgy(fiVar.ra().rz(), c0203ahm, zDta, zXrn, iTp, fiVar);
    }

    public rz uq(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar, float f, float f2) {
        float fMin;
        float f3;
        float f4;
        rz rzVar = new rz();
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            rzVar.kgy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            rzVar.ahm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return rzVar;
        }
        if (fiVar.um()) {
            return kgy(fiVar, f, f2);
        }
        float fFi = fiVar.fi();
        float fGf = fiVar.gf();
        float fVs = fiVar.vs();
        float fDg = fiVar.dg();
        com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt = fiVar.ra().ct();
        String strWy = noqVarCt.wy();
        String strFt = noqVarCt.ft();
        float fMin2 = ((TextUtils.equals(strWy, "flex") || TextUtils.equals(strWy, "auto")) ? f : Math.min(fFi, f)) - fVs;
        if (TextUtils.equals(strFt, "scale")) {
            fMin = Math.round(fMin2 / fGf) + fDg;
            if (fMin > f2) {
                fMin2 = Math.round((f2 - fDg) * fGf);
            }
        } else {
            fMin = (TextUtils.equals(strFt, "auto") || TextUtils.equals(strFt, "flex")) ? f2 : Math.min(fGf, f2);
        }
        float f6 = fMin - fDg;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>> listXh = fiVar.xh();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list : listXh) {
            float f7 = f5;
            float f8 = fVs;
            rz rzVarAhm = ahm(list, fMin2, f6);
            if (ahm(list)) {
                f4 = f7 + 1.0f;
            } else {
                fMax = Math.max(fMax, rzVarAhm.kgy);
                f4 = f7;
            }
            float f9 = f4;
            float f10 = fMin2;
            fMax2 = fiVar.ra().ahm().equals("carousel") ? Math.max(fiVar.gf(), rzVarAhm.ahm) : fMax2 + rzVarAhm.ahm;
            fVs = f8;
            f5 = f9;
            fMin2 = f10;
        }
        float f11 = f5;
        float f12 = fMin2;
        float f13 = fVs;
        if (!TextUtils.equals(strWy, "auto")) {
            f3 = f12;
        } else if (f11 == listXh.size()) {
            f3 = f;
        } else {
            for (List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list2 : listXh) {
                rz(list2);
                ahm(list2, fMax, f6);
            }
            f3 = fMax;
        }
        if (TextUtils.equals(strFt, "auto")) {
            if (fMax2 <= f2) {
                f6 = fMax2;
            } else {
                kgy(listXh, f3, f6);
            }
        } else if ((TextUtils.equals(strFt, "fixed") || TextUtils.equals(strFt, "flex")) && f6 < fMax2) {
            kgy(listXh, f3, f6);
        }
        rzVar.kgy = Math.min(f3 + f13, f);
        rzVar.ahm = Math.min(f6 + fDg, f2);
        return rzVar;
    }

    public ahm(double d, int i, double d2, String str, twf twfVar) {
        this.ct = d;
        this.noq = i;
        this.yo = d2;
        this.fi = str;
        this.gf = twfVar;
    }

    private boolean ahm(List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>> listXh;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().ra().ct().wy(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar : list) {
                if (TextUtils.equals(fiVar.ra().ct().wy(), "auto") && (listXh = fiVar.xh()) != null) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>> it2 = listXh.iterator();
                    int i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> next = it2.next();
                            i++;
                            if (ahm(next)) {
                                if (i == next.size()) {
                                    z = true;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return z;
        }
    }

    private rz rz(List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list, float f, float f2) {
        float fMax;
        uq(list);
        rz rzVar = new rz();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt = fiVar.ra().ct();
            if (noqVarCt.qdr() == 1 || noqVarCt.qdr() == 2) {
                arrayList.add(fiVar);
            }
            if (noqVarCt.qdr() != 1 && noqVarCt.qdr() != 2) {
                arrayList2.add(fiVar);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            rz((com.bytedance.sdk.component.adexpress.dynamic.uq.fi) obj, f, f2);
        }
        if (arrayList2.size() <= 0) {
            return rzVar;
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            arrayList3.add(Float.valueOf(rz((com.bytedance.sdk.component.adexpress.dynamic.uq.fi) obj2, f, f2).kgy));
        }
        ArrayList arrayList4 = new ArrayList();
        int i3 = 0;
        while (true) {
            int size3 = arrayList2.size();
            fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i3 >= size3) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar2 = (com.bytedance.sdk.component.adexpress.dynamic.uq.fi) arrayList2.get(i3);
            String strWy = fiVar2.ra().ct().wy();
            float fFi = fiVar2.fi();
            boolean zEquals = TextUtils.equals(strWy, "flex");
            if (TextUtils.equals(strWy, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>> listXh = fiVar2.xh();
                if (listXh != null && listXh.size() > 0) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>> it = listXh.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (ahm(it.next())) {
                                zEquals = true;
                                break;
                            }
                        } else {
                            zEquals = false;
                            break;
                        }
                    }
                } else {
                    zEquals = false;
                    break;
                }
            }
            kgy kgyVar = new kgy();
            if (!zEquals) {
                fFi = ((Float) arrayList3.get(i3)).floatValue();
            }
            kgyVar.kgy = fFi;
            kgyVar.ahm = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i3)).floatValue();
            }
            kgyVar.rz = fMax;
            arrayList4.add(kgyVar);
            i3++;
        }
        kgy(arrayList4, f, arrayList2);
        List<kgy> listKgy = ra.kgy(f, arrayList4);
        float f3 = 0.0f;
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            f3 += listKgy.get(i4).kgy;
            if (((Float) arrayList3.get(i4)).floatValue() != listKgy.get(i4).kgy) {
                uq((com.bytedance.sdk.component.adexpress.dynamic.uq.fi) arrayList2.get(i4));
            }
        }
        int size4 = arrayList2.size();
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        while (i6 < size4) {
            Object obj3 = arrayList2.get(i6);
            i6++;
            i5++;
            if (!ahm((com.bytedance.sdk.component.adexpress.dynamic.uq.fi) obj3)) {
                z = false;
                break;
            }
            if (i5 == arrayList2.size()) {
                z = true;
            }
        }
        if (z) {
            fMax = f2;
        }
        ArrayList arrayList5 = new ArrayList();
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar3 = (com.bytedance.sdk.component.adexpress.dynamic.uq.fi) arrayList2.get(i7);
            rz rzVarRz = rz(fiVar3, listKgy.get(i7).kgy, f2);
            if (!ahm(fiVar3)) {
                fMax = Math.max(fMax, rzVarRz.ahm);
            }
            arrayList5.add(rzVarRz);
        }
        ArrayList arrayList6 = new ArrayList();
        int size5 = arrayList5.size();
        int i8 = 0;
        while (i8 < size5) {
            Object obj4 = arrayList5.get(i8);
            i8++;
            arrayList6.add(Float.valueOf(((rz) obj4).ahm));
        }
        if (!z) {
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar4 = (com.bytedance.sdk.component.adexpress.dynamic.uq.fi) arrayList2.get(i9);
                if (ahm(fiVar4) && ((Float) arrayList6.get(i9)).floatValue() != fMax) {
                    uq(fiVar4);
                    rz(fiVar4, listKgy.get(i9).kgy, fMax);
                }
            }
        }
        rzVar.kgy = f3;
        rzVar.ahm = fMax;
        return rzVar;
    }

    public rz kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar, float f, float f2) {
        float f3;
        if (TextUtils.isEmpty(fiVar.ra().rz()) && fiVar.ra().ct().xts() == null) {
            return new rz(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (q63.B(fiVar, "creative-playable-bait")) {
            return new rz(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        float fFi = fiVar.fi();
        float fGf = fiVar.gf();
        com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt = fiVar.ra().ct();
        String strWy = noqVarCt.wy();
        String strFt = noqVarCt.ft();
        float fTwf = fiVar.twf();
        float fKus = fiVar.kus();
        float fVs = fiVar.vs();
        float fDg = fiVar.dg();
        if (TextUtils.equals(strWy, "fixed")) {
            f = Math.min(fFi, f);
            if (TextUtils.equals(strFt, "auto")) {
                f3 = ahm(fiVar, f - fVs, f2 - fDg).ahm;
                fGf = f3 + fDg;
            }
        } else if (TextUtils.equals(strWy, "auto")) {
            rz rzVarAhm = ahm(fiVar, f - fVs, f2 - fDg);
            f = rzVarAhm.kgy + fVs;
            if (TextUtils.equals(strFt, "auto")) {
                f3 = rzVarAhm.ahm;
                fGf = f3 + fDg;
            }
        } else if (TextUtils.equals(strWy, "flex")) {
            if (TextUtils.equals(strFt, "auto")) {
                f3 = ahm(fiVar, f - fVs, f2 - fDg).ahm;
                fGf = f3 + fDg;
            }
        } else {
            f = fFi;
        }
        if (TextUtils.equals(strFt, "scale")) {
            float fRound = Math.round((f - fTwf) / fGf) + fKus;
            if (fRound > f2) {
                f = Math.round((f2 - fKus) * fGf) + fTwf;
            } else {
                f2 = fRound;
            }
        } else if (TextUtils.equals(strFt, "fixed")) {
            f2 = Math.min(fGf + fKus, f2);
        } else if (!TextUtils.equals(strFt, "flex")) {
            f2 = fGf;
        }
        rz rzVar = new rz();
        rzVar.kgy = f;
        rzVar.ahm = f2;
        return rzVar;
    }

    private String ct(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        return fiVar.rz();
    }

    public rz ahm(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar, float f, float f2) {
        rz rzVar = new rz();
        if (fiVar.ra().ct() == null) {
            return rzVar;
        }
        rz rzVarCt = ct(fiVar, f, f2);
        float f3 = rzVarCt.kgy;
        float f4 = rzVarCt.ahm;
        rzVar.kgy = Math.min(f3, f);
        rzVar.ahm = Math.min(f4, f2);
        return rzVar;
    }

    private rz ahm(List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list, float f, float f2) {
        rz rzVarKgy = kgy(list);
        if (rzVarKgy != null && (rzVarKgy.kgy != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rzVarKgy.ahm != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return rzVarKgy;
        }
        rz rzVarRz = rz(list, f, f2);
        kgy(list, rzVarRz);
        return rzVarRz;
    }

    private boolean ahm(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        if (fiVar == null) {
            return false;
        }
        if (TextUtils.equals(fiVar.ra().ct().ft(), "flex")) {
            return true;
        }
        return rz(fiVar);
    }

    private rz kgy(String str, C0203ahm c0203ahm, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        return nu.kgy(str, fiVar.ra().ahm(), C0203ahm.kgy(c0203ahm).toString(), z, z2, i, fiVar, this.ct, this.noq, this.yo, this.fi, this.gf);
    }

    private void kgy(List<List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>> list, float f, float f2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (kgy(it.next(), false)) {
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list2 : list) {
            kgy kgyVar = new kgy();
            boolean zKgy = kgy(list2, !z);
            kgyVar.kgy = zKgy ? 1.0f : ahm(list2, f, f2).ahm;
            kgyVar.ahm = !zKgy;
            arrayList.add(kgyVar);
        }
        List<kgy> listKgy = ra.kgy(f2, arrayList);
        for (int i = 0; i < list.size(); i++) {
            if (((kgy) arrayList.get(i)).kgy != listKgy.get(i).kgy) {
                List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list3 = list.get(i);
                rz(list3);
                ahm(list3, f, listKgy.get(i).kgy);
            }
        }
    }

    private boolean kgy(List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list, boolean z) {
        for (com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt = fiVar.ra().ct();
            String strFt = noqVarCt.ft();
            if (TextUtils.equals(strFt, "flex") || (z && ((TextUtils.equals(noqVarCt.wy(), "flex") && TextUtils.equals(noqVarCt.ft(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.uq.ct.kgy.get(fiVar.ra().ahm()).intValue() == 7) || TextUtils.equals(strFt, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> it = list.iterator();
        while (it.hasNext()) {
            if (rz(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void kgy(List<kgy> list, float f, List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list2) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (kgy kgyVar : list) {
            if (kgyVar.ahm) {
                f2 += kgyVar.kgy;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).ahm && list2.get(i2).ay()) {
                    i++;
                }
            }
            if (i > 0) {
                float fCeil = (float) (Math.ceil(((f2 - f) / i) * 1000.0f) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    kgy kgyVar2 = list.get(i3);
                    if (kgyVar2.ahm && list2.get(i3).ay()) {
                        kgyVar2.kgy -= fCeil;
                    }
                }
            }
        }
    }

    public void kgy() {
        this.rz.clear();
        this.kgy.clear();
        this.ahm.clear();
    }

    public rz kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        return this.kgy.get(ct(fiVar));
    }

    public rz kgy(List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list) {
        return this.ahm.get(uq(list));
    }

    private void kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar, rz rzVar) {
        this.kgy.put(ct(fiVar), rzVar);
    }

    private void kgy(List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list, rz rzVar) {
        this.ahm.put(uq(list), rzVar);
    }

    private void uq(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        this.kgy.remove(ct(fiVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>> listXh = fiVar.xh();
        if (listXh == null || listXh.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>> it = listXh.iterator();
        while (it.hasNext()) {
            rz(it.next());
        }
    }

    private String uq(List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String strRz = list.get(i).rz();
            if (i < list.size() - 1) {
                sb.append(strRz);
                sb.append("-");
            } else {
                sb.append(strRz);
            }
        }
        return sb.toString();
    }

    public rz rz(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar, float f, float f2) {
        if (fiVar == null) {
            return null;
        }
        rz rzVarKgy = kgy(fiVar);
        if (rzVarKgy != null && (rzVarKgy.kgy != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rzVarKgy.ahm != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return rzVarKgy;
        }
        rz rzVarUq = uq(fiVar, f, f2);
        kgy(fiVar, rzVarUq);
        return rzVarUq;
    }

    private boolean rz(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>> listXh;
        if (!fiVar.um() && TextUtils.equals(fiVar.ra().ct().ft(), "auto") && (listXh = fiVar.xh()) != null && listXh.size() > 0) {
            if (listXh.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> it = listXh.get(0).iterator();
                while (it.hasNext()) {
                    if (!ahm(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>> it2 = listXh.iterator();
            while (it2.hasNext()) {
                if (kgy(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void rz(List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.ahm.remove(uq(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> it = list.iterator();
        while (it.hasNext()) {
            uq(it.next());
        }
    }
}
