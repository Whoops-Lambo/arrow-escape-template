package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import com.ecffri.arrows.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RestrictTo
public class ListMenuPresenter implements MenuPresenter, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public MenuBuilder c;
    public ExpandedMenuView d;
    public MenuPresenter.Callback e;
    public MenuAdapter f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class MenuAdapter extends BaseAdapter {
        public int a = -1;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        public MenuAdapter() {
            a();
        }

        public final void a() {
            MenuBuilder menuBuilder = ListMenuPresenter.this.c;
            MenuItemImpl menuItemImpl = menuBuilder.v;
            if (menuItemImpl != null) {
                menuBuilder.i();
                ArrayList arrayList = menuBuilder.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((MenuItemImpl) arrayList.get(i)) == menuItemImpl) {
                        this.a = i;
                        return;
                    }
                }
            }
            this.a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MenuItemImpl getItem(int i) {
            MenuBuilder menuBuilder = ListMenuPresenter.this.c;
            menuBuilder.i();
            ArrayList arrayList = menuBuilder.j;
            int i2 = this.a;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return (MenuItemImpl) arrayList.get(i);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            MenuBuilder menuBuilder = ListMenuPresenter.this.c;
            menuBuilder.i();
            int size = menuBuilder.j.size();
            return this.a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ListMenuPresenter.this.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((MenuView.ItemView) view).c(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean c(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void h(MenuPresenter.Callback callback) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean i(MenuItemImpl menuItemImpl) {
        return false;
    }

    public final ListAdapter a() {
        if (this.f == null) {
            this.f = new MenuAdapter();
        }
        return this.f;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void b(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.e;
        if (callback != null) {
            callback.b(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void d(boolean z) {
        MenuAdapter menuAdapter = this.f;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void f(Context context, MenuBuilder menuBuilder) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = menuBuilder;
        MenuAdapter menuAdapter = this.f;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    public final MenuView g(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.b.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f == null) {
                this.f = new MenuAdapter();
            }
            this.d.setAdapter((ListAdapter) this.f);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }

    public ListMenuPresenter(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean j(SubMenuBuilder subMenuBuilder) {
        boolean zHasVisibleItems = subMenuBuilder.hasVisibleItems();
        Context context = subMenuBuilder.a;
        if (!zHasVisibleItems) {
            return false;
        }
        MenuDialogHelper menuDialogHelper = new MenuDialogHelper();
        menuDialogHelper.a = subMenuBuilder;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(builder.getContext());
        menuDialogHelper.c = listMenuPresenter;
        listMenuPresenter.e = menuDialogHelper;
        subMenuBuilder.b(listMenuPresenter, context);
        ListAdapter listAdapterA = menuDialogHelper.c.a();
        AlertController.AlertParams alertParams = builder.a;
        alertParams.o = listAdapterA;
        alertParams.p = menuDialogHelper;
        View view = subMenuBuilder.o;
        if (view != null) {
            alertParams.e = view;
        } else {
            alertParams.c = subMenuBuilder.n;
            builder.setTitle(subMenuBuilder.m);
        }
        alertParams.m = menuDialogHelper;
        AlertDialog alertDialogCreate = builder.create();
        menuDialogHelper.b = alertDialogCreate;
        alertDialogCreate.setOnDismissListener(menuDialogHelper);
        WindowManager.LayoutParams attributes = menuDialogHelper.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        menuDialogHelper.b.show();
        MenuPresenter.Callback callback = this.e;
        if (callback != null) {
            callback.c(subMenuBuilder);
            return true;
        }
        return true;
    }
}
