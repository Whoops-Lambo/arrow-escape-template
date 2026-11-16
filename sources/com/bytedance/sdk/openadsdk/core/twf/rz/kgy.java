package com.bytedance.sdk.openadsdk.core.twf.rz;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.media3.common.MimeTypes;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.utils.gbb;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class kgy {
    public static final Set<String> kgy = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.twf.rz.kgy.1
        {
            add("image/jpeg");
            add(MimeTypes.IMAGE_PNG);
            add(MimeTypes.IMAGE_BMP);
            add("image/gif");
            add("image/jpg");
        }
    };
    public static Set<String> ahm = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.twf.rz.kgy.2
        {
            add("application/x-javascript");
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum ahm {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.twf.rz.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum EnumC0266kgy {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    @NonNull
    public static Point kgy(Context context, int i, int i2, ahm ahmVar) {
        if (context == null) {
            context = xh.kgy();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iAhm = gbb.ahm(context, i);
        int iAhm2 = gbb.ahm(context, i2);
        if (iAhm > width || iAhm2 > height) {
            Point point2 = new Point();
            if (ahm.HTML_RESOURCE == ahmVar) {
                point2.x = Math.min(width, iAhm);
                point2.y = Math.min(height, iAhm2);
            } else {
                float f = iAhm;
                float f2 = f / width;
                float f3 = iAhm2;
                float f4 = f3 / height;
                if (f2 >= f4) {
                    point2.x = width;
                    point2.y = (int) (f3 / f2);
                } else {
                    point2.x = (int) (f / f4);
                    point2.y = height;
                }
            }
            int i3 = point2.x;
            if (i3 >= 0 && point2.y >= 0) {
                point2.x = gbb.rz(context, i3);
                point2.y = gbb.rz(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
