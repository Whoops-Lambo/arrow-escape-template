package com.adsurge.adn.oversea_ad;

import android.app.Activity$ScreenCaptureCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Rambutan implements Activity$ScreenCaptureCallback {
    public static final Quarenden[] c = new Quarenden[0];
    public static final Pomelo d = new Pomelo();
    public final Avocado a = new Avocado(3);
    public volatile String b;

    public final String a() {
        Quarenden[] quarendenArr;
        try {
            StringBuilder sb = new StringBuilder();
            synchronized (this.a) {
                quarendenArr = (Quarenden[]) this.a.b.toArray(c);
                this.a.b.clear();
            }
            if (quarendenArr.length == 0) {
                return null;
            }
            for (Quarenden quarenden : quarendenArr) {
                if (quarenden == null) {
                    break;
                }
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(Cprivate.a(quarenden.a) + ":" + quarenden.b);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public void onScreenCaptured() {
        synchronized (this.a) {
            this.a.a(new Quarenden(this.b));
        }
    }
}
