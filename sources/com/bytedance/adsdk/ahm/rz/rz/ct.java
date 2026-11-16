package com.bytedance.adsdk.ahm.rz.rz;

import com.bytedance.adsdk.ahm.rz.kgy.at;
import com.bytedance.adsdk.ahm.rz.kgy.nu;
import defpackage.h50;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ct {
    private final com.bytedance.adsdk.ahm.yo ahm;
    private final int at;
    private final boolean ay;
    private final kgy ct;
    private final float dg;
    private final List<com.bytedance.adsdk.ahm.rz.ahm.fi> fi;
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm fpp;
    private final at gf;
    private final ahm gm;
    private final com.bytedance.adsdk.ahm.rz.ahm.kgy ioy;
    private final List<com.bytedance.adsdk.ahm.rz.ahm.rz> kgy;
    private final float kus;
    private final com.bytedance.adsdk.ahm.ct.ra lqi;
    private final long noq;
    private final int nu;
    private final int ra;
    private final String rz;
    private final List<com.bytedance.adsdk.ahm.yo.kgy<Float>> sx;
    private final float twf;
    private final nu um;
    private final long uq;
    private final float vs;
    private final com.bytedance.adsdk.ahm.rz.kgy.ra xh;
    private final String yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum ahm {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum kgy {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public ct(List<com.bytedance.adsdk.ahm.rz.ahm.rz> list, com.bytedance.adsdk.ahm.yo yoVar, String str, long j, kgy kgyVar, long j2, String str2, List<com.bytedance.adsdk.ahm.rz.ahm.fi> list2, at atVar, int i, int i2, int i3, float f, float f2, float f3, float f4, com.bytedance.adsdk.ahm.rz.kgy.ra raVar, nu nuVar, List<com.bytedance.adsdk.ahm.yo.kgy<Float>> list3, ahm ahmVar, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar2, boolean z, com.bytedance.adsdk.ahm.rz.ahm.kgy kgyVar2, com.bytedance.adsdk.ahm.ct.ra raVar2) {
        this.kgy = list;
        this.ahm = yoVar;
        this.rz = str;
        this.uq = j;
        this.ct = kgyVar;
        this.noq = j2;
        this.yo = str2;
        this.fi = list2;
        this.gf = atVar;
        this.ra = i;
        this.nu = i2;
        this.at = i3;
        this.twf = f;
        this.kus = f2;
        this.vs = f3;
        this.dg = f4;
        this.xh = raVar;
        this.um = nuVar;
        this.sx = list3;
        this.gm = ahmVar;
        this.fpp = ahmVar2;
        this.ay = z;
        this.ioy = kgyVar2;
        this.lqi = raVar2;
    }

    public float ahm() {
        return this.twf;
    }

    public ahm at() {
        return this.gm;
    }

    public boolean ay() {
        return this.ay;
    }

    public long ct() {
        return this.uq;
    }

    public int dg() {
        return this.at;
    }

    public float fi() {
        return this.vs;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ra fpp() {
        return this.xh;
    }

    public float gf() {
        return this.dg;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ahm gm() {
        return this.fpp;
    }

    public com.bytedance.adsdk.ahm.rz.ahm.kgy ioy() {
        return this.ioy;
    }

    public List<com.bytedance.adsdk.ahm.rz.ahm.rz> kus() {
        return this.kgy;
    }

    public com.bytedance.adsdk.ahm.ct.ra lqi() {
        return this.lqi;
    }

    public String noq() {
        return this.rz;
    }

    public kgy nu() {
        return this.ct;
    }

    public List<com.bytedance.adsdk.ahm.rz.ahm.fi> ra() {
        return this.fi;
    }

    public float rz() {
        return this.kus / this.ahm.xh();
    }

    public nu sx() {
        return this.um;
    }

    public String toString() {
        return kgy("");
    }

    public long twf() {
        return this.noq;
    }

    public int um() {
        return this.ra;
    }

    public List<com.bytedance.adsdk.ahm.yo.kgy<Float>> uq() {
        return this.sx;
    }

    public at vs() {
        return this.gf;
    }

    public int xh() {
        return this.nu;
    }

    public String yo() {
        return this.yo;
    }

    public String kgy(String str) {
        StringBuilder sbP = h50.p(str);
        sbP.append(noq());
        sbP.append("\n");
        ct ctVarKgy = this.ahm.kgy(twf());
        if (ctVarKgy != null) {
            sbP.append("\t\tParents: ");
            sbP.append(ctVarKgy.noq());
            ct ctVarKgy2 = this.ahm.kgy(ctVarKgy.twf());
            while (ctVarKgy2 != null) {
                sbP.append("->");
                sbP.append(ctVarKgy2.noq());
                ctVarKgy2 = this.ahm.kgy(ctVarKgy2.twf());
            }
            sbP.append(str);
            sbP.append("\n");
        }
        if (!ra().isEmpty()) {
            sbP.append(str);
            sbP.append("\tMasks: ");
            sbP.append(ra().size());
            sbP.append("\n");
        }
        if (um() != 0 && xh() != 0) {
            sbP.append(str);
            sbP.append("\tBackground: ");
            sbP.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(um()), Integer.valueOf(xh()), Integer.valueOf(dg())));
        }
        if (!this.kgy.isEmpty()) {
            sbP.append(str);
            sbP.append("\tShapes:\n");
            for (com.bytedance.adsdk.ahm.rz.ahm.rz rzVar : this.kgy) {
                sbP.append(str);
                sbP.append("\t\t");
                sbP.append(rzVar);
                sbP.append("\n");
            }
        }
        return sbP.toString();
    }

    public com.bytedance.adsdk.ahm.yo kgy() {
        return this.ahm;
    }
}
