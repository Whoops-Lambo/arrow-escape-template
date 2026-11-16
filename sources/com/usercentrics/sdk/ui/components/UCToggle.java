package com.usercentrics.sdk.ui.components;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.ecffri.arrows.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.ey1;
import defpackage.lm2;
import defpackage.nj2;
import defpackage.qx2;
import defpackage.rx2;
import defpackage.tx2;
import defpackage.wr0;
import defpackage.wv1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/usercentrics/sdk/ui/components/UCToggle;", "Landroidx/appcompat/widget/SwitchCompat;", "Lwv1;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function1;", "", "Laz2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lwr0;)V", "value", "getCurrentState", "()Z", "setCurrentState", "(Z)V", "currentState", "usercentrics-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UCToggle extends SwitchCompat implements wv1, CompoundButton.OnCheckedChangeListener {
    public static final /* synthetic */ int V = 0;
    public wr0 T;
    public ey1 U;

    @Override // defpackage.wv1
    public final void dispose() {
        this.U = null;
        this.T = lm2.m;
        setOnCheckedChangeListener(null);
    }

    @Override // defpackage.wv1
    public void setCurrentState(boolean z) {
        setOnCheckedChangeListener(null);
        setChecked(z);
        setOnCheckedChangeListener(this);
        setMinimumHeight(getResources().getDimensionPixelOffset(R.dimen.ucFirstLayerLegalLinksOrButtonsMinimumHeight));
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.T.invoke(Boolean.valueOf(z));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ey1 ey1Var = this.U;
        if (ey1Var != null) {
            setListener(null);
            ey1Var.b.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // defpackage.wv1
    public void setListener(@Nullable wr0 listener) {
        if (listener == null) {
            listener = lm2.o;
        }
        this.T = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCToggle(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.T = lm2.n;
        setOnCheckedChangeListener(this);
    }

    public final void e(rx2 rx2Var) {
        rx2Var.getClass();
        ey1 ey1Var = this.U;
        ey1 ey1Var2 = null;
        if (ey1Var != null) {
            setListener(null);
            ey1Var.b.remove(this);
        }
        setChecked(rx2Var.a);
        setEnabled(rx2Var.b);
        ey1 ey1Var3 = rx2Var.c;
        if (ey1Var3 != null) {
            ey1Var3.a(this);
            ey1Var2 = ey1Var3;
        }
        this.U = ey1Var2;
    }

    public final void f(qx2 qx2Var) {
        qx2Var.getClass();
        tx2 tx2Var = qx2Var.c;
        if (tx2Var == null) {
            return;
        }
        tx2.Companion.getClass();
        int[][] iArr = {tx2.g, tx2.h, tx2.i, tx2.j};
        int i = tx2Var.c;
        int[] iArr2 = {i, i, tx2Var.a, tx2Var.b};
        int i2 = tx2Var.f;
        int[] iArr3 = {i2, i2, tx2Var.d, tx2Var.e};
        setTrackTintList(new ColorStateList(iArr, iArr2));
        setThumbTintList(new ColorStateList(iArr, iArr3));
        setBackground(null);
        post(new nj2(this, 10));
    }

    @Override // defpackage.wv1
    public boolean getCurrentState() {
        return isChecked();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ey1 ey1Var = this.U;
        if (ey1Var != null) {
            ey1Var.a(this);
        }
    }
}
