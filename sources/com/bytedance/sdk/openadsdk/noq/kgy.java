package com.bytedance.sdk.openadsdk.noq;

import com.bytedance.sdk.openadsdk.core.kus;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.bytedance.sdk.openadsdk.lqi.ct;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kgy {
    private static volatile kgy kgy;
    private boolean ahm;
    private int[] at;
    private int[] ct;
    private boolean dg;
    private int[] fi;
    private int[] gf;
    private boolean kus;
    private int[] noq;
    private boolean nu;
    private boolean ra;
    private boolean rz;
    private boolean twf;
    private boolean uq;
    private int vs;
    private boolean xh;
    private int[] yo;

    /* JADX INFO: Access modifiers changed from: private */
    public int[] ahm(String[] strArr) {
        return strArr.length > 0 ? rz(strArr[0].split(",")) : new int[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] rz(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i = 0;
        for (String str : strArr) {
            try {
                int i2 = Integer.parseInt(str);
                iArr[i] = i2;
                if (i2 > 0) {
                    i++;
                }
            } catch (NumberFormatException e) {
                rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4oUoTxO/Cg=", "fessgRaubOSBScJRjQWlC1TgK5wE", "WOYolgidZ8OwS8VOiSWpJV4=", 111);
            }
        }
        if (i == length) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public static kgy kgy() {
        if (kgy == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.rz.class) {
                try {
                    if (kgy == null) {
                        kgy = new kgy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    public int[] at() {
        return this.fi;
    }

    public int[] dg() {
        return this.at;
    }

    public boolean kus() {
        return this.ra;
    }

    public int[] nu() {
        return this.yo;
    }

    public int[] ra() {
        return this.noq;
    }

    public int[] twf() {
        return this.gf;
    }

    public boolean um() {
        return this.xh;
    }

    public boolean vs() {
        return this.nu;
    }

    public boolean xh() {
        return this.twf;
    }

    private kgy() {
        ahm();
    }

    public boolean fi() {
        return this.uq;
    }

    public int[] gf() {
        return this.ct;
    }

    public boolean yo() {
        return this.rz;
    }

    public boolean ct() {
        return this.dg;
    }

    public boolean noq() {
        return this.ahm;
    }

    public int uq() {
        return this.vs;
    }

    public void ahm() {
        kus.ahm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.noq.kgy.1
            @Override // java.lang.Runnable
            public void run() {
                kgy.this.kus = ct.kgy("feature_switch", false);
                if (kgy.this.kus) {
                    try {
                        kgy.this.xh = ct.kgy("exclude_banner_native", false);
                        kgy.this.vs = ct.kgy("feature_timer_interval", 10000);
                        kgy.this.dg = ct.kgy("enable_feature_cids", true);
                        String[] strArrSplit = ct.kgy("pag_ad_show_cnt", "1,3,5&session").split(C4664b4.j.c);
                        String[] strArrSplit2 = ct.kgy("pag_ad_click_cnt", "1,3,5&session").split(C4664b4.j.c);
                        String[] strArrSplit3 = ct.kgy("pag_video_play_cnt", "1,3,5&session").split(C4664b4.j.c);
                        String[] strArrSplit4 = ct.kgy("pag_dislike_cnt", "1,3,5session").split(",");
                        kgy kgyVar = kgy.this;
                        kgyVar.ahm = kgyVar.kgy(strArrSplit);
                        kgy kgyVar2 = kgy.this;
                        kgyVar2.rz = kgyVar2.kgy(strArrSplit2);
                        kgy kgyVar3 = kgy.this;
                        kgyVar3.uq = kgyVar3.kgy(strArrSplit3);
                        kgy kgyVar4 = kgy.this;
                        kgyVar4.ct = kgyVar4.ahm(strArrSplit);
                        kgy kgyVar5 = kgy.this;
                        kgyVar5.noq = kgyVar5.ahm(strArrSplit2);
                        kgy kgyVar6 = kgy.this;
                        kgyVar6.yo = kgyVar6.ahm(strArrSplit3);
                        kgy kgyVar7 = kgy.this;
                        kgyVar7.at = kgyVar7.rz(strArrSplit4);
                        String[] strArrSplit5 = ct.kgy("pag_landingPage_stay_time", "1,3,5&session").split(C4664b4.j.c);
                        String[] strArrSplit6 = ct.kgy("pag_video_stay_time", "1,3,5&session").split(C4664b4.j.c);
                        kgy kgyVar8 = kgy.this;
                        kgyVar8.ra = kgyVar8.kgy(strArrSplit5);
                        kgy kgyVar9 = kgy.this;
                        kgyVar9.nu = kgyVar9.kgy(strArrSplit6);
                        kgy kgyVar10 = kgy.this;
                        kgyVar10.fi = kgyVar10.ahm(strArrSplit5);
                        kgy kgyVar11 = kgy.this;
                        kgyVar11.gf = kgyVar11.ahm(strArrSplit6);
                        kgy.this.twf = ct.kgy("pag_video_30p_session", true);
                    } catch (Throwable th) {
                        rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4oUoTxO/Cg=", "fessgRaubOSBScJRjQWlC1TgK5wE+Dg=", "Sfsj", 75);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean kgy(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }

    public boolean rz() {
        return this.kus;
    }
}
