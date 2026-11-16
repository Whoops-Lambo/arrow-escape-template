package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.share.model.SharePhoto;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class pe2 extends wt0 {
    public Bitmap b;
    public Uri c;
    public boolean d;
    public String e;

    public final void u(SharePhoto sharePhoto) {
        if (sharePhoto == null) {
            return;
        }
        Bundle bundle = sharePhoto.a;
        bundle.getClass();
        ((Bundle) this.a).putAll(bundle);
        this.b = sharePhoto.b;
        this.c = sharePhoto.c;
        this.d = sharePhoto.d;
        this.e = sharePhoto.e;
    }
}
