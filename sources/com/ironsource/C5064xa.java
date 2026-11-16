package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.xa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5064xa implements Te<JSONObject> {

    @NotNull
    private final Te<String> a;

    public C5064xa(@NotNull Te<String> te) {
        te.getClass();
        this.a = te;
    }

    @Override // com.ironsource.Te
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return IronSourceNetworkBridge.jsonObjectInit(this.a.a());
    }
}
