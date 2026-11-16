package defpackage;

import android.os.Bundle;
import android.view.View;
import com.facebook.a0;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class pt {
    public static final pt a = new pt();

    public static final void a(yh0 yh0Var, View view, View view2) {
        if (lz.a.contains(pt.class)) {
            return;
        }
        try {
            yh0Var.getClass();
            String str = yh0Var.a;
            Bundle bundleK = xw0.k(yh0Var, view, view2);
            a.b(bundleK);
            a0.c().execute(new q4(17, str, bundleK));
        } catch (Throwable th) {
            lz.a(pt.class, th);
        }
    }

    public final void b(Bundle bundle) {
        Locale locale;
        if (lz.a.contains(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                double dDoubleValue = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String strGroup = matcher.group(0);
                        try {
                            locale = a0.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            locale.getClass();
                        }
                        dDoubleValue = NumberFormat.getNumberInstance(locale).parse(strGroup).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                bundle.putDouble("_valueToSum", dDoubleValue);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }
}
