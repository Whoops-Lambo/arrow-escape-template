package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class m1 extends AbstractC0511 implements k1, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static final String f404 = StringFog.decrypt("Q1P0wCNaLRJxTdvABEwVH3hf6A==\n", "FDqapEwte3s=\n");

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public l1 f405;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final WeakHashMap f406;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public Class f407;

    public m1(JSONObject jSONObject) {
        super(null);
        this.f406 = new WeakHashMap();
        this.f405 = new l1();
        m400(jSONObject);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            View viewM394 = m394(view, this.f407);
            if (viewM394 != null) {
                if (!this.f406.containsKey(viewM394)) {
                    this.f406.put(viewM394, Boolean.TRUE);
                    m504(IronSourceNetworkBridge.jsonObjectInit(), (Object) viewM394, Integer.toHexString(viewM394.hashCode()));
                }
                view.removeOnLayoutChangeListener(this);
            }
        } catch (Throwable th) {
            AbstractC1290.m905(f404, StringFog.decrypt("YXHfsWY/USoEbMOSdWZXMVBAxb96eF0=\n", "JAOt3hQfOEQ=\n"), th, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.k1
    /* JADX INFO: renamed from: ﾇ */
    public final void mo381(View view) {
        View viewM394 = m394(view, this.f407);
        if (viewM394 == null || this.f406.remove(viewM394) == null) {
            return;
        }
        m501(view);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m400(JSONObject jSONObject) {
        l1 l1Var = new l1(jSONObject);
        this.f1148 = l1Var;
        this.f405 = l1Var;
        try {
            this.f407 = Class.forName(l1Var.f388);
            C0883.m637().m639(this);
        } catch (ClassNotFoundException e) {
            AbstractC0509.m489(f404, StringFog.decrypt("fBESoSHoxz5KFwWgOqbMd00MQKslrcUjSkMGvDyliw==\n", "OWNgzlPIq1c=\n") + l1Var.f388 + StringFog.decrypt("o7o=\n", "mZrD4x8xM3c=\n") + e.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0511
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final View mo396(Object obj) {
        return (View) obj;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0511
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final M0 mo397() {
        return new O0();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0511
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void mo398(Object obj, ArrayList arrayList) {
        l1 l1Var = this.f405;
        AbstractC4634o0.m419((View) obj, WebView.class, l1Var.f387, true, false, null, l1Var.f1258, arrayList);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0511
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0696 mo399() {
        return this;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.k1
    /* JADX INFO: renamed from: ﾒ */
    public final void mo382(View view) {
        View viewM395;
        View viewM394 = m394(view, this.f407);
        if (viewM394 != null) {
            if (this.f406.containsKey(viewM394)) {
                return;
            }
            this.f406.put(viewM394, Boolean.TRUE);
            m504(IronSourceNetworkBridge.jsonObjectInit(), (Object) viewM394, Integer.toHexString(viewM394.hashCode()));
            return;
        }
        if (TextUtils.isEmpty(this.f405.f386) || (viewM395 = m395(view, this.f405.f386)) == null) {
            return;
        }
        viewM395.addOnLayoutChangeListener(this);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static View m394(View view, Class cls) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (cls.isAssignableFrom(childAt.getClass())) {
                return childAt;
            }
            View viewM394 = m394(childAt, cls);
            if (viewM394 != null) {
                return viewM394;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static View m395(View view, String str) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().startsWith(str)) {
                return childAt;
            }
            View viewM395 = m395(childAt, str);
            if (viewM395 != null) {
                return viewM395;
            }
        }
        return null;
    }
}
