package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.NativeAdBase;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
public interface NativeComponentTagApi {
    void tagView(View view, NativeAdBase.NativeComponentTag nativeComponentTag);
}
