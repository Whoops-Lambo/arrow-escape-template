package com.bytedance.sdk.component.adexpress.dynamic.ct;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.ahm.twf;
import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.UserDetailsUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ct {
    protected ahm ahm;
    public com.bytedance.sdk.component.adexpress.dynamic.uq.ahm kgy;
    private com.bytedance.sdk.component.adexpress.dynamic.uq.fi rz;
    private kgy uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        float ahm;
        float kgy;
        float rz;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0340  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0219  */
    public com.bytedance.sdk.component.adexpress.dynamic.uq.ahm kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.ahm ahmVar, float f) {
        float fKgy;
        float fKgy2;
        float fKgy3;
        float fKgy4;
        float f2;
        com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar = ahmVar.noq;
        if (fiVar != null) {
            fiVar.gm();
            List<List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>> listXh = fiVar.xh();
            if (listXh != null && listXh.size() > 0) {
                com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt = fiVar.ra().ct();
                float fXh = noqVarCt.xh();
                float fDg = noqVarCt.dg();
                float fKus = noqVarCt.kus();
                float fVs = noqVarCt.vs();
                float fAt = noqVarCt.at();
                String strWl = noqVarCt.wl();
                String strGbb = noqVarCt.gbb();
                float f3 = ahmVar.kgy + fVs;
                float f4 = ahmVar.ahm + fXh;
                float f5 = (ahmVar.rz - fVs) - fDg;
                float f6 = 2.0f;
                float f7 = fAt * 2.0f;
                float f8 = f5 - f7;
                float f9 = ((ahmVar.uq - fXh) - fKus) - f7;
                com.bytedance.sdk.component.adexpress.dynamic.uq.gf gfVar = new com.bytedance.sdk.component.adexpress.dynamic.uq.gf(f3, f4);
                if (ahmVar.yo == null) {
                    ahmVar.yo = new ArrayList();
                }
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>> it = listXh.iterator();
                float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                while (it.hasNext()) {
                    float f11 = f6;
                    ahm.rz rzVarKgy = this.ahm.kgy(it.next());
                    if (rzVarKgy != null) {
                        f10 += rzVarKgy.ahm;
                    }
                    f6 = f11;
                }
                float f12 = f6;
                String str = "space-between";
                String str2 = "space-around";
                int i = 1;
                if (f10 >= f9) {
                    fKgy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    fKgy2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    if (TextUtils.equals(strGbb, "center")) {
                        fKgy2 = (f9 - f10) / f12;
                    } else if (TextUtils.equals(strGbb, "flex-end")) {
                        fKgy2 = f9 - f10;
                    } else if (TextUtils.equals(strGbb, "space-around")) {
                        fKgy2 = ra.kgy((f9 - f10) / (listXh.size() + 1));
                        fKgy = fKgy2;
                    } else {
                        if (!TextUtils.equals(strGbb, "space-between") || listXh.size() <= 1) {
                            fKgy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            fKgy = ra.kgy((f9 - f10) / (listXh.size() - 1));
                        }
                        fKgy2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    fKgy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                gfVar.ahm += fKgy2;
                float f13 = f;
                int i2 = 0;
                while (i2 < listXh.size()) {
                    List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> list = listXh.get(i2);
                    i2++;
                    int i3 = i;
                    if (i2 >= ahmVar.yo.size()) {
                        int i4 = 0;
                        for (int size = (i2 - ahmVar.yo.size()) + 1; i4 < size; size = size) {
                            ahmVar.yo.add(new ArrayList());
                            i4++;
                        }
                    }
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> it2 = list.iterator();
                    float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    while (true) {
                        it2 = it2;
                        if (!it2.hasNext()) {
                            break;
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.uq.fi next = it2.next();
                        com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt2 = next.ra().ct();
                        float f15 = f14;
                        String strWy = noqVarCt2.wy();
                        float f16 = fKgy;
                        int iQdr = noqVarCt2.qdr();
                        f13 = f13;
                        if (TextUtils.equals(strWy, "flex") || iQdr == i3 || iQdr == 2) {
                            f14 = f15;
                        } else {
                            ahm.rz rzVarKgy2 = this.ahm.kgy(next);
                            f14 = rzVarKgy2 != null ? f15 + rzVarKgy2.kgy : f15;
                        }
                        fKgy = f16;
                        i3 = 1;
                    }
                    float f17 = fKgy;
                    float f18 = f13;
                    float fMax = Math.max(f8 - f14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> it3 = list.iterator();
                    float f19 = 0.0f;
                    while (it3.hasNext()) {
                        com.bytedance.sdk.component.adexpress.dynamic.uq.fi next2 = it3.next();
                        com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt3 = next2.ra().ct();
                        it3 = it3;
                        float f20 = f19;
                        if (noqVarCt3.qdr() == 1 || noqVarCt3.qdr() == 2) {
                            f19 = f20;
                        } else {
                            ahm.rz rzVarKgy3 = this.ahm.kgy(next2);
                            f19 = rzVarKgy3 != null ? f20 + rzVarKgy3.kgy : f20;
                        }
                    }
                    float f21 = f19;
                    if (f21 >= f8) {
                        fKgy3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        fKgy4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        if (TextUtils.equals(strWl, "center")) {
                            fKgy3 = (f8 - f21) / f12;
                        } else if (TextUtils.equals(strWl, "flex-end")) {
                            fKgy3 = f8 - f21;
                        } else if (TextUtils.equals(strWl, str2)) {
                            fKgy3 = ra.kgy((f8 - f21) / (list.size() + 1));
                            fKgy4 = fKgy3;
                        } else if (!TextUtils.equals(strWl, str) || list.size() <= 1) {
                            fKgy3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            fKgy4 = ra.kgy((f8 - f21) / (list.size() - 1.0f));
                            fKgy3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fKgy4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    gfVar.kgy += fKgy3;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> it4 = list.iterator();
                    float fMax2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    while (it4.hasNext()) {
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> it5 = it4;
                        com.bytedance.sdk.component.adexpress.dynamic.uq.fi next3 = it4.next();
                        float f22 = fKgy4;
                        float f23 = this.ahm.kgy(next3) != null ? this.ahm.kgy(next3).ahm : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt4 = next3.ra().ct();
                        fMax2 = Math.max(fMax2, (noqVarCt4.qdr() == 1 || noqVarCt4.qdr() == 2) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f23);
                        it4 = it5;
                        fKgy4 = f22;
                    }
                    float f24 = fKgy4;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> it6 = list.iterator();
                    while (it6.hasNext()) {
                        com.bytedance.sdk.component.adexpress.dynamic.uq.fi next4 = it6.next();
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> it7 = it6;
                        ahm.rz rzVarKgy4 = this.ahm.kgy(next4);
                        String str3 = str;
                        com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt5 = next4.ra().ct();
                        String str4 = strWl;
                        float fLb = noqVarCt5.lb();
                        float fSm = noqVarCt5.sm();
                        float fJc = noqVarCt5.jc();
                        float fGg = noqVarCt5.gg();
                        float f25 = rzVarKgy4 == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : rzVarKgy4.kgy;
                        float f26 = rzVarKgy4 == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : rzVarKgy4.ahm;
                        float f27 = f25;
                        float f28 = TextUtils.equals(fiVar.rz(), "root") ? i2 : f18;
                        float f29 = fMax2;
                        com.bytedance.sdk.component.adexpress.dynamic.uq.gf gfVarKgy = noqVarCt5.qdr() == 2 ? kgy(noqVarCt5, this.ahm.kgy(this.rz), new ahm.rz((f27 - fSm) - fGg, (f26 - fLb) - fJc)) : noqVarCt5.qdr() == 1 ? kgy(ahmVar, noqVarCt5, (f27 - fSm) - fGg, (f26 - fLb) - fJc) : gfVar;
                        String strBgd = noqVarCt.bgd();
                        if (f29 <= f26 || TextUtils.equals(strBgd, "flex-start")) {
                            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            strBgd.getClass();
                            if (strBgd.equals("center")) {
                                f2 = (f29 - f26) / f12;
                            } else if (strBgd.equals("flex-end")) {
                                f2 = f29 - f26;
                            } else {
                                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            }
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.uq.ahm ahmVar2 = new com.bytedance.sdk.component.adexpress.dynamic.uq.ahm();
                        ahmVar2.kgy = gfVarKgy.kgy + fGg;
                        ahmVar2.ahm = gfVarKgy.ahm + fLb + f2;
                        ahmVar2.rz = (f27 - fSm) - fGg;
                        ahmVar2.uq = (f26 - fLb) - fJc;
                        ahmVar2.ct = ahmVar.ct + UserDetailsUtils.UserDetailsLiterals.DOT + next4.rz();
                        ahmVar2.fi = ahmVar;
                        ahmVar2.noq = next4;
                        ahmVar2.gf = fMax;
                        ahmVar2.ra = list;
                        next4.rz(ahmVar2.kgy);
                        ahmVar2.noq.uq(ahmVar2.ahm);
                        ahmVar2.noq.ct(ahmVar2.rz);
                        ahmVar2.noq.noq(ahmVar2.uq);
                        ahmVar.yo.get(i2).add(kgy(ahmVar2, f28));
                        if (noqVarCt5.qdr() != 1 && noqVarCt5.qdr() != 2) {
                            gfVar.kgy = f27 + f24 + gfVar.kgy;
                        }
                        f18 = f28;
                        strWl = str4;
                        str = str3;
                        fMax2 = f29;
                        f8 = f8;
                        str2 = str2;
                        it6 = it7;
                    }
                    gfVar.kgy = f3;
                    gfVar.ahm = fMax2 + f17 + gfVar.ahm;
                    i = 1;
                    listXh = listXh;
                    f13 = f18;
                    fKgy = f17;
                }
            }
        }
        return ahmVar;
    }

    public ct(double d, int i, double d2, String str, twf twfVar) {
        this.ahm = new ahm(d, i, d2, str, twfVar);
    }

    public void kgy() {
        this.ahm.kgy();
    }

    public void kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar, float f, float f2) {
        if (fiVar != null) {
            this.rz = fiVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar2 = this.rz;
        float fFi = fiVar2.fi();
        float fGf = fiVar2.gf();
        float f3 = TextUtils.equals(fiVar2.ra().ct().ft(), "fixed") ? fGf : 65536.0f;
        this.ahm.kgy();
        this.ahm.rz(fiVar2, fFi, f3);
        ahm.rz rzVarKgy = this.ahm.kgy(fiVar2);
        com.bytedance.sdk.component.adexpress.dynamic.uq.ahm ahmVar = new com.bytedance.sdk.component.adexpress.dynamic.uq.ahm();
        ahmVar.kgy = f;
        ahmVar.ahm = f2;
        if (rzVarKgy != null) {
            fFi = rzVarKgy.kgy;
        }
        ahmVar.rz = fFi;
        if (rzVarKgy != null) {
            fGf = rzVarKgy.ahm;
        }
        ahmVar.uq = fGf;
        ahmVar.ct = "root";
        ahmVar.gf = 1280.0f;
        ahmVar.noq = fiVar2;
        fiVar2.rz(f);
        ahmVar.noq.uq(ahmVar.ahm);
        ahmVar.noq.ct(ahmVar.rz);
        ahmVar.noq.noq(ahmVar.uq);
        com.bytedance.sdk.component.adexpress.dynamic.uq.ahm ahmVarKgy = kgy(ahmVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.kgy = ahmVarKgy;
        kgy(ahmVarKgy);
    }

    public void kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.ahm ahmVar) {
        if (ahmVar == null) {
            return;
        }
        ahmVar.noq.ra().ahm();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.uq.ahm>> list = ahmVar.yo;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.uq.ahm> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.uq.ahm> it = list2.iterator();
                while (it.hasNext()) {
                    kgy(it.next());
                }
            }
        }
    }

    public void kgy(kgy kgyVar) {
        this.uq = kgyVar;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.uq.gf kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVar, ahm.rz rzVar, ahm.rz rzVar2) {
        float fVf = noqVar.vf();
        float fQi = noqVar.qi();
        float fIdg = noqVar.idg();
        float fEbs = noqVar.ebs();
        boolean zNaw = noqVar.naw();
        boolean zZnm = noqVar.znm();
        boolean zXkh = noqVar.xkh();
        boolean zUh = noqVar.uh();
        if (!zNaw) {
            if (zZnm) {
                float f = this.uq.kgy;
                fVf = ((f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.min(f, rzVar.kgy) : rzVar.kgy) - fIdg) - rzVar2.kgy;
            } else {
                fVf = 0.0f;
            }
        }
        if (!zXkh) {
            if (zUh) {
                float f2 = this.uq.ahm;
                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = rzVar.ahm;
                }
                fQi = (f2 - fEbs) - rzVar2.ahm;
            } else {
                fQi = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.uq.gf(fVf, fQi);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.uq.gf kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.ahm ahmVar, com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVar, float f, float f2) {
        float f3;
        float f4;
        float f5 = ahmVar.kgy;
        float f6 = ahmVar.ahm;
        float fVf = noqVar.vf();
        float fQi = noqVar.qi();
        float fIdg = noqVar.idg();
        float fEbs = noqVar.ebs();
        boolean zNaw = noqVar.naw();
        boolean zZnm = noqVar.znm();
        boolean zXkh = noqVar.xkh();
        boolean zUh = noqVar.uh();
        String strZjw = noqVar.zjw();
        float f7 = ahmVar.rz;
        float f8 = ahmVar.uq;
        if (TextUtils.equals(strZjw, "0")) {
            if (zNaw) {
                f5 = ahmVar.kgy + fVf;
            } else if (zZnm) {
                f5 = ((ahmVar.kgy + f7) - fIdg) - f;
            }
            if (zXkh) {
                f4 = ahmVar.ahm;
                f6 = f4 + fQi;
            } else if (zUh) {
                f3 = ahmVar.ahm;
                f6 = ((f3 + f8) - fEbs) - f2;
            }
        } else if (TextUtils.equals(strZjw, "1")) {
            f5 = ahmVar.kgy + ((f7 - f) / 2.0f);
            if (zXkh) {
                f4 = ahmVar.ahm;
                f6 = f4 + fQi;
            } else if (zUh) {
                f3 = ahmVar.ahm;
                f6 = ((f3 + f8) - fEbs) - f2;
            }
        } else if (TextUtils.equals(strZjw, "2")) {
            f6 = ahmVar.ahm + ((f8 - f2) / 2.0f);
            if (zNaw) {
                f5 = ahmVar.kgy + fVf;
            } else if (zZnm) {
                f5 = ((ahmVar.kgy + f7) - fIdg) - f;
            }
        } else if (TextUtils.equals(strZjw, Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET)) {
            f5 = ahmVar.kgy + ((f7 - f) / 2.0f);
            f6 = ((f8 - f2) / 2.0f) + ahmVar.ahm;
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.uq.gf(f5, f6);
    }
}
