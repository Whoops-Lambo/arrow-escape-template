package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ ImageView c;

    public /* synthetic */ o21(Uri uri, ImageView imageView) {
        this.a = 1;
        this.b = uri;
        this.c = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Uri uri = this.b;
        ImageView imageView = this.c;
        switch (i) {
            case 0:
                ImageViewUtils.b(imageView, uri);
                break;
            case 1:
                ImageViewUtils.a(uri, imageView);
                break;
            default:
                ImageViewUtils.setAndDownscaleBitmap(imageView, uri);
                break;
        }
    }

    public /* synthetic */ o21(ImageView imageView, Uri uri, int i) {
        this.a = i;
        this.c = imageView;
        this.b = uri;
    }
}
