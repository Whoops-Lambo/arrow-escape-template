package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.wc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5048wc implements InterfaceC5030vc {
    @Override // com.ironsource.InterfaceC5030vc
    public void a(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        context.getClass();
        str.getClass();
        str2.getClass();
        map.getClass();
        IronSourceNetwork.initSDK(context, str, str2, map);
    }

    @Override // com.ironsource.InterfaceC5030vc
    public void b(@NotNull String str) {
        str.getClass();
        SDKUtils.setControllerUrl(str);
    }

    @Override // com.ironsource.InterfaceC5030vc
    public void a(@NotNull Tc tc) {
        tc.getClass();
        IronSourceNetwork.addInitListener(tc);
    }

    @Override // com.ironsource.InterfaceC5030vc
    public void a(@NotNull String str) {
        str.getClass();
        SDKUtils.setControllerConfig(str);
    }

    @Override // com.ironsource.InterfaceC5030vc
    public void a(int i) {
        SDKUtils.setDebugMode(i);
    }
}
