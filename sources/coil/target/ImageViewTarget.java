package coil.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/target/ImageViewTarget;", "Lcoil/target/GenericViewTarget;", "Landroid/widget/ImageView;", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class ImageViewTarget extends GenericViewTarget<ImageView> {
    public final ImageView b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageViewTarget) {
            return s71.b(this.b, ((ImageViewTarget) obj).b);
        }
        return false;
    }

    @Override // coil.target.GenericViewTarget
    public final Drawable a() {
        return this.b.getDrawable();
    }

    @Override // coil.target.GenericViewTarget
    public final View b() {
        return this.b;
    }

    @Override // coil.target.GenericViewTarget
    public final void c(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public ImageViewTarget(ImageView imageView) {
        this.b = imageView;
    }
}
