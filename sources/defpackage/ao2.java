package defpackage;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ao2 implements ViewPager.OnAdapterChangeListener {
    public boolean a;
    public final /* synthetic */ TabLayout b;

    @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
    public final void a(ViewPager viewPager, PagerAdapter pagerAdapter) {
        TabLayout tabLayout = this.b;
        if (tabLayout.N == viewPager) {
            tabLayout.h(pagerAdapter, this.a);
        }
    }

    public ao2(TabLayout tabLayout) {
        this.b = tabLayout;
    }
}
