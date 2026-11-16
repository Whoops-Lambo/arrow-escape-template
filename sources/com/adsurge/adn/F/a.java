package com.adsurge.adn.F;

import android.text.TextUtils;
import com.adsurge.adn.lib.dynamic.QuickJS;
import com.adsurge.adn.p048o1.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class a extends d {
    public QuickJS a;

    @Override // com.adsurge.adn.F.d
    public boolean c() {
        return this.a != null;
    }

    public a() {
        try {
            this.a = QuickJS.a();
        } catch (Exception unused) {
            g.a();
        }
    }

    @Override // com.adsurge.adn.F.d
    public Object a(String str) {
        if (c() && !TextUtils.isEmpty(str)) {
            return this.a.a(str);
        }
        return null;
    }

    @Override // com.adsurge.adn.F.d
    public void b() {
        if (!c()) {
            return;
        }
        this.a.close();
        this.a = null;
    }

    @Override // com.adsurge.adn.F.d
    public void a(String str, Class cls, Object obj) {
        if (c()) {
            this.a.a(str, cls, obj);
        }
    }
}
