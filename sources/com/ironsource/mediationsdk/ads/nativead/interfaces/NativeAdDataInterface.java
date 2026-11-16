package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public interface NativeAdDataInterface {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Image {

        @Nullable
        private final Drawable a;

        @Nullable
        private final Uri b;

        @Nullable
        public final Drawable getDrawable() {
            return this.a;
        }

        @Nullable
        public final Uri getUri() {
            return this.b;
        }

        public Image(@Nullable Drawable drawable, @Nullable Uri uri) {
            this.a = drawable;
            this.b = uri;
        }
    }

    @Nullable
    String getAdvertiser();

    @Nullable
    String getBody();

    @Nullable
    String getCallToAction();

    @Nullable
    Image getIcon();

    @Nullable
    String getTitle();
}
