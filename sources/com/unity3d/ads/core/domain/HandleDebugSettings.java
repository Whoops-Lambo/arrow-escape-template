package com.unity3d.ads.core.domain;

import android.webkit.WebView;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "", "<init>", "()V", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "debugSettings", "Laz2;", "invoke", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;)V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HandleDebugSettings {
    public final void invoke(@NotNull NativeConfigurationOuterClass.DebugSettings debugSettings) {
        debugSettings.getClass();
        WebView.setWebContentsDebuggingEnabled(debugSettings.getWebviewInspectable());
    }
}
