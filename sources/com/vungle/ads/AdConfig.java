package com.vungle.ads;

import com.mbridge.msdk.MBridgeConstans;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001a\u001b\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/vungle/ads/AdConfig;", "", "<init>", "()V", "", "isBackButtonImmediatelyEnabled", "Laz2;", "setBackButtonImmediatelyEnabled", "(Z)V", "", "getSettings", "()I", "", MBridgeConstans.EXTRA_KEY_WM, "setWatermark", "(Ljava/lang/String;)V", "getWatermark$vungle_ads_release", "()Ljava/lang/String;", "getWatermark", "c", "I", "getAdOrientation", "setAdOrientation", "(I)V", "getAdOrientation$annotations", "adOrientation", "Companion", "Orientation", "Settings", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public class AdConfig {
    public static final int AUTO_ROTATE = 2;
    public static final int IMMEDIATE_BACK = 2;
    public static final int LANDSCAPE = 1;
    public static final int PORTRAIT = 0;
    public int b;
    public LinkedHashMap a = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int adOrientation = 2;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/vungle/ads/AdConfig$Orientation;", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public @interface Orientation {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/vungle/ads/AdConfig$Settings;", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public @interface Settings {
    }

    @Orientation
    public static /* synthetic */ void getAdOrientation$annotations() {
    }

    public final int getAdOrientation() {
        return this.adOrientation;
    }

    /* JADX INFO: renamed from: getSettings, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Nullable
    public final String getWatermark$vungle_ads_release() {
        return (String) this.a.get("WATERMARK");
    }

    public final void setAdOrientation(int i) {
        this.adOrientation = i;
    }

    public final void setBackButtonImmediatelyEnabled(boolean isBackButtonImmediatelyEnabled) {
        int i = this.b;
        this.b = isBackButtonImmediatelyEnabled ? i | 2 : i & (-3);
    }

    public final void setWatermark(@NotNull String watermark) {
        watermark.getClass();
        this.a.put("WATERMARK", watermark);
    }
}
