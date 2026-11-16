package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ActionBar {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DisplayOptions {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NavigationMode {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnMenuVisibilityListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Deprecated
    public interface OnNavigationListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Deprecated
    public static abstract class Tab {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Deprecated
    public interface TabListener {
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public void g(boolean z) {
    }

    public abstract int h();

    public Context i() {
        return null;
    }

    public boolean j() {
        return false;
    }

    public void k() {
    }

    public void l() {
    }

    public boolean m(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean n(KeyEvent keyEvent) {
        return false;
    }

    public boolean o() {
        return false;
    }

    public void p(boolean z) {
    }

    public void q(boolean z) {
    }

    public void r(CharSequence charSequence) {
    }

    public ActionMode s(ActionMode.Callback callback) {
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int a;

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.a = 0;
            this.a = layoutParams.a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}
