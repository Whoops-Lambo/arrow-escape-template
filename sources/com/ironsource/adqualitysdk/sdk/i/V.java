package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class V implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Y f214;

    public V(Y y) {
        this.f214 = y;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        Y y = this.f214;
        String str = (String) arrayList.get(0);
        y.getClass();
        switch (str.hashCode()) {
            case -1810696374:
                if (str.equals(StringFog.decrypt("0z53LxTvQe7a\n", "n3cxale2AqI=\n"))) {
                    return WebViewEventCategory.LIFECYCLE;
                }
                return null;
            case -1166291365:
                if (str.equals(StringFog.decrypt("yNrDZVdn5w==\n", "m46MNxYgoqY=\n"))) {
                    return WebViewEventCategory.STORAGE;
                }
                return null;
            case -276710660:
                if (str.equals(StringFog.decrypt("nQJkZ0mE4POSDnI=\n", "y0sgIgbUrLI=\n"))) {
                    return WebViewEventCategory.VIDEOPLAYER;
                }
                return null;
            case -54373961:
                if (str.equals(StringFog.decrypt("R5mqzdF1BZ5Sn7Da\n", "BNbkg5Q2Udc=\n"))) {
                    return WebViewEventCategory.CONNECTIVITY;
                }
                return null;
            case 63879010:
                if (str.equals(StringFog.decrypt("YfzPPhQ=\n", "Ir2MdlErBjo=\n"))) {
                    return WebViewEventCategory.CACHE;
                }
                return null;
            case 1167718561:
                if (str.equals(StringFog.decrypt("uXHqiOIHATiv\n", "+yOlyaZEQGs=\n"))) {
                    return WebViewEventCategory.BROADCAST;
                }
                return null;
            case 1813675631:
                if (str.equals(StringFog.decrypt("zNg3lsghTg==\n", "np1mw41yGuc=\n"))) {
                    return WebViewEventCategory.REQUEST;
                }
                return null;
            case 1815350732:
                if (str.equals(StringFog.decrypt("s552RFlf+w==\n", "4dslCxUJvvk=\n"))) {
                    return WebViewEventCategory.RESOLVE;
                }
                return null;
            case 1926303783:
                if (str.equals(StringFog.decrypt("/Hoc/OWS\n", "vT5JsqzGIPo=\n"))) {
                    return WebViewEventCategory.ADUNIT;
                }
                return null;
            default:
                return null;
        }
    }
}
