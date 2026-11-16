package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4632n0 extends AbstractC1149 {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static final String f411 = StringFog.decrypt("rqnXw3vOR3OZrtbYX9g=\n", "+MCytDqqNDs=\n");

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public C4630m0 f413;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public Class f414;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final C4622i0 f417;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public C0619 f419;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final WeakHashMap f420 = new WeakHashMap();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final WeakHashMap f416 = new WeakHashMap();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final WeakHashMap f415 = new WeakHashMap();

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final ArrayList f412 = new ArrayList();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final ViewOnLayoutChangeListenerC4620h0 f418 = new ViewOnLayoutChangeListenerC4620h0(this);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m408(View view) {
        Activity activityM420;
        try {
            if (this.f414 == null) {
                this.f414 = Class.forName(this.f413.f403);
            }
            Activity activityMo888 = AbstractC1227.m885().mo888();
            if (activityMo888 == null) {
                return;
            }
            if (this.f413.f391.isEmpty() || (activityM420 = AbstractC4634o0.m420(view)) == null || !this.f413.f391.contains(activityM420.getClass().getName())) {
                AbstractC4631n.m405(new C4626k0(this, activityMo888, view));
            }
        } catch (Throwable th) {
            AbstractC0509.m488(f411, StringFog.decrypt("UVKOBOcgPHlgVJUF8iA4cHVTj0s=\n", "FCD8a5UAWxw=\n") + this.f413.f403 + StringFog.decrypt("uHJ3\n", "mF9XQ+EnI54=\n") + th.getLocalizedMessage());
            m409();
        }
    }

    public C4632n0(JSONObject jSONObject, C0619 c0619) {
        this.f413 = new C4630m0();
        this.f413 = new C4630m0(jSONObject);
        this.f419 = c0619;
        C4622i0 c4622i0 = new C4622i0(this);
        this.f417 = c4622i0;
        C0883.m637().m639(c4622i0);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00de A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m407(C4632n0 c4632n0, ArrayList arrayList) {
        ArrayList arrayList2;
        int size;
        int i;
        WebView webView;
        List listAsList;
        C1130 c1130;
        C1199 c1199;
        C0890 c0890;
        c4632n0.getClass();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View view = (View) arrayList.get(i2);
            C4630m0 c4630m0 = c4632n0.f413;
            if (c4632n0.f419 != null) {
                List list = c4630m0.f389;
                if (list != null && !list.isEmpty()) {
                    String name = view.getClass().getPackage().getName();
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String strJoin = (String) it.next();
                            if (!TextUtils.isEmpty(strJoin)) {
                                List listAsList2 = Arrays.asList(strJoin.split(StringFog.decrypt("KrdN\n", "cZkQegOTZ7Y=\n")));
                                if (listAsList2.size() > 3) {
                                    strJoin = TextUtils.join(StringFog.decrypt("zA==\n", "4qh3epOZeRI=\n"), listAsList2.subList(0, 3));
                                }
                            } else {
                                strJoin = null;
                            }
                            if (!TextUtils.isEmpty(strJoin) && name.startsWith(strJoin)) {
                                C0619 c0619 = c4632n0.f419;
                                c1130 = c0619.f1521;
                                c1199 = c0619.f1520;
                                c0890 = c1199.f3629;
                                if (c1130.m838(c0890, c0890.f2386, c1199, Collections.singletonList(view)).m755()) {
                                    if (c4630m0.f398) {
                                        if (((C4632n0) c4632n0.f416.get(view)) == null) {
                                            c4632n0.f416.put(view, c4632n0);
                                            c4632n0.mo352(IronSourceNetworkBridge.jsonObjectInit(), view, null);
                                        } else if (c4630m0.f397) {
                                            c4632n0.mo352(IronSourceNetworkBridge.jsonObjectInit(), view, null);
                                        }
                                    } else {
                                        arrayList2 = new ArrayList();
                                        AbstractC4634o0.m419(view, WebView.class, null, false, c4630m0.f396, c4630m0.f392, c4630m0.f390, arrayList2);
                                        if (view instanceof WebView) {
                                            arrayList2.add((WebView) view);
                                        }
                                        size = arrayList2.size();
                                        i = 0;
                                        while (i < size) {
                                            Object obj = arrayList2.get(i);
                                            i++;
                                            webView = (WebView) obj;
                                            if (c4632n0.f416.get(webView) != null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    C0619 c06110 = c4632n0.f419;
                    c1130 = c06110.f1521;
                    c1199 = c06110.f1520;
                    c0890 = c1199.f3629;
                    if (c1130.m838(c0890, c0890.f2386, c1199, Collections.singletonList(view)).m755()) {
                        if (c4630m0.f398) {
                            if (((C4632n0) c4632n0.f416.get(view)) == null) {
                                c4632n0.f416.put(view, c4632n0);
                                c4632n0.mo352(IronSourceNetworkBridge.jsonObjectInit(), view, null);
                            } else if (c4630m0.f397) {
                                c4632n0.mo352(IronSourceNetworkBridge.jsonObjectInit(), view, null);
                            }
                        } else {
                            arrayList2 = new ArrayList();
                            AbstractC4634o0.m419(view, WebView.class, null, false, c4630m0.f396, c4630m0.f392, c4630m0.f390, arrayList2);
                            if (view instanceof WebView) {
                                arrayList2.add((WebView) view);
                            }
                            size = arrayList2.size();
                            i = 0;
                            while (i < size) {
                                Object obj2 = arrayList2.get(i);
                                i++;
                                webView = (WebView) obj2;
                                if (c4632n0.f416.get(webView) != null && webView.getClass().getName().startsWith(c4630m0.f402)) {
                                    N0 n0 = new N0();
                                    c4632n0.f420.put(webView, n0);
                                    String str = c4630m0.f401;
                                    if (TextUtils.isEmpty(c4630m0.f399)) {
                                        listAsList = null;
                                    } else {
                                        listAsList = Arrays.asList(c4630m0.f399.split(StringFog.decrypt("Ug==\n", "fnLQVlVH4zs=\n")));
                                    }
                                    boolean z = c4630m0.f395;
                                    boolean z2 = c4630m0.f400;
                                    boolean z3 = c4630m0.f394;
                                    n0.f186 = z;
                                    n0.f182 = new V0(str, z3);
                                    n0.f185 = z2;
                                    n0.f188 = listAsList;
                                    n0.f3332 = new C4628l0(c4632n0);
                                    n0.m355(webView);
                                    n0.f187 = Integer.toHexString(webView.hashCode());
                                    c4632n0.f416.put(webView, c4632n0);
                                }
                            }
                        }
                    }
                }
            } else if (c4630m0.f398) {
                if (((C4632n0) c4632n0.f416.get(view)) == null) {
                    c4632n0.f416.put(view, c4632n0);
                    c4632n0.mo352(IronSourceNetworkBridge.jsonObjectInit(), view, null);
                } else if (c4630m0.f397) {
                    c4632n0.mo352(IronSourceNetworkBridge.jsonObjectInit(), view, null);
                }
            } else {
                arrayList2 = new ArrayList();
                AbstractC4634o0.m419(view, WebView.class, null, false, c4630m0.f396, c4630m0.f392, c4630m0.f390, arrayList2);
                if (view instanceof WebView) {
                    arrayList2.add((WebView) view);
                }
                size = arrayList2.size();
                i = 0;
                while (i < size) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    webView = (WebView) obj3;
                    if (c4632n0.f416.get(webView) != null) {
                    }
                }
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1149
    /* JADX INFO: renamed from: ﾒ */
    public final /* bridge */ /* synthetic */ String mo354(Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m409() {
        this.f3332 = null;
        C0883.m637().m638(this.f417);
        HashSet hashSet = new HashSet(this.f415.keySet());
        this.f415.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).removeOnLayoutChangeListener(this.f418);
        }
    }
}
