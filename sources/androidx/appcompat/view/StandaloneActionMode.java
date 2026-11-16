package androidx.appcompat.view;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo
public class StandaloneActionMode extends ActionMode implements MenuBuilder.Callback {
    public Context c;
    public ActionBarContextView d;
    public ActionMode.Callback e;
    public WeakReference f;
    public boolean g;
    public MenuBuilder h;

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.e.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.d(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final View d() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final MenuBuilder e() {
        return this.h;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final MenuInflater f() {
        return new SupportMenuInflater(this.d.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence h() {
        return this.d.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void i() {
        this.e.c(this, this.h);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final boolean j() {
        return this.d.s;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void k(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void l(int i) {
        m(this.c.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void m(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void n(int i) {
        o(this.c.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void o(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void p(boolean z) {
        this.b = z;
        this.d.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final void b(MenuBuilder menuBuilder) {
        i();
        this.d.i();
    }
}
