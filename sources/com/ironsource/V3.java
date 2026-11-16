package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class V3 implements InterfaceC5043w7 {
    private InterfaceC5025v7 a;

    private InterfaceC5025v7 a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(C4664b4.j.g0) == 1) {
            return new BroadcastReceiverStrategy(this);
        }
        return !M1.c(context, "android.permission.ACCESS_NETWORK_STATE") ? new BroadcastReceiverStrategy(this) : new C4905oc(this);
    }

    public void b(Context context) {
        this.a.b(context);
    }

    public void c(Context context) {
        this.a.a(context);
    }

    public V3(JSONObject jSONObject, Context context) {
        InterfaceC5025v7 interfaceC5025v7A = a(jSONObject, context);
        this.a = interfaceC5025v7A;
        Logger.i("V3", "created ConnectivityAdapter with strategy ".concat(interfaceC5025v7A.getClass().getSimpleName()));
    }

    @Override // com.ironsource.InterfaceC5043w7
    public void b(String str, JSONObject jSONObject) {
    }

    public void b() {
        this.a.a();
    }

    @Override // com.ironsource.InterfaceC5043w7
    public void a(String str, JSONObject jSONObject) {
    }

    public JSONObject a(Context context) {
        return this.a.c(context);
    }

    @Override // com.ironsource.InterfaceC5043w7
    public void a() {
    }
}
