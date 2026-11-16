package com.bytedance.sdk.openadsdk.rz;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class fi extends ViewGroup implements ra.rz {
    private final ra kgy;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    private Drawable ahm() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fAhm = gbb.ahm(getContext(), 5.0f);
        gradientDrawable.setCornerRadius(fAhm);
        gradientDrawable.setColor(Color.parseColor("#0D000000"));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(gbb.ahm(getContext(), 1.0f), Color.parseColor("#FE2C55"));
        gradientDrawable2.setCornerRadius(fAhm);
        gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // com.bytedance.sdk.openadsdk.rz.ra.rz
    public void kgy(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                if (ra.kgy.equals(filterWord)) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(filterWord.equals(childAt.getTag()));
                }
            }
        }
    }

    public fi(Context context, ra raVar) {
        super(context);
        this.kgy = raVar;
        raVar.kgy(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i10 != 0) {
                i5 = marginLayoutParams.leftMargin;
            } else {
                i5 = 0;
            }
            if (measuredWidth + i5 + i8 < i7) {
                i6 = i8 + i5;
            } else {
                i9 += marginLayoutParams.bottomMargin + measuredHeight;
                i6 = 0;
            }
            childAt.layout(i6, marginLayoutParams.topMargin + i9, i6 + measuredWidth, measuredHeight + i9);
            i8 = i6 + measuredWidth + marginLayoutParams.rightMargin;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        View.MeasureSpec.getMode(i);
        View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i, i2);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i7 != 0) {
                i3 = marginLayoutParams.leftMargin;
            } else {
                i3 = 0;
            }
            if (measuredWidth + i3 + i6 < size) {
                i4 = i6 + i3;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                i5 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i6 = i4 + measuredWidth + marginLayoutParams.rightMargin;
        }
        setMeasuredDimension(size, i5);
    }

    public void kgy(List<FilterWord> list) {
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            FilterWord filterWord = list.get(i);
            if (filterWord != null) {
                addView(ahm(filterWord));
            }
        }
    }

    private ColorStateList kgy() {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{Color.rgb(255, 44, 85), -16777216});
    }

    private View ahm(FilterWord filterWord) {
        TextView textView = new TextView(getContext());
        textView.setTag(filterWord);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int iAhm = gbb.ahm(getContext(), 8.0f);
        marginLayoutParams.leftMargin = iAhm;
        marginLayoutParams.bottomMargin = iAhm;
        textView.setTextColor(kgy());
        textView.setText(filterWord.getName());
        textView.setPadding(iAhm, iAhm, iAhm, iAhm);
        textView.setBackground(ahm());
        textView.setSelected(false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.rz.fi.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rz/fi$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_fi$1_onClick_8aedc5af67bc4a54893f034d8206281a(view);
            }

            public void safedk_fi$1_onClick_8aedc5af67bc4a54893f034d8206281a(View p0) {
                if (fi.this.kgy != null) {
                    if (p0.isSelected()) {
                        fi.this.kgy.kgy(ra.kgy);
                        return;
                    }
                    Object tag = p0.getTag();
                    if (tag instanceof FilterWord) {
                        fi.this.kgy.kgy((FilterWord) tag);
                    }
                }
            }
        });
        textView.setSelected(false);
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }
}
