package com.bytedance.adsdk.ahm.noq;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.bytedance.adsdk.ahm.kgy.kgy.gm;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class noq {
    private static final ThreadLocal<PathMeasure> kgy = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.ahm.noq.noq.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> ahm = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.ahm.noq.noq.2
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> rz = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.ahm.noq.noq.3
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> uq = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.ahm.noq.noq.4
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float ct = (float) (Math.sqrt(2.0d) / 2.0d);

    public static boolean ahm(Matrix matrix) {
        float[] fArr = uq.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void kgy(Path path, float f, float f2, float f3) {
        com.bytedance.adsdk.ahm.ct.kgy("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = kgy.get();
        Path path2 = ahm.get();
        Path path3 = rz.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            com.bytedance.adsdk.ahm.ct.ahm("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            com.bytedance.adsdk.ahm.ct.ahm("applyTrimPathIfNeeded");
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = ct.kgy(fMin, length);
            fMax = ct.kgy(fMax, length);
        }
        if (fMin < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fMin = ct.kgy(fMin, length);
        }
        if (fMax < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fMax = ct.kgy(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            com.bytedance.adsdk.ahm.ct.ahm("applyTrimPathIfNeeded");
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        com.bytedance.adsdk.ahm.ct.ahm("applyTrimPathIfNeeded");
    }

    public static boolean kgy(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    public static Path kgy(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointF4.length() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            float f = pointF.x + pointF3.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
            return path;
        }
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    public static void kgy(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float kgy(Matrix matrix) {
        float[] fArr = uq.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = ct;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void kgy(Path path, gm gmVar) {
        if (gmVar == null || gmVar.noq()) {
            return;
        }
        kgy(path, ((com.bytedance.adsdk.ahm.kgy.ahm.uq) gmVar.rz()).gf() / 100.0f, ((com.bytedance.adsdk.ahm.kgy.ahm.uq) gmVar.uq()).gf() / 100.0f, ((com.bytedance.adsdk.ahm.kgy.ahm.uq) gmVar.ct()).gf() / 360.0f);
    }

    public static int kgy(float f, float f2, float f3, float f4) {
        int i = f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (f * 527.0f) : 17;
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = (int) (i * 31 * f3);
        }
        return f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (i * 31 * f4) : i;
    }

    public static float kgy() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float kgy(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap kgy(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean kgy(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void kgy(Canvas canvas, RectF rectF, Paint paint) {
        kgy(canvas, rectF, paint, 31);
    }

    public static void kgy(Canvas canvas, RectF rectF, Paint paint, int i) {
        com.bytedance.adsdk.ahm.ct.kgy("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.bytedance.adsdk.ahm.ct.ahm("Utils#saveLayer");
    }
}
