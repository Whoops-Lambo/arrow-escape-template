package com.usercentrics.sdk.ui.components;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a63;
import defpackage.a7;
import defpackage.cm2;
import defpackage.e3;
import defpackage.ek2;
import defpackage.h00;
import defpackage.jt2;
import defpackage.ot2;
import defpackage.sr0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/usercentrics/sdk/ui/components/UCButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/usercentrics/sdk/ui/components/UCImageView;", "kotlin.jvm.PlatformType", "s", "Lgd1;", "getUcButtonBackground", "()Lcom/usercentrics/sdk/ui/components/UCImageView;", "ucButtonBackground", "Lcom/usercentrics/sdk/ui/components/UCTextView;", "t", "getUcButtonText", "()Lcom/usercentrics/sdk/ui/components/UCTextView;", "ucButtonText", "", "value", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "usercentrics-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UCButton extends ConstraintLayout {
    public static final /* synthetic */ int u = 0;
    public final cm2 s;
    public final cm2 t;

    private final UCImageView getUcButtonBackground() {
        return (UCImageView) this.s.getValue();
    }

    private final UCTextView getUcButtonText() {
        Object value = this.t.getValue();
        value.getClass();
        return (UCTextView) value;
    }

    public static final GradientDrawable k(int i, UCButton uCButton, int i2, Integer num, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setColor(i2);
        if (num != null) {
            int iIntValue = num.intValue();
            Context context = uCButton.getContext();
            context.getClass();
            gradientDrawable.setStroke((int) ek2.k(context, i3), iIntValue);
        }
        return gradientDrawable;
    }

    public final void m(ot2 ot2Var, sr0 sr0Var) {
        ot2Var.getClass();
        int i = ot2Var.c;
        String str = ot2Var.a;
        setText(str);
        a63.b(this, str);
        setOnClickListener(new a7(sr0Var, 29));
        ViewCompat.z(this, new e3(0));
        setFocusable(true);
        Context context = getContext();
        context.getClass();
        setMinimumHeight((int) ek2.k(context, 40.0f));
        getUcButtonText().setLetterSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Integer num = ot2Var.b;
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = ot2Var.i;
            Integer num3 = ot2Var.j;
            int iIntValue2 = num3 != null ? num3.intValue() : 1;
            Context context2 = getContext();
            context2.getClass();
            int iK = (int) ek2.k(context2, i);
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            Drawable background = viewGroup != null ? viewGroup.getBackground() : null;
            ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
            int color = colorDrawable != null ? colorDrawable.getColor() : -1;
            if (Color.alpha(iIntValue) < 255) {
                iIntValue = ColorUtils.d(iIntValue, color);
            }
            int[] iArr = {-1, -16777216, -65536, -16711936, -256, -16776961};
            int i2 = iArr[0];
            double d = -1.0d;
            int i3 = 0;
            for (int i4 = 6; i3 < i4; i4 = 6) {
                int i5 = iArr[i3];
                int[] iArr2 = iArr;
                int i6 = iIntValue;
                double dMin = Math.min(ColorUtils.b(i5, iIntValue), ColorUtils.b(i5, color));
                if (dMin > d) {
                    d = dMin;
                    i2 = i5;
                }
                i3++;
                iArr = iArr2;
                iIntValue = i6;
            }
            GradientDrawable gradientDrawableK = k(iK, this, iIntValue, num2, iIntValue2);
            GradientDrawable gradientDrawableK2 = k(iK, this, iIntValue, Integer.valueOf(i2), 4);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawableK2);
            stateListDrawable.addState(new int[0], gradientDrawableK);
            setBackground(stateListDrawable);
        } else {
            h00.c(i, this);
        }
        UCTextView ucButtonText = getUcButtonText();
        ucButtonText.setTypeface(ot2Var.h);
        ucButtonText.setTextSize(2, ot2Var.e);
        ucButtonText.setAllCaps(ot2Var.f);
        Integer num4 = ot2Var.d;
        if (num4 != null) {
            ucButtonText.setTextColor(num4.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.s = new cm2(new jt2(this, 0));
        this.t = new cm2(new jt2(this, 1));
        LayoutInflater.from(getContext()).inflate(com.ecffri.arrows.R.layout.uc_button, this);
    }

    @NotNull
    public final CharSequence getText() {
        CharSequence text = getUcButtonText().getText();
        text.getClass();
        return text;
    }

    public final void setText(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        getUcButtonText().setText(charSequence);
    }
}
