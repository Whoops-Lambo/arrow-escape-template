package io.p071bidmachine.iab.vast;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class i {
    public static final WeakHashMap a = new WeakHashMap();

    public static synchronized h a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = a.entrySet().iterator();
        while (it.hasNext()) {
            h hVar = (h) ((Map.Entry) it.next()).getKey();
            if (hVar.a.equals(str)) {
                return hVar;
            }
        }
        return null;
    }
}
