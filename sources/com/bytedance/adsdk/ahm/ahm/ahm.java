package com.bytedance.adsdk.ahm.ahm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.ahm.noq.noq;
import com.bytedance.adsdk.ahm.ra;
import com.bytedance.adsdk.ahm.uq;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ahm {
    private static final Object kgy = new Object();
    private final Context ahm;
    private final Map<String, ra> ct;
    private final String rz;
    private uq uq;

    private Bitmap ahm(String str, Bitmap bitmap) {
        synchronized (kgy) {
            this.ct.get(str).kgy(bitmap);
        }
        return bitmap;
    }

    public Bitmap kgy(String str) {
        ra raVar = this.ct.get(str);
        if (raVar == null) {
            return null;
        }
        Bitmap bitmapNu = raVar.nu();
        if (bitmapNu != null) {
            return bitmapNu;
        }
        uq uqVar = this.uq;
        if (uqVar != null) {
            return uqVar.kgy(raVar);
        }
        Context context = this.ahm;
        if (context == null) {
            return null;
        }
        String strGf = raVar.gf();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strGf.startsWith("data:") && strGf.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strGf.substring(strGf.indexOf(44) + 1), 0);
                return ahm(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.rz)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            InputStream inputStreamOpen = context.getAssets().open(this.rz + strGf);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options);
                noq.kgy(inputStreamOpen);
                if (bitmapDecodeStream == null) {
                    return null;
                }
                return ahm(str, noq.kgy(bitmapDecodeStream, raVar.kgy(), raVar.ahm()));
            } catch (IllegalArgumentException unused2) {
                noq.kgy(inputStreamOpen);
                return null;
            } catch (Throwable th) {
                noq.kgy(inputStreamOpen);
                throw th;
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    public ahm(Drawable.Callback callback, String str, uq uqVar, Map<String, ra> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.rz = str.concat("/");
        } else {
            this.rz = str;
        }
        this.ct = map;
        kgy(uqVar);
        if (!(callback instanceof View)) {
            this.ahm = null;
        } else {
            this.ahm = ((View) callback).getContext().getApplicationContext();
        }
    }

    public Bitmap kgy(String str, Bitmap bitmap) {
        Map<String, ra> map = this.ct;
        if (bitmap == null) {
            ra raVar = map.get(str);
            Bitmap bitmapNu = raVar.nu();
            raVar.kgy(null);
            return bitmapNu;
        }
        Bitmap bitmapNu2 = map.get(str).nu();
        ahm(str, bitmap);
        return bitmapNu2;
    }

    public void kgy(uq uqVar) {
        this.uq = uqVar;
    }

    public boolean kgy(Context context) {
        return (context == null && this.ahm == null) || this.ahm.equals(context);
    }
}
