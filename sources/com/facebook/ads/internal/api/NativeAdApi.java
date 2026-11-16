package com.facebook.ads.internal.api;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdOptionsViewPosition;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
public interface NativeAdApi {
    NativeAd.AdCreativeType getAdCreativeType();

    NativeAdOptionsViewPosition getPreferredAdOptionsViewPosition();

    VideoAutoplayBehavior getVideoAutoplayBehavior();

    void registerViewForInteraction(View view, MediaView mediaView);

    void registerViewForInteraction(View view, MediaView mediaView, @Nullable ImageView imageView);

    void registerViewForInteraction(View view, MediaView mediaView, @Nullable ImageView imageView, @Nullable List<View> list);

    void registerViewForInteraction(View view, MediaView mediaView, @Nullable MediaView mediaView2);

    void registerViewForInteraction(View view, MediaView mediaView, @Nullable MediaView mediaView2, @Nullable List<View> list);

    void registerViewForInteraction(View view, MediaView mediaView, @Nullable List<View> list);

    void setPreferredAdOptionsViewPosition(NativeAdOptionsViewPosition nativeAdOptionsViewPosition);
}
