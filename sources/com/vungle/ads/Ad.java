package com.vungle.ads;

import defpackage.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/Ad;", "", "", "canPlayAd", "()Ljava/lang/Boolean;", "Laz2;", "load", "()V", "", "adMarkup", "(Ljava/lang/String;)V", "Lcom/vungle/ads/VungleCSBData;", "csbData", "(Lcom/vungle/ads/VungleCSBData;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface Ad {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void load$default(Ad ad, String str, int i, Object obj) {
            if (obj != null) {
                d.u("Super calls with default arguments not supported in this target, function: load");
                return;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            ad.load(str);
        }
    }

    @Nullable
    Boolean canPlayAd();

    void load();

    void load(@NotNull VungleCSBData csbData);

    void load(@Nullable String adMarkup);
}
