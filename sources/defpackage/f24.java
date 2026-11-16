package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzcew;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f24 {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final Context c;
    public final zzcew d;

    public final synchronized void a(String str) {
        try {
            HashMap map = this.a;
            if (map.containsKey(str)) {
                return;
            }
            boolean zEquals = Objects.equals(str, "__default__");
            Context context = this.c;
            SharedPreferences defaultSharedPreferences = zEquals ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0);
            d24 d24Var = new d24(this, str);
            map.put(str, d24Var);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(d24Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public f24(Context context, zzcew zzcewVar) {
        this.c = context;
        this.d = zzcewVar;
    }
}
