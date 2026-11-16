package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4866m9 {

    @NotNull
    public static final C4866m9 a = new C4866m9();

    @NotNull
    public static final JSONObject a() throws JSONException {
        new C4670ba().b(ContextProvider.getInstance().getApplicationContext());
        String string = new C4848l9().a().toString();
        string.getClass();
        We.c(string);
        JSONObject jSONObjectPut = IronSourceNetworkBridge.jsonObjectInit().put("data", Q9.e(C4916p5.b().c(), string));
        jSONObjectPut.getClass();
        return jSONObjectPut;
    }

    private C4866m9() {
    }
}
