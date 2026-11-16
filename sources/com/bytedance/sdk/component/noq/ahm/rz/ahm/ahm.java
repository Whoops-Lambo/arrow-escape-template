package com.bytedance.sdk.component.noq.ahm.rz.ahm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.bytedance.sdk.component.noq.ahm.rz.noq;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm {
    private int ct;
    private final ImageView.ScaleType fi;
    private final int noq;
    private final Bitmap.Config rz;
    private int uq;
    private final int yo;
    public static final ImageView.ScaleType kgy = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config ahm = Bitmap.Config.ARGB_4444;
    private final int gf = 1280;
    private final int ra = 83886080;

    public Bitmap kgy(byte[] bArr, noq noqVar) {
        Context contextKgy;
        boolean zAhm;
        Bitmap bitmapDecodeByteArray;
        if (noqVar != null) {
            contextKgy = noqVar.kgy();
            zAhm = noqVar.ahm();
        } else {
            contextKgy = null;
            zAhm = false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.uq == 0 && this.ct == 0) {
            options.inPreferredConfig = this.rz;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int iKgy = kgy(this.uq, this.ct, i, i2);
            int iKgy2 = kgy(this.ct, this.uq, i2, i);
            options.inJustDecodeBounds = false;
            int iKgy3 = kgy(i, i2, iKgy, iKgy2, this.noq, this.yo);
            options.inSampleSize = iKgy3;
            float fKgy = kgy(iKgy3, i, i2, iKgy, iKgy2);
            boolean z = fKgy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fKgy < 1.0f && contextKgy != null && zAhm;
            if (z) {
                options.inScaled = true;
                options.inDensity = Integer.MAX_VALUE;
                options.inTargetDensity = Math.round(fKgy * 2.1474836E9f);
            }
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (z && bitmapDecodeByteArray != null) {
                bitmapDecodeByteArray.setDensity(contextKgy.getResources().getDisplayMetrics().densityDpi);
            }
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iKgy || bitmapDecodeByteArray.getHeight() > iKgy2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iKgy, iKgy2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 83886080) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }

    public ahm(int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, int i3, int i4) {
        this.rz = config;
        this.uq = i;
        this.ct = i2;
        this.fi = scaleType;
        this.noq = i3;
        this.yo = i4;
        kgy(i, i2);
    }

    public static int kgy(int i, int i2, int i3, int i4, int i5, int i6) {
        double dMin = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        if (i5 > 0 && i6 > 0) {
            dMin = Math.max(dMin, Math.min(((double) Math.max(i, i2)) / ((double) Math.max(i5, i6)), ((double) Math.min(i, i2)) / ((double) Math.min(i5, i6))));
        }
        return Integer.highestOneBit((int) dMin);
    }

    private float kgy(int i, int i2, int i3, int i4, int i5) {
        float f = i;
        return Math.max(i4 / (i2 / f), i5 / (i3 / f));
    }

    private static int kgy(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (i == 0) {
            return (int) (((double) i3) * (((double) i2) / ((double) i4)));
        }
        if (i2 == 0) {
            return i;
        }
        double d = ((double) i4) / ((double) i3);
        double d2 = i2;
        return ((double) i) * d > d2 ? (int) (d2 / d) : i;
    }

    private void kgy(int i, int i2) {
        if (i > 1280 && i2 > 1280) {
            if (i > i2) {
                this.uq = 1280;
                this.ct = (i2 * 1280) / i;
                return;
            } else {
                this.uq = (i * 1280) / i2;
                this.ct = 1280;
                return;
            }
        }
        if (i > 1280) {
            this.uq = 1280;
            this.ct = (i2 * 1280) / i;
        } else if (i2 > 1280) {
            this.uq = (i * 1280) / i2;
            this.ct = 1280;
        }
    }
}
