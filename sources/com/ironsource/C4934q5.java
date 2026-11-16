package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.q5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4934q5 implements Ob<String, com.ironsource.mediationsdk.d.a> {
    @Override // com.ironsource.Ob
    @NotNull
    public com.ironsource.mediationsdk.d.a a(@NotNull String str) throws JSONException {
        str.getClass();
        com.ironsource.mediationsdk.d.a aVarA = com.ironsource.mediationsdk.d.b().a(IronSourceNetworkBridge.jsonObjectInit(str));
        aVarA.getClass();
        return aVarA;
    }
}
