package com.bytedance.adsdk.ahm.rz.rz;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.adsdk.ahm.kgy.ahm.dg;
import com.bytedance.adsdk.ahm.rz.ahm.kus;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class kgy implements com.bytedance.adsdk.ahm.kgy.ahm.kgy.InterfaceC0185kgy, com.bytedance.adsdk.ahm.kgy.kgy.ct {
    final com.bytedance.adsdk.ahm.gf ahm;
    private final Paint at;
    private com.bytedance.adsdk.ahm.kgy.ahm.uq ay;
    private float bmz;
    float ct;
    private final RectF dg;
    private final RectF fpp;
    private List<kgy> fpz;
    private boolean ft;
    private com.bytedance.adsdk.ahm.kgy.ahm.fi gm;
    private kgy ioy;
    private final List<com.bytedance.adsdk.ahm.kgy.ahm.kgy<?, ?>> jpc;
    final Matrix kgy;
    private final Paint kus;
    private kgy lqi;
    BlurMaskFilter noq;
    private final Paint nu;
    final ct rz;
    private final String sx;
    private final Paint twf;
    private Paint uf;
    private final RectF um;
    final dg uq;
    private final Matrix vg;
    private final RectF vs;
    private boolean wy;
    private final RectF xh;
    private final Path yo = new Path();
    private final Matrix fi = new Matrix();
    private final Matrix gf = new Matrix();
    private final Paint ra = new com.bytedance.adsdk.ahm.kgy.kgy(1);

    /* JADX INFO: renamed from: com.bytedance.adsdk.ahm.rz.rz.kgy$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] ahm;
        static final /* synthetic */ int[] kgy;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ahm.rz.ahm.fi.kgy.values().length];
            ahm = iArr;
            try {
                iArr[com.bytedance.adsdk.ahm.rz.ahm.fi.kgy.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ahm[com.bytedance.adsdk.ahm.rz.ahm.fi.kgy.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ahm[com.bytedance.adsdk.ahm.rz.ahm.fi.kgy.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ahm[com.bytedance.adsdk.ahm.rz.ahm.fi.kgy.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ct.kgy.values().length];
            kgy = iArr2;
            try {
                iArr2[ct.kgy.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                kgy[ct.kgy.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                kgy[ct.kgy.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                kgy[ct.kgy.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                kgy[ct.kgy.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                kgy[ct.kgy.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                kgy[ct.kgy.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void ahm(Canvas canvas, Matrix matrix, com.bytedance.adsdk.ahm.kgy.ahm.kgy<kus, Path> kgyVar, com.bytedance.adsdk.ahm.kgy.ahm.kgy<Integer, Integer> kgyVar2) {
        com.bytedance.adsdk.ahm.noq.noq.kgy(canvas, this.vs, this.ra);
        canvas.drawRect(this.vs, this.ra);
        this.yo.set(kgyVar.yo());
        this.yo.transform(matrix);
        this.ra.setAlpha((int) (kgyVar2.yo().intValue() * 2.55f));
        canvas.drawPath(this.yo, this.at);
        canvas.restore();
    }

    private void at() {
        if (this.rz.uq().isEmpty()) {
            ahm(true);
            return;
        }
        com.bytedance.adsdk.ahm.kgy.ahm.uq uqVar = new com.bytedance.adsdk.ahm.kgy.ahm.uq(this.rz.uq());
        this.ay = uqVar;
        uqVar.kgy();
        this.ay.kgy(new com.bytedance.adsdk.ahm.kgy.ahm.kgy.InterfaceC0185kgy() { // from class: com.bytedance.adsdk.ahm.rz.rz.kgy.1
            @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.InterfaceC0185kgy
            public void kgy() {
                kgy kgyVar = kgy.this;
                kgyVar.ahm(kgyVar.ay.gf() == 1.0f);
            }
        });
        ahm(this.ay.yo().floatValue() == 1.0f);
        kgy(this.ay);
    }

    private void ct(Canvas canvas, Matrix matrix, com.bytedance.adsdk.ahm.kgy.ahm.kgy<kus, Path> kgyVar, com.bytedance.adsdk.ahm.kgy.ahm.kgy<Integer, Integer> kgyVar2) {
        com.bytedance.adsdk.ahm.noq.noq.kgy(canvas, this.vs, this.nu);
        canvas.drawRect(this.vs, this.ra);
        this.at.setAlpha((int) (kgyVar2.yo().intValue() * 2.55f));
        this.yo.set(kgyVar.yo());
        this.yo.transform(matrix);
        canvas.drawPath(this.yo, this.at);
        canvas.restore();
    }

    private boolean kus() {
        if (this.gm.ahm().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.gm.kgy().size(); i++) {
            if (this.gm.kgy().get(i).kgy() != com.bytedance.adsdk.ahm.rz.ahm.fi.kgy.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void rz(Canvas canvas, Matrix matrix, com.bytedance.adsdk.ahm.kgy.ahm.kgy<kus, Path> kgyVar, com.bytedance.adsdk.ahm.kgy.ahm.kgy<Integer, Integer> kgyVar2) {
        com.bytedance.adsdk.ahm.noq.noq.kgy(canvas, this.vs, this.at);
        canvas.drawRect(this.vs, this.ra);
        this.at.setAlpha((int) (kgyVar2.yo().intValue() * 2.55f));
        this.yo.set(kgyVar.yo());
        this.yo.transform(matrix);
        canvas.drawPath(this.yo, this.at);
        canvas.restore();
    }

    private void twf() {
        this.ahm.invalidateSelf();
    }

    private void uq(Canvas canvas, Matrix matrix, com.bytedance.adsdk.ahm.kgy.ahm.kgy<kus, Path> kgyVar, com.bytedance.adsdk.ahm.kgy.ahm.kgy<Integer, Integer> kgyVar2) {
        com.bytedance.adsdk.ahm.noq.noq.kgy(canvas, this.vs, this.nu);
        this.yo.set(kgyVar.yo());
        this.yo.transform(matrix);
        this.ra.setAlpha((int) (kgyVar2.yo().intValue() * 2.55f));
        canvas.drawPath(this.yo, this.ra);
        canvas.restore();
    }

    private void vs() {
        if (this.fpz != null) {
            return;
        }
        if (this.lqi == null) {
            this.fpz = Collections.EMPTY_LIST;
            return;
        }
        this.fpz = new ArrayList();
        for (kgy kgyVar = this.lqi; kgyVar != null; kgyVar = kgyVar.lqi) {
            this.fpz.add(kgyVar);
        }
    }

    public boolean fi() {
        return this.ft;
    }

    public String gf() {
        return this.rz.noq();
    }

    @Override // com.bytedance.adsdk.ahm.kgy.kgy.ct
    public void kgy(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer numYo;
        com.bytedance.adsdk.ahm.ct.kgy(this.sx);
        if (!this.ft || this.rz.ay()) {
            com.bytedance.adsdk.ahm.ct.ahm(this.sx);
            return;
        }
        vs();
        com.bytedance.adsdk.ahm.ct.kgy("Layer#parentMatrix");
        this.vg.set(matrix);
        this.fi.reset();
        this.fi.set(matrix);
        for (int size = this.fpz.size() - 1; size >= 0; size--) {
            this.fi.preConcat(this.fpz.get(size).uq.uq());
        }
        com.bytedance.adsdk.ahm.ct.ahm("Layer#parentMatrix");
        com.bytedance.adsdk.ahm.kgy.ahm.kgy<?, Integer> kgyVarKgy = this.uq.kgy();
        int iIntValue = (int) ((((i / 255.0f) * ((kgyVarKgy == null || (numYo = kgyVarKgy.yo()) == null) ? 100 : numYo.intValue())) / 100.0f) * 255.0f);
        if (!rz() && !yo()) {
            this.fi.preConcat(this.uq.uq());
            com.bytedance.adsdk.ahm.ct.kgy("Layer#drawLayer");
            ahm(canvas, this.fi, iIntValue);
            com.bytedance.adsdk.ahm.ct.ahm("Layer#drawLayer");
            rz(com.bytedance.adsdk.ahm.ct.ahm(this.sx));
            return;
        }
        com.bytedance.adsdk.ahm.ct.kgy("Layer#computeBounds");
        kgy(this.vs, this.fi, false);
        ahm(this.vs, matrix);
        this.fi.preConcat(this.uq.uq());
        kgy(this.vs, this.fi);
        this.dg.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.gf);
        if (!this.gf.isIdentity()) {
            Matrix matrix2 = this.gf;
            matrix2.invert(matrix2);
            this.gf.mapRect(this.dg);
        }
        if (!this.vs.intersect(this.dg)) {
            this.vs.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        com.bytedance.adsdk.ahm.ct.ahm("Layer#computeBounds");
        if (this.vs.width() >= 1.0f && this.vs.height() >= 1.0f) {
            com.bytedance.adsdk.ahm.ct.kgy("Layer#saveLayer");
            this.ra.setAlpha(255);
            com.bytedance.adsdk.ahm.noq.noq.kgy(canvas, this.vs, this.ra);
            com.bytedance.adsdk.ahm.ct.ahm("Layer#saveLayer");
            kgy(canvas);
            com.bytedance.adsdk.ahm.ct.kgy("Layer#drawLayer");
            ahm(canvas, this.fi, iIntValue);
            com.bytedance.adsdk.ahm.ct.ahm("Layer#drawLayer");
            if (yo()) {
                kgy(canvas, this.fi);
            }
            if (rz()) {
                com.bytedance.adsdk.ahm.ct.kgy("Layer#drawMatte");
                com.bytedance.adsdk.ahm.ct.kgy("Layer#saveLayer");
                com.bytedance.adsdk.ahm.noq.noq.kgy(canvas, this.vs, this.twf, 19);
                com.bytedance.adsdk.ahm.ct.ahm("Layer#saveLayer");
                kgy(canvas);
                this.ioy.kgy(canvas, matrix, iIntValue);
                com.bytedance.adsdk.ahm.ct.kgy("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.ahm.ct.ahm("Layer#restoreLayer");
                com.bytedance.adsdk.ahm.ct.ahm("Layer#drawMatte");
            }
            com.bytedance.adsdk.ahm.ct.kgy("Layer#restoreLayer");
            canvas.restore();
            com.bytedance.adsdk.ahm.ct.ahm("Layer#restoreLayer");
        }
        if (this.wy && (paint = this.uf) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.uf.setColor(-251901);
            this.uf.setStrokeWidth(4.0f);
            canvas.drawRect(this.vs, this.uf);
            this.uf.setStyle(Paint.Style.FILL);
            this.uf.setColor(1357638635);
            canvas.drawRect(this.vs, this.uf);
        }
        rz(com.bytedance.adsdk.ahm.ct.ahm(this.sx));
    }

    public float noq() {
        return this.bmz;
    }

    public com.bytedance.adsdk.ahm.ct.ra nu() {
        return this.rz.lqi();
    }

    public com.bytedance.adsdk.ahm.rz.ahm.kgy ra() {
        return this.rz.ioy();
    }

    public boolean yo() {
        com.bytedance.adsdk.ahm.kgy.ahm.fi fiVar = this.gm;
        return (fiVar == null || fiVar.ahm().isEmpty()) ? false : true;
    }

    public kgy(com.bytedance.adsdk.ahm.gf gfVar, ct ctVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.nu = new com.bytedance.adsdk.ahm.kgy.kgy(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.at = new com.bytedance.adsdk.ahm.kgy.kgy(1, mode2);
        com.bytedance.adsdk.ahm.kgy.kgy kgyVar = new com.bytedance.adsdk.ahm.kgy.kgy(1);
        this.twf = kgyVar;
        this.kus = new com.bytedance.adsdk.ahm.kgy.kgy(PorterDuff.Mode.CLEAR);
        this.vs = new RectF();
        this.dg = new RectF();
        this.xh = new RectF();
        this.um = new RectF();
        this.fpp = new RectF();
        this.kgy = new Matrix();
        this.jpc = new ArrayList();
        this.ft = true;
        this.ct = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.vg = new Matrix();
        this.bmz = 1.0f;
        this.ahm = gfVar;
        this.rz = ctVar;
        this.sx = ctVar.noq() + "#draw";
        if (ctVar.at() == ct.ahm.INVERT) {
            kgyVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            kgyVar.setXfermode(new PorterDuffXfermode(mode));
        }
        dg dgVarRa = ctVar.vs().ra();
        this.uq = dgVarRa;
        dgVarRa.kgy((com.bytedance.adsdk.ahm.kgy.ahm.kgy.InterfaceC0185kgy) this);
        if (ctVar.ra() != null && !ctVar.ra().isEmpty()) {
            com.bytedance.adsdk.ahm.kgy.ahm.fi fiVar = new com.bytedance.adsdk.ahm.kgy.ahm.fi(ctVar.ra());
            this.gm = fiVar;
            Iterator<com.bytedance.adsdk.ahm.kgy.ahm.kgy<kus, Path>> it = fiVar.ahm().iterator();
            while (it.hasNext()) {
                it.next().kgy(this);
            }
            for (com.bytedance.adsdk.ahm.kgy.ahm.kgy<Integer, Integer> kgyVar2 : this.gm.rz()) {
                kgy(kgyVar2);
                kgyVar2.kgy(this);
            }
        }
        at();
    }

    public Matrix uq() {
        return this.vg;
    }

    public void ahm(kgy kgyVar) {
        this.lqi = kgyVar;
    }

    public String ct() {
        ct ctVar = this.rz;
        if (ctVar != null) {
            return ctVar.yo();
        }
        return null;
    }

    public boolean rz() {
        return this.ioy != null;
    }

    private void ahm(RectF rectF, Matrix matrix) {
        if (rz() && this.rz.at() != ct.ahm.INVERT) {
            this.um.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.ioy.kgy(this.um, matrix, true);
            if (rectF.intersect(this.um)) {
                return;
            }
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private void rz(float f) {
        this.ahm.jpc().rz().kgy(this.rz.noq(), f);
    }

    public void ahm(Canvas canvas, Matrix matrix, int i) {
        kgy(i);
    }

    public ct ahm() {
        return this.rz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ahm(boolean z) {
        if (z != this.ft) {
            this.ft = z;
            twf();
        }
    }

    public BlurMaskFilter ahm(float f) {
        if (this.ct == f) {
            return this.noq;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.noq = blurMaskFilter;
        this.ct = f;
        return blurMaskFilter;
    }

    public static kgy kgy(ahm ahmVar, ct ctVar, com.bytedance.adsdk.ahm.gf gfVar, com.bytedance.adsdk.ahm.yo yoVar, Context context) {
        switch (AnonymousClass2.kgy[ctVar.nu().ordinal()]) {
            case 1:
                return new yo(gfVar, ctVar, ahmVar, yoVar);
            case 2:
                return new ahm(gfVar, ctVar, yoVar.ahm(ctVar.yo()), yoVar, context);
            case 3:
                return new fi(gfVar, ctVar);
            case 4:
                if (kgy(gfVar, ctVar, "text:")) {
                    return new rz(gfVar, ctVar, context);
                }
                if (kgy(gfVar, ctVar, "videoview:")) {
                    return new ra(gfVar, ctVar, context);
                }
                return new uq(gfVar, ctVar);
            case 5:
                return new noq(gfVar, ctVar);
            case 6:
                return new gf(gfVar, ctVar);
            default:
                Objects.toString(ctVar.nu());
                return null;
        }
    }

    private static boolean kgy(com.bytedance.adsdk.ahm.gf gfVar, ct ctVar, String str) {
        com.bytedance.adsdk.ahm.ra raVarNoq;
        if (gfVar == null || ctVar == null || str == null || (raVarNoq = gfVar.noq(ctVar.yo())) == null) {
            return false;
        }
        return str.equals(raVarNoq.ra());
    }

    public void kgy(boolean z) {
        if (z && this.uf == null) {
            this.uf = new com.bytedance.adsdk.ahm.kgy.kgy();
        }
        this.wy = z;
    }

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.InterfaceC0185kgy
    public void kgy() {
        twf();
    }

    public void kgy(kgy kgyVar) {
        this.ioy = kgyVar;
    }

    public void kgy(com.bytedance.adsdk.ahm.kgy.ahm.kgy<?, ?> kgyVar) {
        if (kgyVar == null) {
            return;
        }
        this.jpc.add(kgyVar);
    }

    public void kgy(RectF rectF, Matrix matrix, boolean z) {
        this.vs.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        vs();
        this.kgy.set(matrix);
        if (z) {
            List<kgy> list = this.fpz;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.kgy.preConcat(this.fpz.get(size).uq.uq());
                }
            } else {
                kgy kgyVar = this.lqi;
                if (kgyVar != null) {
                    this.kgy.preConcat(kgyVar.uq.uq());
                }
            }
        }
        this.kgy.preConcat(this.uq.uq());
    }

    @Override // com.bytedance.adsdk.ahm.kgy.kgy.rz
    public void kgy(List<com.bytedance.adsdk.ahm.kgy.kgy.rz> list, List<com.bytedance.adsdk.ahm.kgy.kgy.rz> list2) {
    }

    private void kgy(Canvas canvas) {
        com.bytedance.adsdk.ahm.ct.kgy("Layer#clearLayer");
        RectF rectF = this.vs;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.kus);
        com.bytedance.adsdk.ahm.ct.ahm("Layer#clearLayer");
    }

    private void kgy(RectF rectF, Matrix matrix) {
        this.xh.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (yo()) {
            int size = this.gm.kgy().size();
            for (int i = 0; i < size; i++) {
                com.bytedance.adsdk.ahm.rz.ahm.fi fiVar = this.gm.kgy().get(i);
                Path pathYo = this.gm.ahm().get(i).yo();
                if (pathYo != null) {
                    this.yo.set(pathYo);
                    this.yo.transform(matrix);
                    int i2 = AnonymousClass2.ahm[fiVar.kgy().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && fiVar.uq()) {
                        return;
                    }
                    this.yo.computeBounds(this.fpp, false);
                    RectF rectF2 = this.xh;
                    if (i == 0) {
                        rectF2.set(this.fpp);
                    } else {
                        rectF2.set(Math.min(rectF2.left, this.fpp.left), Math.min(this.xh.top, this.fpp.top), Math.max(this.xh.right, this.fpp.right), Math.max(this.xh.bottom, this.fpp.bottom));
                    }
                }
            }
            if (rectF.intersect(this.xh)) {
                return;
            }
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public void kgy(int i) {
        this.bmz = (i / 255.0f) * ((this.uq.kgy() != null ? this.uq.kgy().yo().intValue() : 100) / 100.0f);
    }

    private void kgy(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.ahm.ct.kgy("Layer#saveLayer");
        com.bytedance.adsdk.ahm.noq.noq.kgy(canvas, this.vs, this.nu, 19);
        if (Build.VERSION.SDK_INT < 28) {
            kgy(canvas);
        }
        com.bytedance.adsdk.ahm.ct.ahm("Layer#saveLayer");
        for (int i = 0; i < this.gm.kgy().size(); i++) {
            com.bytedance.adsdk.ahm.rz.ahm.fi fiVar = this.gm.kgy().get(i);
            com.bytedance.adsdk.ahm.kgy.ahm.kgy<kus, Path> kgyVar = this.gm.ahm().get(i);
            com.bytedance.adsdk.ahm.kgy.ahm.kgy<Integer, Integer> kgyVar2 = this.gm.rz().get(i);
            int i2 = AnonymousClass2.ahm[fiVar.kgy().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.ra.setColor(-16777216);
                        this.ra.setAlpha(255);
                        canvas.drawRect(this.vs, this.ra);
                    }
                    if (fiVar.uq()) {
                        rz(canvas, matrix, kgyVar, kgyVar2);
                    } else {
                        kgy(canvas, matrix, kgyVar);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (fiVar.uq()) {
                            ahm(canvas, matrix, kgyVar, kgyVar2);
                        } else {
                            kgy(canvas, matrix, kgyVar, kgyVar2);
                        }
                    }
                } else if (fiVar.uq()) {
                    ct(canvas, matrix, kgyVar, kgyVar2);
                } else {
                    uq(canvas, matrix, kgyVar, kgyVar2);
                }
            } else if (kus()) {
                this.ra.setAlpha(255);
                canvas.drawRect(this.vs, this.ra);
            }
        }
        com.bytedance.adsdk.ahm.ct.kgy("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.ahm.ct.ahm("Layer#restoreLayer");
    }

    private void kgy(Canvas canvas, Matrix matrix, com.bytedance.adsdk.ahm.kgy.ahm.kgy<kus, Path> kgyVar, com.bytedance.adsdk.ahm.kgy.ahm.kgy<Integer, Integer> kgyVar2) {
        this.yo.set(kgyVar.yo());
        this.yo.transform(matrix);
        this.ra.setAlpha((int) (kgyVar2.yo().intValue() * 2.55f));
        canvas.drawPath(this.yo, this.ra);
    }

    private void kgy(Canvas canvas, Matrix matrix, com.bytedance.adsdk.ahm.kgy.ahm.kgy<kus, Path> kgyVar) {
        this.yo.set(kgyVar.yo());
        this.yo.transform(matrix);
        canvas.drawPath(this.yo, this.at);
    }

    public void kgy(float f) {
        this.uq.kgy(f);
        if (this.gm != null) {
            for (int i = 0; i < this.gm.ahm().size(); i++) {
                this.gm.ahm().get(i).kgy(f);
            }
        }
        com.bytedance.adsdk.ahm.kgy.ahm.uq uqVar = this.ay;
        if (uqVar != null) {
            uqVar.kgy(f);
        }
        kgy kgyVar = this.ioy;
        if (kgyVar != null) {
            kgyVar.kgy(f);
        }
        for (int i2 = 0; i2 < this.jpc.size(); i2++) {
            this.jpc.get(i2).kgy(f);
        }
    }
}
