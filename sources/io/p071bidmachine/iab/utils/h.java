package io.p071bidmachine.iab.utils;

import android.graphics.Paint;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public final Paint b;
    public final Paint c;
    public int[] h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public int o;
    public float d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float g = 5.0f;
    public int n = 255;
    public final RectF a = new RectF();

    public h() {
        Paint paint = new Paint();
        this.b = paint;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(0);
        new Paint().setColor(0);
    }
}
