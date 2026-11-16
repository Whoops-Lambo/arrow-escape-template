package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
public interface MediaViewApi extends AdComponentViewApiProvider {
    void destroy();

    View getAdContentsView();

    int getMediaHeight();

    int getMediaWidth();

    int getVideoDuration();

    void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView);

    boolean isVideoContent();

    void setListener(@Nullable MediaViewListener mediaViewListener);

    void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer);
}
