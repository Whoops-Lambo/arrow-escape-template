package com.adsurge.adn.p024g1;

import android.content.Context;
import com.adsurge.adn.I0.m;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c implements b {
    public WeakReference a;

    @Override // com.adsurge.adn.p024g1.b
    public void a() {
        m.e("未知异常，稍后重试");
    }

    public c(Context context) {
        this.a = new WeakReference(context);
    }
}
