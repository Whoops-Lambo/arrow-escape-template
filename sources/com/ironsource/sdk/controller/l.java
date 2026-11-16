package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4990t8;
import com.ironsource.InterfaceC5040w4;
import com.ironsource.InterfaceC5058x4;
import com.ironsource.InterfaceC5076y4;
import com.ironsource.Sb;
import com.ironsource.X4;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface l {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        void a(@NotNull f.a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface b {
        void a(@NotNull Sb sb);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(X4 x4);

    void a(X4 x4, Map<String, String> map, InterfaceC5040w4 interfaceC5040w4);

    void a(X4 x4, Map<String, String> map, InterfaceC5058x4 interfaceC5058x4);

    void a(f.c cVar, @Nullable a aVar);

    void a(String str, InterfaceC5058x4 interfaceC5058x4);

    void a(String str, String str2, X4 x4, InterfaceC5040w4 interfaceC5040w4);

    void a(String str, String str2, X4 x4, InterfaceC5058x4 interfaceC5058x4);

    void a(String str, String str2, X4 x4, InterfaceC5076y4 interfaceC5076y4);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, InterfaceC5040w4 interfaceC5040w4);

    void a(JSONObject jSONObject, InterfaceC5058x4 interfaceC5058x4);

    void a(JSONObject jSONObject, InterfaceC5076y4 interfaceC5076y4);

    boolean a(String str);

    void b();

    void b(Context context);

    void b(X4 x4);

    void b(X4 x4, Map<String, String> map, InterfaceC5058x4 interfaceC5058x4);

    void b(JSONObject jSONObject);

    void e();

    @Deprecated
    void f();

    void g();

    C4990t8.c h();
}
