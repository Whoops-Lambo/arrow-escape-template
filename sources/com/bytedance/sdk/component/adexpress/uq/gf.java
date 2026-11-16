package com.bytedance.sdk.component.adexpress.uq;

import android.net.Uri;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class gf {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum kgy {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*"),
        VIDEO("video/mp4");

        private String noq;

        public String kgy() {
            return this.noq;
        }

        kgy(String str) {
            this.noq = str;
        }
    }

    public static kgy kgy(String str) {
        kgy kgyVar = kgy.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        return kgy.CSS;
                    }
                    if (path.endsWith(".js")) {
                        return kgy.JS;
                    }
                    if (!path.endsWith(BrandSafetyUtils.a) && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico")) {
                        if (path.endsWith(".html")) {
                            return kgy.HTML;
                        }
                        if (path.endsWith(".mp4")) {
                            return kgy.VIDEO;
                        }
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ804lGxA==", "bvwhoBe1ZdQ=", "XOs5uAqxbA==", 42);
            }
        }
        return kgyVar;
    }
}
