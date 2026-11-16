package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h40 extends NativeAd.Image {
    public final Uri a;

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final /* bridge */ /* synthetic */ Drawable getDrawable() {
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return 1.0d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.a;
    }

    public h40(Uri uri) {
        this.a = uri;
    }
}
