package com.unity3d.player;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.singular.sdk.internal.Constants;
import defpackage.hi3;
import defpackage.mi3;
import defpackage.pf0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class A extends Dialog implements View.OnClickListener {
    public final Context a;
    public final UnityPlayerForActivityOrService b;
    public pf0 c;
    public F d;
    public mi3 e;

    public final Rect a() {
        Rect rect = new Rect();
        FrameLayout frameLayout = this.b.getFrameLayout();
        frameLayout.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        Point point = new Point(rect.left - iArr[0], rect.height() - this.c.getHeight());
        Point point2 = new Point();
        getWindow().getWindowManager().getDefaultDisplay().getSize(point2);
        int height = frameLayout.getHeight();
        int i = height - point2.y;
        int i2 = height - point.y;
        int height2 = this.c.getHeight() + i;
        UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.b;
        if (i2 != height2) {
            unityPlayerForActivityOrService.reportSoftInputIsVisible(true);
        } else {
            unityPlayerForActivityOrService.reportSoftInputIsVisible(false);
        }
        return new Rect(point.x, point.y, this.c.getWidth(), i2);
    }

    public pf0 createSoftInputView(EditText editText) {
        pf0 pf0Var = new pf0(this.a, editText);
        pf0Var.a.setOnClickListener(this);
        setContentView(pf0Var);
        return pf0Var;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.d.e || !(motionEvent.getAction() == 4 || this.d.d)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        hi3 hi3Var;
        Runnable runnable;
        mi3 mi3Var = this.e;
        if (mi3Var == null || (hi3Var = mi3Var.a) == null || (runnable = hi3Var.a) == null) {
            return;
        }
        runnable.run();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        F f = this.d;
        f.a(f.b(), false);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        mi3 mi3Var = this.e;
        if (mi3Var != null) {
            mi3Var.unregisterOnBackPressedCallback();
            this.e = null;
        }
        super.onStop();
    }

    public A(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context);
        this.c = null;
        this.d = null;
        this.e = null;
        this.a = context;
        this.b = unityPlayerForActivityOrService;
    }

    public final void a(F f, boolean z, boolean z2) {
        this.d = f;
        Window window = getWindow();
        window.requestFeature(1);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.x = 0;
        attributes.y = 0;
        window.setAttributes(attributes);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.c = createSoftInputView(this.d.c);
        window.setLayout(-1, -2);
        window.clearFlags(2);
        if (!z2) {
            window.addFlags(32);
            window.addFlags(Constants.REFERRER_LINK_MAX_RESPONSE_CHARS);
        }
        a(z);
        getWindow().setSoftInputMode(5);
        this.e = C5276s.a(this, 1000000, new RunnableC5290z(this));
    }

    public final void a(boolean z) {
        pf0 pf0Var = this.c;
        if (z) {
            EditText editText = pf0Var.b;
            EditText editText2 = pf0Var.b;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) editText.getLayoutParams();
            layoutParams.height = 1;
            editText2.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) pf0Var.a.getLayoutParams();
            layoutParams2.height = 1;
            pf0Var.a.setLayoutParams(layoutParams2);
            Rect rect = pf0Var.d;
            pf0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            editText2.setBackgroundColor(0);
            pf0Var.setBackgroundColor(0);
        } else {
            pf0Var.setVisibility(0);
            EditText editText3 = pf0Var.b;
            Rect rect2 = pf0Var.c;
            pf0Var.setPadding(rect2.left, rect2.top, rect2.right, rect2.bottom);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) editText3.getLayoutParams();
            layoutParams3.height = -2;
            editText3.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) pf0Var.a.getLayoutParams();
            layoutParams4.height = -2;
            pf0Var.a.setLayoutParams(layoutParams4);
        }
        pf0Var.invalidate();
        pf0Var.requestLayout();
    }
}
