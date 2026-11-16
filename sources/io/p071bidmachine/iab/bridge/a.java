package io.p071bidmachine.iab.bridge;

import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static c a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (c cVar : a) {
                cVar.getClass();
                if (str.startsWith("nativestorage://")) {
                    return cVar;
                }
            }
            return null;
        }
        return null;
    }
}
