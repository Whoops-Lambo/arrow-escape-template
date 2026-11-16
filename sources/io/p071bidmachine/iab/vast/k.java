package io.p071bidmachine.iab.vast;

import android.os.Bundle;
import android.text.TextUtils;
import io.p071bidmachine.ads.networks.gam_dynamic.x;
import io.p071bidmachine.iab.vast.processor.url.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class k {
    public static final x a;

    static {
        x xVar = new x();
        xVar.add(new a());
        a = xVar;
    }

    public static String a(Bundle bundle, String str) {
        int i;
        if (str == null) {
            return null;
        }
        x xVar = a;
        int size = xVar.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = xVar.get(i2);
            i2++;
            ((a) obj).getClass();
            if (!TextUtils.isEmpty(str) && bundle.containsKey("params_error_code") && (i = bundle.getInt("params_error_code", -1)) > -1) {
                c.a("VastAdUrlProcessor", "Before prepare url: %s", str);
                if (str.contains("[ERRORCODE]")) {
                    str = str.replace("[ERRORCODE]", String.valueOf(i));
                }
                if (str.contains("%5BERRORCODE%5D")) {
                    str = str.replace("%5BERRORCODE%5D", String.valueOf(i));
                }
                c.a("VastAdUrlProcessor", "After prepare url: %s", str);
            }
        }
        return str;
    }
}
