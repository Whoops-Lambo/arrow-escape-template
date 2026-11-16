package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo
public class MenuAdapter extends BaseAdapter {
    public final MenuBuilder a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.c(getItem(i));
        return view;
    }

    public final void a() {
        MenuBuilder menuBuilder = this.a;
        MenuItemImpl menuItemImpl = menuBuilder.v;
        if (menuItemImpl != null) {
            menuBuilder.i();
            ArrayList arrayList = menuBuilder.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((MenuItemImpl) arrayList.get(i)) == menuItemImpl) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MenuItemImpl getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.d;
        MenuBuilder menuBuilder = this.a;
        if (z) {
            menuBuilder.i();
            arrayListL = menuBuilder.j;
        } else {
            arrayListL = menuBuilder.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (MenuItemImpl) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.d;
        MenuBuilder menuBuilder = this.a;
        if (z) {
            menuBuilder.i();
            arrayListL = menuBuilder.j;
        } else {
            arrayListL = menuBuilder.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    public MenuAdapter(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = menuBuilder;
        this.f = i;
        a();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
