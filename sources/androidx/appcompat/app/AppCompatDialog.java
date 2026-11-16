package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.KeyEventDispatcher;
import androidx.p003activity.ComponentDialog;
import com.ecffri.arrows.R;
import defpackage.h7;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class AppCompatDialog extends ComponentDialog implements AppCompatCallback {
    public AppCompatDelegate d;
    public final h7 e;

    /* JADX WARN: Type inference failed for: r2v2, types: [h7] */
    public AppCompatDialog(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.e = new KeyEventDispatcher.Component() { // from class: h7
            @Override // androidx.core.view.KeyEventDispatcher.Component
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.a.e(keyEvent);
            }
        };
        AppCompatDelegate appCompatDelegateC = c();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        appCompatDelegateC.A(i);
        appCompatDelegateC.o();
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public final void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public final void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public final ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    public final AppCompatDelegate c() {
        if (this.d == null) {
            AppCompatDelegate.SerialExecutor serialExecutor = AppCompatDelegate.a;
            this.d = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    @Override // androidx.p003activity.ComponentDialog, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().c(view, layoutParams);
    }

    public final void d() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().p();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return c().e(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().l();
    }

    @Override // androidx.p003activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().k();
        super.onCreate(bundle);
        c().o();
    }

    @Override // androidx.p003activity.ComponentDialog, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c().t();
    }

    @Override // androidx.p003activity.ComponentDialog, android.app.Dialog
    public final void setContentView(int i) {
        d();
        c().w(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().B(getContext().getString(i));
    }

    @Override // androidx.p003activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view) {
        d();
        c().x(view);
    }

    @Override // androidx.p003activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        c().y(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().B(charSequence);
    }
}
