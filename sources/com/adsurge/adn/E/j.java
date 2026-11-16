package com.adsurge.adn.E;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public void a(String str, c.C0071c c0071c) {
        if (!TextUtils.isEmpty(str) && c0071c != null) {
            c.C0071c c0071cA = i.a(c0071c);
            c0071cA.a = str;
            this.a.replace(str, c0071cA);
        }
    }

    public void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a.remove(str);
        }
    }

    public c.C0071c c(String str) {
        c.C0071c c0071c;
        if (!TextUtils.isEmpty(str)) {
            c0071c = (c.C0071c) this.a.get(str);
        } else {
            c0071c = null;
        }
        if (c0071c != null) {
            return i.a(c0071c);
        }
        c.C0071c c0071c2 = new c.C0071c();
        c0071c2.a = str;
        return c0071c2;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c.C0071c c0071c = new c.C0071c();
        c0071c.a = str;
        this.a.put(str, c0071c);
    }
}
