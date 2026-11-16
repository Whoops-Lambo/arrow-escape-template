package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import defpackage.b43;
import defpackage.e3;
import defpackage.ei1;
import defpackage.fi1;
import defpackage.gi1;
import defpackage.hi1;
import defpackage.hr;
import defpackage.m93;
import defpackage.mu1;
import defpackage.r50;
import defpackage.uf1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo
public final class g<S> extends mu1 {
    public int b;
    public CalendarConstraints c;
    public Month d;
    public int e;
    public uf1 f;
    public RecyclerView g;
    public RecyclerView h;
    public View i;
    public View j;
    public View k;
    public View l;

    public final void c(Month month) {
        m mVar = (m) this.h.getAdapter();
        int iD = mVar.j.a.d(month);
        int iD2 = iD - mVar.j.a.d(this.d);
        int i = 0;
        boolean z = Math.abs(iD2) > 3;
        boolean z2 = iD2 > 0;
        this.d = month;
        if (z && z2) {
            this.h.scrollToPosition(iD - 3);
            this.h.post(new ei1(iD, i, this));
            return;
        }
        RecyclerView recyclerView = this.h;
        if (!z) {
            recyclerView.post(new ei1(iD, i, this));
        } else {
            recyclerView.scrollToPosition(iD + 3);
            this.h.post(new ei1(iD, i, this));
        }
    }

    public final void d(int i) {
        this.e = i;
        if (i == 2) {
            this.g.getLayoutManager().scrollToPosition(this.d.c - ((n) this.g.getAdapter()).j.c.a.c);
            this.k.setVisibility(0);
            this.l.setVisibility(8);
            this.i.setVisibility(8);
            this.j.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            this.i.setVisibility(0);
            this.j.setVisibility(0);
            c(this.d);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.b);
        this.f = new uf1(contextThemeWrapper, 2);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.c.a;
        int i3 = 0;
        int i4 = 1;
        if (h.f(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.ecffri.arrows.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.ecffri.arrows.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.ecffri.arrows.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.ecffri.arrows.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.ecffri.arrows.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.ecffri.arrows.R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = j.d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.ecffri.arrows.R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(com.ecffri.arrows.R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(com.ecffri.arrows.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.ecffri.arrows.R.id.mtrl_calendar_days_of_week);
        ViewCompat.z(gridView, new e3(2));
        int i6 = this.c.e;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new r50(i6) : new r50()));
        gridView.setNumColumns(month.d);
        gridView.setEnabled(false);
        this.h = (RecyclerView) viewInflate.findViewById(com.ecffri.arrows.R.id.mtrl_calendar_months);
        getContext();
        this.h.setLayoutManager(new fi1(this, i2, i2));
        this.h.setTag("MONTHS_VIEW_GROUP_TAG");
        m mVar = new m(contextThemeWrapper, this.c, new d(this));
        this.h.setAdapter(mVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.ecffri.arrows.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.ecffri.arrows.R.id.mtrl_calendar_year_selector_frame);
        this.g = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.g.setLayoutManager(new GridLayoutManager(integer, 1));
            this.g.setAdapter(new n(this));
            RecyclerView recyclerView2 = this.g;
            gi1 gi1Var = new gi1();
            b43.c(null);
            b43.c(null);
            recyclerView2.addItemDecoration(gi1Var);
        }
        if (viewInflate.findViewById(com.ecffri.arrows.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.ecffri.arrows.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.z(materialButton, new hr(this, i4));
            View viewFindViewById = viewInflate.findViewById(com.ecffri.arrows.R.id.month_navigation_previous);
            this.i = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.ecffri.arrows.R.id.month_navigation_next);
            this.j = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.k = viewInflate.findViewById(com.ecffri.arrows.R.id.mtrl_calendar_year_selector_frame);
            this.l = viewInflate.findViewById(com.ecffri.arrows.R.id.mtrl_calendar_day_selector_frame);
            d(1);
            materialButton.setText(this.d.c());
            this.h.addOnScrollListener(new e(this, mVar, materialButton));
            materialButton.setOnClickListener(new hi1(this, i3));
            this.j.setOnClickListener(new f(this, mVar));
            this.i.setOnClickListener(new c(this, mVar));
        }
        if (!h.f(contextThemeWrapper, R.attr.windowFullscreen)) {
            new PagerSnapHelper().attachToRecyclerView(this.h);
        }
        this.h.scrollToPosition(mVar.j.a.d(this.d));
        ViewCompat.z(this.h, new e3(3));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.b = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.c = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.d = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            } else {
                m93.b();
                return;
            }
        }
        m93.b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.d);
    }
}
