package com.bytedance.sdk.component.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class uq {
    public static Bitmap kgy(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (i > 0 && i2 > 0) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (i < width && i2 < height) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(i / width, i2 / height);
                    return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "eec5mAKsXNOJRsQ=", "XOs5pwavYN2FaN5JgRCw", TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173);
                th.getMessage();
                return null;
            }
        }
        return bitmap;
    }

    public static byte[] kgy(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getByteCount());
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
