package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.ecffri.arrows.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xg0 extends LinearLayout {
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton g;
    public final k90 h;
    public int i;
    public final LinkedHashSet j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public CharSequence p;
    public final AppCompatTextView q;
    public boolean r;
    public EditText s;
    public final AccessibilityManager t;
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener u;
    public final ug0 v;

    public xg0(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.i = 0;
        this.j = new LinkedHashSet();
        this.v = new ug0(this);
        vg0 vg0Var = new vg0(this);
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.g = checkableImageButtonA2;
        k90 k90Var = new k90();
        k90Var.c = new SparseArray();
        k90Var.d = this;
        TypedArray typedArray = tintTypedArray.b;
        k90Var.a = typedArray.getResourceId(28, 0);
        k90Var.b = typedArray.getResourceId(52, 0);
        this.h = k90Var;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.q = appCompatTextView;
        TypedArray typedArray2 = tintTypedArray.b;
        if (typedArray2.hasValue(38)) {
            this.d = ni1.b(getContext(), tintTypedArray, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.e = m63.c(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(tintTypedArray.b(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = ViewCompat.a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.k = ni1.b(getContext(), tintTypedArray, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.l = m63.c(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.k = ni1.b(getContext(), tintTypedArray, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.l = m63.c(typedArray2.getInt(55, -1), null);
            }
            g(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            d.r("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.m) {
            this.m = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeP = j7.P(typedArray2.getInt(31, -1));
            this.n = scaleTypeP;
            checkableImageButtonA2.setScaleType(scaleTypeP);
            checkableImageButtonA.setScaleType(scaleTypeP);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            appCompatTextView.setTextColor(tintTypedArray.a(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.p = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.e0.add(vg0Var);
        if (textInputLayout.d != null) {
            vg0Var.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new wg0(this));
    }

    public final yg0 b() {
        yg0 q30Var;
        int i = this.i;
        k90 k90Var = this.h;
        SparseArray sparseArray = (SparseArray) k90Var.c;
        yg0 yg0Var = (yg0) sparseArray.get(i);
        if (yg0Var != null) {
            return yg0Var;
        }
        xg0 xg0Var = (xg0) k90Var.d;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                q30Var = new q30(xg0Var, i2);
            } else if (i == 1) {
                q30Var = new fu1(xg0Var, k90Var.b);
            } else if (i == 2) {
                q30Var = new cs(xg0Var);
            } else {
                if (i != 3) {
                    d.r(pv1.k(i, "Invalid end icon mode: "));
                    return null;
                }
                q30Var = new we0(xg0Var);
            }
        } else {
            q30Var = new q30(xg0Var, 0);
        }
        sparseArray.append(i, q30Var);
        return q30Var;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        yg0 yg0VarB = b();
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.u;
        AccessibilityManager accessibilityManager = this.t;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            AccessibilityManagerCompat.b(accessibilityManager, touchExplorationStateChangeListener);
        }
        this.u = null;
        yg0VarB.r();
        this.i = i;
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            m93.b();
            return;
        }
        h(i != 0);
        yg0 yg0VarB2 = b();
        int iD = this.h.a;
        if (iD == 0) {
            iD = yg0VarB2.d();
        }
        Drawable drawableA = iD != 0 ? AppCompatResources.a(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.g;
        checkableImageButton.setImageDrawable(drawableA);
        TextInputLayout textInputLayout = this.a;
        if (drawableA != null) {
            j7.M(textInputLayout, checkableImageButton, this.k, this.l);
            j7.X(textInputLayout, checkableImageButton, this.k);
        }
        int iC = yg0VarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(yg0VarB2.j());
        if (!yg0VarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        yg0VarB2.q();
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = yg0VarB2.h();
        this.u = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = ViewCompat.a;
            if (isAttachedToWindow()) {
                AccessibilityManagerCompat.a(accessibilityManager, this.u);
            }
        }
        View.OnClickListener onClickListenerF = yg0VarB2.f();
        View.OnLongClickListener onLongClickListener = this.o;
        checkableImageButton.setOnClickListener(onClickListenerF);
        j7.a0(checkableImageButton, onLongClickListener);
        EditText editText = this.s;
        if (editText != null) {
            yg0VarB2.l(editText);
            j(yg0VarB2);
        }
        j7.M(textInputLayout, checkableImageButton, this.k, this.l);
        f(true);
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        j7.M(this.a, checkableImageButton, this.d, this.e);
    }

    public final void j(yg0 yg0Var) {
        if (this.s == null) {
            return;
        }
        if (yg0Var.e() != null) {
            this.s.setOnFocusChangeListener(yg0Var.e());
        }
        if (yg0Var.g() != null) {
            this.g.setOnFocusChangeListener(yg0Var.g());
        }
    }

    public final void k() {
        this.b.setVisibility((this.g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.p == null || this.r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.j.q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.d == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = ViewCompat.a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = ViewCompat.a;
        this.q.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.q;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.p == null || this.r) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.a.q();
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (ni1.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final int c() {
        int marginStart;
        if (!d() && !e()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        WeakHashMap weakHashMap = ViewCompat.a;
        return this.q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        yg0 yg0VarB = b();
        boolean zJ = yg0VarB.j();
        CheckableImageButton checkableImageButton = this.g;
        boolean z4 = true;
        if (zJ && (z3 = checkableImageButton.d) != yg0VarB.k()) {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        } else {
            z2 = false;
        }
        if ((yg0VarB instanceof we0) && (zIsActivated = checkableImageButton.isActivated()) != ((we0) yg0VarB).l) {
            checkableImageButton.setActivated(!zIsActivated);
        } else {
            z4 = z2;
        }
        if (!z && !z4) {
            return;
        }
        j7.X(this.a, checkableImageButton, this.k);
    }

    public final void h(boolean z) {
        int i;
        if (d() != z) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            this.g.setVisibility(i);
            k();
            m();
            this.a.q();
        }
    }
}
