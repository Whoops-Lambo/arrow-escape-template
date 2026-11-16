package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@RestrictTo
public class SupportActionModeWrapper extends android.view.ActionMode {
    public final Context a;
    public final ActionMode b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public static class CallbackWrapper implements ActionMode.Callback {
        public final android.view.ActionMode.Callback a;
        public final Context b;
        public final ArrayList c = new ArrayList();
        public final SimpleArrayMap d = new SimpleArrayMap(0);

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final void d(ActionMode actionMode) {
            this.a.onDestroyActionMode(e(actionMode));
        }

        public final SupportActionModeWrapper e(ActionMode actionMode) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                SupportActionModeWrapper supportActionModeWrapper = (SupportActionModeWrapper) arrayList.get(i);
                if (supportActionModeWrapper != null && supportActionModeWrapper.b == actionMode) {
                    return supportActionModeWrapper;
                }
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.b, actionMode);
            arrayList.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }

        public CallbackWrapper(Context context, android.view.ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean a(ActionMode actionMode, Menu menu) {
            SupportActionModeWrapper supportActionModeWrapperE = e(actionMode);
            SimpleArrayMap simpleArrayMap = this.d;
            Menu menuWrapperICS = (Menu) simpleArrayMap.get(menu);
            if (menuWrapperICS == null) {
                menuWrapperICS = new MenuWrapperICS(this.b, (SupportMenu) menu);
                simpleArrayMap.put(menu, menuWrapperICS);
            }
            return this.a.onCreateActionMode(supportActionModeWrapperE, menuWrapperICS);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean b(ActionMode actionMode, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(actionMode), new MenuItemWrapperICS(this.b, (SupportMenuItem) menuItem));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean c(ActionMode actionMode, Menu menu) {
            SupportActionModeWrapper supportActionModeWrapperE = e(actionMode);
            SimpleArrayMap simpleArrayMap = this.d;
            Menu menuWrapperICS = (Menu) simpleArrayMap.get(menu);
            if (menuWrapperICS == null) {
                menuWrapperICS = new MenuWrapperICS(this.b, (SupportMenu) menu);
                simpleArrayMap.put(menu, menuWrapperICS);
            }
            return this.a.onPrepareActionMode(supportActionModeWrapperE, menuWrapperICS);
        }
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuWrapperICS(this.a, this.b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.p(z);
    }

    public SupportActionModeWrapper(Context context, ActionMode actionMode) {
        this.a = context;
        this.b = actionMode;
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.n(i);
    }
}
