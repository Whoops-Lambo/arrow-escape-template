package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mo2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil/target/GenericViewTarget;", "Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class GenericViewTarget<T extends View> implements DefaultLifecycleObserver, mo2 {
    public boolean a;

    public abstract Drawable a();

    public abstract View b();

    public abstract void c(Drawable drawable);

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.a = true;
        e();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.a = false;
        e();
    }

    @Override // defpackage.mo2
    public final void d(Drawable drawable) {
        g(drawable);
    }

    public final void e() {
        Animatable animatable;
        Object objA = a();
        if (objA instanceof Animatable) {
            animatable = (Animatable) objA;
        } else {
            animatable = null;
        }
        if (animatable == null) {
            return;
        }
        if (this.a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    @Override // defpackage.mo2
    public final void f(Drawable drawable) {
        g(drawable);
    }

    public final void g(Drawable drawable) {
        Animatable animatable;
        Object objA = a();
        if (objA instanceof Animatable) {
            animatable = (Animatable) objA;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        c(drawable);
        e();
    }

    @Override // defpackage.mo2
    public final void m(Drawable drawable) {
        g(drawable);
    }
}
