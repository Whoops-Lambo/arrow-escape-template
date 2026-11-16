package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RestrictTo
public class AppCompatImageHelper {
    public final ImageView a;
    public TintInfo b;
    public int c = 0;

    public final void a() {
        TintInfo tintInfo;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            DrawableUtils.a(drawable);
        }
        if (drawable == null || (tintInfo = this.b) == null) {
            return;
        }
        AppCompatDrawableManager.e(drawable, tintInfo, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = R.styleable.f;
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, iArr, i);
        TypedArray typedArray = tintTypedArrayE.b;
        ViewCompat.y(imageView, imageView.getContext(), iArr, attributeSet, tintTypedArrayE.b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AppCompatResources.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                DrawableUtils.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(tintTypedArrayE.a(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(DrawableUtils.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            tintTypedArrayE.f();
        }
    }

    public AppCompatImageHelper(ImageView imageView) {
        this.a = imageView;
    }
}
