package com.fyber.inneractive.sdk.util;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class u {
    public static Float a(Uri uri) {
        int i;
        try {
            InputStream inputStreamOpenInputStream = IAConfigManager.Q.v.a.getApplicationContext().getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                if (inputStreamOpenInputStream == null) {
                    return null;
                }
                inputStreamOpenInputStream.close();
                return null;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                int i2 = options.outHeight;
                if (i2 > 0 && (i = options.outWidth) > 0) {
                    Float fValueOf = Float.valueOf(i / i2);
                    inputStreamOpenInputStream.close();
                    return fValueOf;
                }
                inputStreamOpenInputStream.close();
            } catch (Throwable th) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            IAlog.b("%sFailed to retrieve image aspect ratio. Reason: %s", IAlog.a(u.class), e.getMessage());
        } catch (Exception e) {
            IAlog.b("%sFailed to retrieve image aspect ratio. Reason: %s", IAlog.a(u.class), e.getMessage());
        }
        return null;
    }

    public static String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl == null || fileExtensionFromUrl.isEmpty()) {
            return null;
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase(Locale.US));
    }
}
