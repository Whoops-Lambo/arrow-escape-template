package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Logger;
import com.ironsource.C4788i2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class PackageManagerHelper {
    public static final String a = Logger.g("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        String str = C4788i2.e;
        String str2 = a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            Logger loggerE = Logger.e();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : C4788i2.e);
            loggerE.a(str2, sb.toString());
        } catch (Exception e) {
            Logger loggerE2 = Logger.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (z) {
                str = "enabled";
            }
            sb2.append(str);
            loggerE2.b(str2, sb2.toString(), e);
        }
    }
}
