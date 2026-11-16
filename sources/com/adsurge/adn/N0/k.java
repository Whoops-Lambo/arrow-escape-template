package com.adsurge.adn.N0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class k extends com.adsurge.adn.P0.a {
    public static final /* synthetic */ boolean i = true;

    @Override // com.adsurge.adn.P0.a
    public Bitmap a(Canvas canvas, Paint paint, int i2, Bitmap bitmap, com.adsurge.adn.O0.b bVar) {
        Bitmap bitmapDecodeStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i2;
        options.inMutable = true;
        options.inBitmap = bitmap;
        Bitmap bitmap2 = null;
        try {
            ((com.adsurge.adn.O0.a) this.a).reset();
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(((com.adsurge.adn.O0.a) this.a).a(), null, options);
            } catch (IllegalArgumentException unused) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i2;
                options2.inMutable = true;
                bitmapDecodeStream = BitmapFactory.decodeStream(((com.adsurge.adn.O0.a) this.a).a(), null, options2);
            }
            try {
                if (!i && bitmapDecodeStream == null) {
                    throw new AssertionError();
                }
                paint.setXfermode(null);
                canvas.drawBitmap(bitmapDecodeStream, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                return bitmapDecodeStream;
            } catch (IOException e) {
                bitmap2 = bitmapDecodeStream;
                e = e;
                e.printStackTrace();
                return bitmap2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public k(com.adsurge.adn.O0.a aVar) {
        super(aVar);
    }
}
