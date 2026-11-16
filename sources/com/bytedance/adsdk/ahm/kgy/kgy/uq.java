package com.bytedance.adsdk.ahm.kgy.kgy;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class uq implements com.bytedance.adsdk.ahm.kgy.ahm.kgy.InterfaceC0185kgy, ct, twf {
    private final RectF ahm;
    private final RectF ct;
    private final List<rz> fi;
    private final com.bytedance.adsdk.ahm.gf gf;
    private final Paint kgy;
    private final String noq;
    private com.bytedance.adsdk.ahm.kgy.ahm.dg nu;
    private List<twf> ra;
    private final Matrix rz;
    private final Path uq;
    private final boolean yo;

    private boolean ct() {
        int i = 0;
        for (int i2 = 0; i2 < this.fi.size(); i2++) {
            if ((this.fi.get(i2) instanceof ct) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public List<twf> ahm() {
        if (this.ra == null) {
            this.ra = new ArrayList();
            for (int i = 0; i < this.fi.size(); i++) {
                rz rzVar = this.fi.get(i);
                if (rzVar instanceof twf) {
                    this.ra.add((twf) rzVar);
                }
            }
        }
        return this.ra;
    }

    @Override // com.bytedance.adsdk.ahm.kgy.kgy.ct
    public void kgy(Canvas canvas, Matrix matrix, int i) {
        if (this.yo) {
            return;
        }
        this.rz.set(matrix);
        com.bytedance.adsdk.ahm.kgy.ahm.dg dgVar = this.nu;
        if (dgVar != null) {
            this.rz.preConcat(dgVar.uq());
            i = (int) (((((this.nu.kgy() == null ? 100 : this.nu.kgy().yo().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.gf.gf() && ct() && i != 255;
        if (z) {
            this.ahm.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            kgy(this.ahm, this.rz, true);
            this.kgy.setAlpha(i);
            com.bytedance.adsdk.ahm.noq.noq.kgy(canvas, this.ahm, this.kgy);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.fi.size() - 1; size >= 0; size--) {
            rz rzVar = this.fi.get(size);
            if (rzVar instanceof ct) {
                ((ct) rzVar).kgy(canvas, this.rz, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public Matrix rz() {
        com.bytedance.adsdk.ahm.kgy.ahm.dg dgVar = this.nu;
        if (dgVar != null) {
            return dgVar.uq();
        }
        this.rz.reset();
        return this.rz;
    }

    @Override // com.bytedance.adsdk.ahm.kgy.kgy.twf
    public Path uq() {
        this.rz.reset();
        com.bytedance.adsdk.ahm.kgy.ahm.dg dgVar = this.nu;
        if (dgVar != null) {
            this.rz.set(dgVar.uq());
        }
        this.uq.reset();
        if (this.yo) {
            return this.uq;
        }
        for (int size = this.fi.size() - 1; size >= 0; size--) {
            rz rzVar = this.fi.get(size);
            if (rzVar instanceof twf) {
                this.uq.addPath(((twf) rzVar).uq(), this.rz);
            }
        }
        return this.uq;
    }

    public uq(com.bytedance.adsdk.ahm.gf gfVar, com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar, String str, boolean z, List<rz> list, com.bytedance.adsdk.ahm.rz.kgy.at atVar) {
        this.kgy = new com.bytedance.adsdk.ahm.kgy.kgy();
        this.ahm = new RectF();
        this.rz = new Matrix();
        this.uq = new Path();
        this.ct = new RectF();
        this.noq = str;
        this.gf = gfVar;
        this.yo = z;
        this.fi = list;
        if (atVar != null) {
            com.bytedance.adsdk.ahm.kgy.ahm.dg dgVarRa = atVar.ra();
            this.nu = dgVarRa;
            dgVarRa.kgy(kgyVar);
            this.nu.kgy(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            rz rzVar = list.get(size);
            if (rzVar instanceof ra) {
                arrayList.add((ra) rzVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((ra) arrayList.get(size2)).kgy(list.listIterator(list.size()));
        }
    }

    public uq(com.bytedance.adsdk.ahm.gf gfVar, com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar, com.bytedance.adsdk.ahm.rz.ahm.dg dgVar, com.bytedance.adsdk.ahm.yo yoVar) {
        this(gfVar, kgyVar, dgVar.kgy(), dgVar.rz(), kgy(gfVar, yoVar, kgyVar, dgVar.ahm()), kgy(dgVar.ahm()));
    }

    public static com.bytedance.adsdk.ahm.rz.kgy.at kgy(List<com.bytedance.adsdk.ahm.rz.ahm.rz> list) {
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.ahm.rz.ahm.rz rzVar = list.get(i);
            if (rzVar instanceof com.bytedance.adsdk.ahm.rz.kgy.at) {
                return (com.bytedance.adsdk.ahm.rz.kgy.at) rzVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.InterfaceC0185kgy
    public void kgy() {
        this.gf.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ahm.kgy.kgy.rz
    public void kgy(List<rz> list, List<rz> list2) {
        ArrayList arrayList = new ArrayList(this.fi.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.fi.size() - 1; size >= 0; size--) {
            rz rzVar = this.fi.get(size);
            rzVar.kgy(arrayList, this.fi.subList(0, size));
            arrayList.add(rzVar);
        }
    }

    private static List<rz> kgy(com.bytedance.adsdk.ahm.gf gfVar, com.bytedance.adsdk.ahm.yo yoVar, com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar, List<com.bytedance.adsdk.ahm.rz.ahm.rz> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            rz rzVarKgy = list.get(i).kgy(gfVar, yoVar, kgyVar);
            if (rzVarKgy != null) {
                arrayList.add(rzVarKgy);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ahm.kgy.kgy.ct
    public void kgy(RectF rectF, Matrix matrix, boolean z) {
        this.rz.set(matrix);
        com.bytedance.adsdk.ahm.kgy.ahm.dg dgVar = this.nu;
        if (dgVar != null) {
            this.rz.preConcat(dgVar.uq());
        }
        this.ct.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        for (int size = this.fi.size() - 1; size >= 0; size--) {
            rz rzVar = this.fi.get(size);
            if (rzVar instanceof ct) {
                ((ct) rzVar).kgy(this.ct, this.rz, z);
                rectF.union(this.ct);
            }
        }
    }
}
