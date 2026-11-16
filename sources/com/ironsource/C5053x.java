package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C5053x implements InterfaceC4926pf<JSONObject>, InterfaceC4890nf<C5017v> {

    @NotNull
    private final Map<String, H0> a = new LinkedHashMap();
    private int b;

    /* JADX INFO: renamed from: com.ironsource.x$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4872mf.values().length];
            try {
                iArr[EnumC4872mf.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4872mf.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4872mf.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4872mf.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4872mf.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC4890nf
    public void a(@NotNull C5017v c5017v) {
        c5017v.getClass();
        String strC = c5017v.c();
        Map<String, H0> map = this.a;
        H0 h0 = map.get(strC);
        if (h0 == null) {
            h0 = new H0();
            map.put(strC, h0);
        }
        h0.a(c5017v.a(new C5035w()));
        b(c5017v);
    }

    @Override // com.ironsource.InterfaceC4757g7
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull EnumC4908of enumC4908of) throws JSONException {
        enumC4908of.getClass();
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (Map.Entry<String, H0> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(enumC4908of);
            if (jSONObjectA.length() > 0) {
                jSONObjectJsonObjectInit.put(key, jSONObjectA);
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public final int a() {
        return this.b;
    }

    private final void b(C5017v c5017v) {
        int i = a.a[c5017v.f().ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.b++;
                return;
            }
            if (i != 3 && i != 4 && i != 5) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                return;
            }
            int i2 = this.b;
            if (i2 > 0) {
                this.b = i2 - 1;
            }
        }
    }

    public final boolean b() {
        return !this.a.isEmpty();
    }
}
