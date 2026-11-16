package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.A2;
import com.ironsource.C4984t2;
import com.ironsource.InterfaceC4680c2;
import java.net.URL;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class f implements g {

    @NotNull
    private final A2 a;

    @NotNull
    private final String b;

    @Override // com.ironsource.mediationsdk.g
    public boolean b() {
        return this.a.g() > 0;
    }

    public f(@NotNull A2 a2, @NotNull String str) {
        a2.getClass();
        str.getClass();
        this.a = a2;
        this.b = str;
    }

    @Override // com.ironsource.mediationsdk.g
    @NotNull
    public e.a a(@NotNull Context context, @NotNull h hVar, @NotNull InterfaceC4680c2 interfaceC4680c2) throws JSONException {
        context.getClass();
        hVar.getClass();
        interfaceC4680c2.getClass();
        JSONObject jSONObjectA = a(context, hVar);
        String strA = this.a.a(hVar.t());
        if (hVar.t()) {
            return new C4984t2(interfaceC4680c2, new URL(strA), jSONObjectA, hVar.u(), this.a);
        }
        return new e.a(interfaceC4680c2, new URL(strA), jSONObjectA, hVar.u(), this.a);
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean a() {
        return this.a.n();
    }

    private final JSONObject a(Context context, h hVar) throws JSONException {
        JSONObject jSONObjectA = d.b().a(hVar);
        jSONObjectA.getClass();
        return jSONObjectA;
    }
}
