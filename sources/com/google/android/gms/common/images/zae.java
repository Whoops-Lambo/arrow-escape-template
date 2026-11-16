package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zai;
import defpackage.hj3;
import defpackage.ij3;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zae extends zag {
    private final WeakReference zac;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zae)) {
            return false;
        }
        ImageView imageView = (ImageView) this.zac.get();
        ImageView imageView2 = (ImageView) ((zae) obj).zac.get();
        return (imageView2 == null || imageView == null || !Objects.equal(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }

    public zae(ImageView imageView, int i) {
        super(Uri.EMPTY, i);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }

    @Override // com.google.android.gms.common.images.zag
    public final void zaa(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageView imageView = (ImageView) this.zac.get();
        if (imageView != null) {
            if (!z2 && !z3 && (imageView instanceof zai)) {
                throw null;
            }
            boolean z4 = (z2 || z) ? false : true;
            if (z4) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof com.google.android.gms.internal.base.zah) {
                    drawable2 = ((com.google.android.gms.internal.base.zah) drawable2).k;
                }
                com.google.android.gms.internal.base.zah zahVar = new com.google.android.gms.internal.base.zah(null);
                if (drawable2 == null) {
                    drawable2 = hj3.a;
                }
                zahVar.j = drawable2;
                drawable2.setCallback(zahVar);
                ij3 ij3Var = zahVar.i;
                ij3Var.b = drawable2.getChangingConfigurations() | ij3Var.b;
                if (drawable == null) {
                    drawable = hj3.a;
                }
                zahVar.k = drawable;
                drawable.setCallback(zahVar);
                ij3Var.b = drawable.getChangingConfigurations() | ij3Var.b;
                drawable = zahVar;
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof zai) {
                throw null;
            }
            if (drawable == null || !z4) {
                return;
            }
            com.google.android.gms.internal.base.zah zahVar2 = (com.google.android.gms.internal.base.zah) drawable;
            zahVar2.c = zahVar2.d;
            zahVar2.f = 0;
            zahVar2.e = 250;
            zahVar2.a = 1;
            zahVar2.invalidateSelf();
        }
    }

    public zae(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }
}
