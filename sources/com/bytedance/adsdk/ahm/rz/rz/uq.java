package com.bytedance.adsdk.ahm.rz.rz;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class uq extends kgy {
    private com.bytedance.adsdk.ahm.kgy.ahm.kgy<Bitmap, Bitmap> at;
    private final Paint fi;
    private final Rect gf;
    private com.bytedance.adsdk.ahm.kgy.ahm.kgy<ColorFilter, ColorFilter> nu;
    private final Rect ra;
    protected final com.bytedance.adsdk.ahm.ra yo;

    private Bitmap at() {
        Bitmap bitmapYo;
        com.bytedance.adsdk.ahm.kgy.ahm.kgy<Bitmap, Bitmap> kgyVar = this.at;
        if (kgyVar != null && (bitmapYo = kgyVar.yo()) != null) {
            return bitmapYo;
        }
        Bitmap bitmapCt = this.ahm.ct(this.rz.yo());
        if (bitmapCt != null) {
            return bitmapCt;
        }
        com.bytedance.adsdk.ahm.ra raVar = this.yo;
        if (raVar != null) {
            return raVar.nu();
        }
        return null;
    }

    public uq(com.bytedance.adsdk.ahm.gf gfVar, ct ctVar) {
        super(gfVar, ctVar);
        this.fi = new com.bytedance.adsdk.ahm.kgy.kgy(3);
        this.gf = new Rect();
        this.ra = new Rect();
        this.yo = gfVar.noq(ctVar.yo());
    }

    @Override // com.bytedance.adsdk.ahm.rz.rz.kgy
    public void ahm(Canvas canvas, Matrix matrix, int i) {
        super.ahm(canvas, matrix, i);
        Bitmap bitmapAt = at();
        if (bitmapAt != null && !bitmapAt.isRecycled() && this.yo != null) {
            float fKgy = com.bytedance.adsdk.ahm.noq.noq.kgy();
            this.fi.setAlpha(i);
            com.bytedance.adsdk.ahm.kgy.ahm.kgy<ColorFilter, ColorFilter> kgyVar = this.nu;
            if (kgyVar != null) {
                this.fi.setColorFilter(kgyVar.yo());
            }
            canvas.save();
            canvas.concat(matrix);
            this.gf.set(0, 0, bitmapAt.getWidth(), bitmapAt.getHeight());
            boolean zCt = this.ahm.ct();
            Rect rect = this.ra;
            if (zCt) {
                rect.set(0, 0, (int) (this.yo.kgy() * fKgy), (int) (this.yo.ahm() * fKgy));
            } else {
                rect.set(0, 0, (int) (bitmapAt.getWidth() * fKgy), (int) (bitmapAt.getHeight() * fKgy));
            }
            canvas.drawBitmap(bitmapAt, this.gf, this.ra, this.fi);
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.ahm.rz.rz.kgy, com.bytedance.adsdk.ahm.kgy.kgy.ct
    public void kgy(RectF rectF, Matrix matrix, boolean z) {
        super.kgy(rectF, matrix, z);
        if (this.yo != null) {
            float fKgy = com.bytedance.adsdk.ahm.noq.noq.kgy();
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.yo.kgy() * fKgy, this.yo.ahm() * fKgy);
            this.kgy.mapRect(rectF);
        }
    }
}
