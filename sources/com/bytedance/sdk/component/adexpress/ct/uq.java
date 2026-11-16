package com.bytedance.sdk.component.adexpress.ct;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.kgy.sx;
import com.bytedance.sdk.component.utils.wy;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class uq {
    private sx ahm;
    private WeakReference<sx> kgy;

    @JavascriptInterface
    public void invokeMethod(String str) {
        sx sxVar;
        sx sxVar2 = this.ahm;
        if (sxVar2 != null) {
            sxVar2.invokeMethod(str);
            return;
        }
        WeakReference<sx> weakReference = this.kgy;
        if (weakReference == null || (sxVar = weakReference.get()) == null) {
            return;
        }
        sxVar.invokeMethod(str);
    }

    public uq(sx sxVar) {
        kgy(sxVar);
    }

    public void kgy(sx sxVar) {
        if (wy.kgy()) {
            this.ahm = sxVar;
            this.kgy = null;
        } else {
            this.kgy = new WeakReference<>(sxVar);
            this.ahm = null;
        }
    }
}
