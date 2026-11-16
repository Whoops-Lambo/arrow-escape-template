package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᒻ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0843 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object f2237 = new Object();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public volatile C4652y f2238;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final String f2236 = StringFog.decrypt("yEYK+doXVjDLQVj+30pXZMkTDK6PRAYwyEMK8otCAWDOEAyu3URXZ8tBWPyPEQQ8m0cK+txDC2fN\nEAyp3kpWZM4WCqnaRAU9zhAAqI9KBGfMFAGqj0sDZMhKDKrWQVE8yRRdqdhEVjDNE1//2hFXYc5B\nXK6MS1FhnkEMqtwTCzbBRA==\n", "+HI5y+5yMwU=\n");

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final C0843 f2235 = new C0843();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m629(Context context, String str) {
        synchronized (this.f2237) {
            try {
                if (this.f2238 != null) {
                    return;
                }
                C4652y c4652y = new C4652y(new C0884(IronSourceAdQuality.getSDKVersion(), AbstractC0793.m606(str)));
                c4652y.f530.f3033.put(1, C1054.m758(f2236));
                c4652y.m449(context);
                this.f2238 = c4652y;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m628() {
        synchronized (this.f2237) {
            this.f2238 = null;
            C0712.f1791.m585();
        }
    }
}
